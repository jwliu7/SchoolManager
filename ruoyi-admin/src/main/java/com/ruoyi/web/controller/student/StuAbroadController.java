package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.StuAbroad;
import com.ruoyi.system.service.IStuAbroadService;
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
 * 出国留学生 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/abroad")
public class StuAbroadController extends BaseController
{
    private String prefix = "student/abroad";
	
	@Autowired
	private IStuAbroadService abroadService;
	
	@RequiresPermissions("student:abroad:view")
	@GetMapping()
	public String abroad()
	{
	    return prefix + "/abroad";
	}
	
	/**
	 * 查询出国留学生列表
	 */
	@RequiresPermissions("student:abroad:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuAbroad abroad)
	{
		startPage();
        List<StuAbroad> list = abroadService.selectAbroadList(abroad);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:abroad:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(StuAbroad abroad)
	{
		List<StuAbroad> list = abroadService.selectAbroadList(abroad);
		ExcelUtil<StuAbroad> util = new ExcelUtil<StuAbroad>(StuAbroad.class);
		return util.exportExcel(list, "abroad");
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:abroad:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(StuAbroad abroad)
	{
		List<StuAbroad> list = abroadService.selectAbroadList(abroad);
		ExcelUtil<StuAbroad> util = new ExcelUtil<StuAbroad>(StuAbroad.class);
		return util.exportExcel(list, "abroad");
	}

	/**
	 * 新增出国留学生
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存出国留学生
	 */
	@RequiresPermissions("student:abroad:add")
	@Log(title = "出国留学生", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuAbroad abroad)
	{		
		return toAjax(abroadService.insertAbroad(abroad));
	}

	/**
	 * 修改出国留学生
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuAbroad abroad = abroadService.selectAbroadById(id);
		mmap.put("abroad", abroad);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存出国留学生
	 */
	@RequiresPermissions("student:abroad:edit")
	@Log(title = "出国留学生", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuAbroad abroad)
	{		
		return toAjax(abroadService.updateAbroad(abroad));
	}
	
	/**
	 * 删除出国留学生
	 */
	@RequiresPermissions("student:abroad:remove")
	@Log(title = "出国留学生", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(abroadService.deleteAbroadByIds(ids));
	}
	
}
