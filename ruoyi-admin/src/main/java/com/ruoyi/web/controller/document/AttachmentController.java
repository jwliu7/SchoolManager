package com.ruoyi.web.controller.document;

import java.util.List;

import com.ruoyi.common.json.JSONObject;
import com.ruoyi.system.domain.Attachment;
import com.ruoyi.system.service.IAttachmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.web.core.base.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;

/**
 * 附件 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-12-26
 */
@Controller
@RequestMapping("/document/attachment")
public class AttachmentController extends BaseController
{
    private String prefix = "document/attachment";
	
	@Autowired
	private IAttachmentService attachmentService;
	
	@RequiresPermissions("document:attachment:view")
	@GetMapping()
	public String attachment()
	{
	    return prefix + "/attachment";
	}


	@PostMapping("/load")
	@ResponseBody
	public String load(Attachment attachment)
	{
		List<Attachment> alist = attachmentService.selectAttachmentList(attachment);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("success", true);
		jsonObject.put("alist", alist);
		return jsonObject.toString();
	}
	@PostMapping("/delete")
	@ResponseBody
	public AjaxResult delete(String ids)
	{
		try
		{
			return toAjax(attachmentService.deleteAttachmentByIds(ids));
		}
		catch (Exception e)
		{
			return error(e.getMessage());
		}
	}

	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(Attachment attachment)
	{
		return toAjax(attachmentService.insertAttachment(attachment));
	}

	/**
	 * 查询附件列表
	 */
	@RequiresPermissions("document:attachment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Attachment attachment)
	{
		startPage();
        List<Attachment> list = attachmentService.selectAttachmentList(attachment);
		return getDataTable(list);
	}
	
	/**
	 * 新增附件
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存附件
	 */
	@RequiresPermissions("document:attachment:add")
	@Log(title = "附件", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Attachment attachment)
	{		
		return toAjax(attachmentService.insertAttachment(attachment));
	}

	/**
	 * 修改附件
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Attachment attachment = attachmentService.selectAttachmentById(id);
		mmap.put("attachment", attachment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存附件
	 */
	@RequiresPermissions("document:attachment:edit")
	@Log(title = "附件", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Attachment attachment)
	{		
		return toAjax(attachmentService.updateAttachment(attachment));
	}
	
	/**
	 * 删除附件
	 */
	@RequiresPermissions("document:attachment:remove")
	@Log(title = "附件", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(attachmentService.deleteAttachmentByIds(ids));
	}
	
}
