package com.ruoyi.web.controller.classroom;

import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.Multimedia;
import com.ruoyi.system.service.IMultimediaService;
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
 * 多媒体教室 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/classrom/multimedia")
public class MultimediaController extends BaseController
{
    private String prefix = "classrom/multimedia";
	
	@Autowired
	private IMultimediaService multimediaService;
	
	@RequiresPermissions("classrom:multimedia:view")
	@GetMapping()
	public String multimedia()
	{
	    return prefix + "/multimedia";
	}
	
	/**
	 * 查询多媒体教室列表
	 */
	@RequiresPermissions("classrom:multimedia:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Multimedia multimedia)
	{
		startPage();
        List<Multimedia> list = multimediaService.selectMultimediaList(multimedia);
		return getDataTable(list);
	}
	
	/**
	 * 新增多媒体教室
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存多媒体教室
	 */
	@RequiresPermissions("classrom:multimedia:add")
	@Log(title = "多媒体教室", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Multimedia multimedia)
	{		
		return toAjax(multimediaService.insertMultimedia(multimedia));
	}

	/**
	 * 修改多媒体教室
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Multimedia multimedia = multimediaService.selectMultimediaById(id);
		mmap.put("multimedia", multimedia);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存多媒体教室
	 */
	@RequiresPermissions("classrom:multimedia:edit")
	@Log(title = "多媒体教室", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Multimedia multimedia)
	{
		multimedia.setUpdateBy(ShiroUtils.getLoginName());
		return toAjax(multimediaService.updateMultimedia(multimedia));
	}

	/**
	 * 删除多媒体教室
	 */
	@RequiresPermissions("classrom:multimedia:remove")
	@Log(title = "多媒体教室", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(multimediaService.deleteMultimediaByIds(ids));
	}
	
}
