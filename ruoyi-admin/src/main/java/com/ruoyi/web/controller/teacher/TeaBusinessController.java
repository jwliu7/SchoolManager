package com.ruoyi.web.controller.teacher;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.TeaBusiness;
import com.ruoyi.system.service.TeaBusinessService;
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
 * 教师业务 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/teacher/business")
public class TeaBusinessController extends BaseController
{
    private String prefix = "teacher/business";
	
	@Autowired
	private TeaBusinessService businessService;
	
	@RequiresPermissions("teacher:business:view")
	@GetMapping()
	public String business()
	{
	    return prefix + "/business";
	}
	
	/**
	 * 查询教师业务列表
	 */
	@RequiresPermissions("teacher:business:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TeaBusiness business)
	{
		startPage();
        List<TeaBusiness> list = businessService.selectBusinessList(business);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:business:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(TeaBusiness business)
	{
		List<TeaBusiness> list = businessService.selectBusinessList(business);
		ExcelUtil<TeaBusiness> util = new ExcelUtil<TeaBusiness>(TeaBusiness.class);
		return util.exportExcel(list, "business");
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:business:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(TeaBusiness business)
	{
		List<TeaBusiness> list = businessService.selectBusinessList(business);
		ExcelUtil<TeaBusiness> util = new ExcelUtil<TeaBusiness>(TeaBusiness.class);
		return util.exportExcel(list, "business");
	}
	
	/**
	 * 新增教师业务
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存教师业务
	 */
	@RequiresPermissions("teacher:business:add")
	@Log(title = "教师业务", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TeaBusiness business)
	{		
		return toAjax(businessService.insertBusiness(business));
	}

	/**
	 * 修改教师业务
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		TeaBusiness business = businessService.selectBusinessById(id);
		mmap.put("business", business);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存教师业务
	 */
	@RequiresPermissions("teacher:business:edit")
	@Log(title = "教师业务", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TeaBusiness business)
	{		
		return toAjax(businessService.updateBusiness(business));
	}
	
	/**
	 * 删除教师业务
	 */
	@RequiresPermissions("teacher:business:remove")
	@Log(title = "教师业务", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(businessService.deleteBusinessByIds(ids));
	}
	
}
