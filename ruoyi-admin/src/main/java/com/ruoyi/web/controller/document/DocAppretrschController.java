package com.ruoyi.web.controller.document;

import java.util.List;

import com.ruoyi.system.domain.DocAppretrsch;
import com.ruoyi.system.service.IDocAppretrschService;
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
 * 上传的文件 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/document/appretrsch")
public class DocAppretrschController extends BaseController
{
    private String prefix = "document/appretrsch";
	
	@Autowired
	private IDocAppretrschService appretrschService;
	
	@RequiresPermissions("document:appretrsch:view")
	@GetMapping()
	public String appretrsch()
	{
	    return prefix + "/appretrsch";
	}
	
	/**
	 * 查询上传的文件列表
	 */
	@RequiresPermissions("document:appretrsch:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DocAppretrsch appretrsch)
	{
		startPage();
        List<DocAppretrsch> list = appretrschService.selectAppretrschList(appretrsch);
		return getDataTable(list);
	}
	
	/**
	 * 新增上传的文件
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存上传的文件
	 */
	@RequiresPermissions("document:appretrsch:add")
	@Log(title = "上传的文件", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DocAppretrsch appretrsch)
	{		
		return toAjax(appretrschService.insertAppretrsch(appretrsch));
	}

	/**
	 * 修改上传的文件
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		DocAppretrsch appretrsch = appretrschService.selectAppretrschById(id);
		mmap.put("appretrsch", appretrsch);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存上传的文件
	 */
	@RequiresPermissions("document:appretrsch:edit")
	@Log(title = "上传的文件", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DocAppretrsch appretrsch)
	{		
		return toAjax(appretrschService.updateAppretrsch(appretrsch));
	}
	
	/**
	 * 删除上传的文件
	 */
	@RequiresPermissions("document:appretrsch:remove")
	@Log(title = "上传的文件", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appretrschService.deleteAppretrschByIds(ids));
	}
	
}
