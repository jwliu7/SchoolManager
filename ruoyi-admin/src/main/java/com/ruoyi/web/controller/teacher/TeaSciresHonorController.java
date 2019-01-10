package com.ruoyi.web.controller.teacher;

import java.util.List;

import com.ruoyi.system.domain.TeaSciresHonor;
import com.ruoyi.system.service.TeaSciresHonorService;
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
 * 教师科研及荣誉资质证书 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/teacher/sciresHonor")
public class TeaSciresHonorController extends BaseController
{
    private String prefix = "teacher/sciresHonor";
	
	@Autowired
	private TeaSciresHonorService sciresHonorService;
	
	@RequiresPermissions("teacher:sciresHonor:view")
	@GetMapping()
	public String sciresHonor()
	{
	    return prefix + "/sciresHonor";
	}
	
	/**
	 * 查询教师科研及荣誉资质证书列表
	 */
	@RequiresPermissions("teacher:sciresHonor:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TeaSciresHonor sciresHonor)
	{
		startPage();
        List<TeaSciresHonor> list = sciresHonorService.selectSciresHonorList(sciresHonor);
		return getDataTable(list);
	}
	
	/**
	 * 新增教师科研及荣誉资质证书
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存教师科研及荣誉资质证书
	 */
	@RequiresPermissions("teacher:sciresHonor:add")
	@Log(title = "教师科研及荣誉资质证书", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TeaSciresHonor sciresHonor)
	{		
		return toAjax(sciresHonorService.insertSciresHonor(sciresHonor));
	}

	/**
	 * 修改教师科研及荣誉资质证书
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		TeaSciresHonor sciresHonor = sciresHonorService.selectSciresHonorById(id);
		mmap.put("sciresHonor", sciresHonor);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存教师科研及荣誉资质证书
	 */
	@RequiresPermissions("teacher:sciresHonor:edit")
	@Log(title = "教师科研及荣誉资质证书", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TeaSciresHonor sciresHonor)
	{		
		return toAjax(sciresHonorService.updateSciresHonor(sciresHonor));
	}
	
	/**
	 * 删除教师科研及荣誉资质证书
	 */
	@RequiresPermissions("teacher:sciresHonor:remove")
	@Log(title = "教师科研及荣誉资质证书", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sciresHonorService.deleteSciresHonorByIds(ids));
	}
	
}
