package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.StuForeign;
import com.ruoyi.system.service.IStuForeignService;
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
 * 外国留学生 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/foreign")
public class StuForeignController extends BaseController
{
    private String prefix = "student/foreign";
	
	@Autowired
	private IStuForeignService foreignService;
	
	@RequiresPermissions("student:foreign:view")
	@GetMapping()
	public String foreign()
	{
	    return prefix + "/foreign";
	}
	
	/**
	 * 查询外国留学生列表
	 */
	@RequiresPermissions("student:foreign:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuForeign foreign)
	{
		startPage();
        List<StuForeign> list = foreignService.selectForeignList(foreign);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:foreign:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(StuForeign foreign)
	{
		List<StuForeign> list = foreignService.selectForeignList(foreign);
		ExcelUtil<StuForeign> util = new ExcelUtil<StuForeign>(StuForeign.class);
		return util.exportExcel(list, "foreign");
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:foreign:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(StuForeign foreign)
	{
		List<StuForeign> list = foreignService.selectForeignList(foreign);
		ExcelUtil<StuForeign> util = new ExcelUtil<StuForeign>(StuForeign.class);
		return util.exportExcel(list, "foreign");
	}
	
	/**
	 * 新增外国留学生
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存外国留学生
	 */
	@RequiresPermissions("student:foreign:add")
	@Log(title = "外国留学生", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuForeign foreign)
	{		
		return toAjax(foreignService.insertForeign(foreign));
	}

	/**
	 * 修改外国留学生
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuForeign foreign = foreignService.selectForeignById(id);
		mmap.put("foreign", foreign);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存外国留学生
	 */
	@RequiresPermissions("student:foreign:edit")
	@Log(title = "外国留学生", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuForeign foreign)
	{		
		return toAjax(foreignService.updateForeign(foreign));
	}
	
	/**
	 * 删除外国留学生
	 */
	@RequiresPermissions("student:foreign:remove")
	@Log(title = "外国留学生", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(foreignService.deleteForeignByIds(ids));
	}
	
}
