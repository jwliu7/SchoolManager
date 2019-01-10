package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.StuInfor;
import com.ruoyi.system.service.IStuInforService;
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
 * 学生基本 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/infor")
public class StuInforController extends BaseController
{
    private String prefix = "student/infor";
	
	@Autowired
	private IStuInforService inforService;
	
	@RequiresPermissions("student:infor:view")
	@GetMapping()
	public String infor()
	{
	    return prefix + "/infor";
	}
	
	/**
	 * 查询学生基本列表
	 */
	@RequiresPermissions("student:infor:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuInfor infor)
	{
		startPage();
        List<StuInfor> list = inforService.selectInforList(infor);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:infor:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(StuInfor infor)
	{
		List<StuInfor> list = inforService.selectInforList(infor);
		ExcelUtil<StuInfor> util = new ExcelUtil<StuInfor>(StuInfor.class);
		return util.exportExcel(list, "infor");
	}

	@Log(title = "导入信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:infor:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(StuInfor infor)
	{
		List<StuInfor> list = inforService.selectInforList(infor);
		ExcelUtil<StuInfor> util = new ExcelUtil<StuInfor>(StuInfor.class);
		return util.exportExcel(list, "infor");
	}
	
	/**
	 * 新增学生基本
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学生基本
	 */
	@RequiresPermissions("student:infor:add")
	@Log(title = "学生基本", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuInfor infor)
	{		
		return toAjax(inforService.insertInfor(infor));
	}

	/**
	 * 修改学生基本
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuInfor infor = inforService.selectInforById(id);
		mmap.put("infor", infor);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学生基本
	 */
	@RequiresPermissions("student:infor:edit")
	@Log(title = "学生基本", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuInfor infor)
	{		
		return toAjax(inforService.updateInfor(infor));
	}
	
	/**
	 * 删除学生基本
	 */
	@RequiresPermissions("student:infor:remove")
	@Log(title = "学生基本", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(inforService.deleteInforByIds(ids));
	}
	
}
