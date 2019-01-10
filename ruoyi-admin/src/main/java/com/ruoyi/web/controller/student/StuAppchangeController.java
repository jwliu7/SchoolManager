package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.system.domain.StuAppchange;
import com.ruoyi.system.service.IStuAppchangeService;
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
 * 学生学籍变更 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/appchange")
public class StuAppchangeController extends BaseController
{
    private String prefix = "student/appchange";
	
	@Autowired
	private IStuAppchangeService appchangeService;
	
	@RequiresPermissions("student:appchange:view")
	@GetMapping()
	public String appchange()
	{
	    return prefix + "/appchange";
	}
	
	/**
	 * 查询学生学籍变更列表
	 */
	@RequiresPermissions("student:appchange:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuAppchange appchange)
	{
		startPage();
        List<StuAppchange> list = appchangeService.selectAppchangeList(appchange);
		return getDataTable(list);
	}
	
	/**
	 * 新增学生学籍变更
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学生学籍变更
	 */
	@RequiresPermissions("student:appchange:add")
	@Log(title = "学生学籍变更", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuAppchange appchange)
	{		
		return toAjax(appchangeService.insertAppchange(appchange));
	}

	/**
	 * 修改学生学籍变更
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuAppchange appchange = appchangeService.selectAppchangeById(id);
		mmap.put("appchange", appchange);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学生学籍变更
	 */
	@RequiresPermissions("student:appchange:edit")
	@Log(title = "学生学籍变更", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuAppchange appchange)
	{		
		return toAjax(appchangeService.updateAppchange(appchange));
	}
	
	/**
	 * 删除学生学籍变更
	 */
	@RequiresPermissions("student:appchange:remove")
	@Log(title = "学生学籍变更", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appchangeService.deleteAppchangeByIds(ids));
	}
	
}
