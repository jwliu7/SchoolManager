package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.system.domain.StuAbnormal;
import com.ruoyi.system.service.IStuAbnormalService;
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
 * 学生异常 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/abnormal")
public class StuAbnormalController extends BaseController
{
    private String prefix = "student/abnormal";
	
	@Autowired
	private IStuAbnormalService abnormalService;
	
	@RequiresPermissions("student:abnormal:view")
	@GetMapping()
	public String abnormal()
	{
	    return prefix + "/abnormal";
	}
	
	/**
	 * 查询学生异常列表
	 */
	@RequiresPermissions("student:abnormal:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuAbnormal abnormal)
	{
		startPage();
        List<StuAbnormal> list = abnormalService.selectAbnormalList(abnormal);
		return getDataTable(list);
	}
	
	/**
	 * 新增学生异常
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学生异常
	 */
	@RequiresPermissions("student:abnormal:add")
	@Log(title = "学生异常", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuAbnormal abnormal)
	{		
		return toAjax(abnormalService.insertAbnormal(abnormal));
	}

	/**
	 * 修改学生异常
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuAbnormal abnormal = abnormalService.selectAbnormalById(id);
		mmap.put("abnormal", abnormal);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学生异常
	 */
	@RequiresPermissions("student:abnormal:edit")
	@Log(title = "学生异常", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuAbnormal abnormal)
	{		
		return toAjax(abnormalService.updateAbnormal(abnormal));
	}
	
	/**
	 * 删除学生异常
	 */
	@RequiresPermissions("student:abnormal:remove")
	@Log(title = "学生异常", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(abnormalService.deleteAbnormalByIds(ids));
	}
	
}
