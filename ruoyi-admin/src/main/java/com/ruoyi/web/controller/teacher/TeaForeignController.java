package com.ruoyi.web.controller.teacher;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.TeaForeign;
import com.ruoyi.system.service.TeaForeignService;
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
 * 外教基本 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/teacher/foreign")
public class TeaForeignController extends BaseController
{
    private String prefix = "teacher/foreign";
	
	@Autowired
	private TeaForeignService foreignService;
	
	@RequiresPermissions("teacher:foreign:view")
	@GetMapping()
	public String foreign()
	{
	    return prefix + "/foreign";
	}
	
	/**
	 * 查询外教基本列表
	 */
	@RequiresPermissions("teacher:foreign:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TeaForeign foreign)
	{
		startPage();
        List<TeaForeign> list = foreignService.selectForeignList(foreign);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:foreign:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(TeaForeign foreign)
	{
		List<TeaForeign> list = foreignService.selectForeignList(foreign);
		ExcelUtil<TeaForeign> util = new ExcelUtil<TeaForeign>(TeaForeign.class);
		return util.exportExcel(list, "foreign");
	}

	@Log(title = "导入信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:foreign:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(TeaForeign foreign)
	{
		List<TeaForeign> list = foreignService.selectForeignList(foreign);
		ExcelUtil<TeaForeign> util = new ExcelUtil<TeaForeign>(TeaForeign.class);
		return util.exportExcel(list, "foreign");
	}
	
	/**
	 * 新增外教基本
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存外教基本
	 */
	@RequiresPermissions("teacher:foreign:add")
	@Log(title = "外教基本", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TeaForeign foreign)
	{		
		return toAjax(foreignService.insertForeign(foreign));
	}

	/**
	 * 修改外教基本
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		TeaForeign foreign = foreignService.selectForeignById(id);
		mmap.put("foreign", foreign);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存外教基本
	 */
	@RequiresPermissions("teacher:foreign:edit")
	@Log(title = "外教基本", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TeaForeign foreign)
	{		
		return toAjax(foreignService.updateForeign(foreign));
	}
	
	/**
	 * 删除外教基本
	 */
	@RequiresPermissions("teacher:foreign:remove")
	@Log(title = "外教基本", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(foreignService.deleteForeignByIds(ids));
	}
	
}
