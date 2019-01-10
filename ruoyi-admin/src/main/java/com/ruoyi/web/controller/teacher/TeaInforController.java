package com.ruoyi.web.controller.teacher;

import java.io.IOException;
import java.util.List;

import com.ruoyi.common.utils.EasyExcelUtil;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.TeaInfor;
import com.ruoyi.system.service.TeaInforService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.web.core.base.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.common.base.AjaxResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * 教师基本 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/teacher/infor")
public class TeaInforController extends BaseController
{
    private String prefix = "teacher/infor";
	
	@Autowired
	private TeaInforService inforService;
	
	@RequiresPermissions("teacher:infor:view")
	@GetMapping()
	public String infor()
	{
	    return prefix + "/infor";
	}

	/**
	 * 查询教师基本列表
	 */
	@RequiresPermissions("teacher:infor:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TeaInfor infor)
	{
		startPage();
        List<TeaInfor> list = inforService.selectInforList(infor);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:infor:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(TeaInfor infor)
	{
		List<TeaInfor> list = inforService.selectInforList(infor);
		ExcelUtil<TeaInfor> util = new ExcelUtil<TeaInfor>(TeaInfor.class);
		return util.exportExcel(list, "infor");
	}

	@Log(title = "导入信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("teacher:infor:import")
	@PostMapping("/import")
	@ResponseBody
	public AjaxResult importExcel(@RequestParam("file") MultipartFile file) throws Exception {

		ExcelUtil<TeaInfor> util = new ExcelUtil<TeaInfor>(TeaInfor.class);
		List<TeaInfor> infors = util.importExcel(file.getInputStream());
		if(infors == null  ) {
			return error(1, "请选择正确的导入模板");
		}

		int insertCount = 0;
		int updateCount = 0;
		for (TeaInfor infor : infors) {
			TeaInfor infor1 = inforService.selectInforByTeaId(infor.getTeaid());
			if (infor1 != null && infor1.getTeaid() != null){
				inforService.updateInforByTeaId(infor);
				updateCount = updateCount + 1;
			}
			else {
				if (1 == inforService.insertInfor(infor)) {
					insertCount = insertCount + 1;
				}
			}
		}

		if(insertCount + updateCount  == infors.size()) {
			return success("导入成功,新增【" + insertCount + "】条科目，更新【"+updateCount+"】条科目");
		}else {
			return error(1, "导入失败");
		}
	}
	
	/**
	 * 新增教师基本
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存教师基本
	 */
	@RequiresPermissions("teacher:infor:add")
	@Log(title = "教师基本", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TeaInfor infor)
	{		
		return toAjax(inforService.insertInfor(infor));
	}

	/**
	 * 修改教师基本
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		TeaInfor infor = inforService.selectInforById(id);
		mmap.put("infor", infor);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存教师基本
	 */
	@RequiresPermissions("teacher:infor:edit")
	@Log(title = "教师基本", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TeaInfor infor)
	{
		infor.setUpdateBy(ShiroUtils.getLoginName());
		System.out.println();
		return toAjax(inforService.updateInfor(infor));
	}
	
	/**
	 * 删除教师基本
	 */
	@RequiresPermissions("teacher:infor:remove")
	@Log(title = "教师基本", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(inforService.deleteInforByIds(ids));
	}
	
}
