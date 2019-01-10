package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.system.domain.StuAbroad;
import com.ruoyi.system.domain.StuScore;
import com.ruoyi.system.service.IStuScoreService;
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
 * 学生成绩 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/score")
public class StuScoreController extends BaseController
{
    private String prefix = "student/score";
	
	@Autowired
	private IStuScoreService scoreService;
	
	@RequiresPermissions("student:score:view")
	@GetMapping()
	public String score()
	{
	    return prefix + "/score";
	}
	
	/**
	 * 查询学生成绩列表
	 */
	@RequiresPermissions("student:score:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuScore score)
	{
		startPage();
        List<StuScore> list = scoreService.selectScoreList(score);
		return getDataTable(list);
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:score:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(StuScore score)
	{
		List<StuScore> list = scoreService.selectScoreList(score);
		ExcelUtil<StuScore> util = new ExcelUtil<StuScore>(StuScore.class);
		return util.exportExcel(list, "score");
	}

	@Log(title = "导出信息", businessType = BusinessType.EXPORT)
	@RequiresPermissions("student:score:input")
	@PostMapping("/input")
	@ResponseBody
	public AjaxResult input(StuScore score)
	{
		List<StuScore> list = scoreService.selectScoreList(score);
		ExcelUtil<StuScore> util = new ExcelUtil<StuScore>(StuScore.class);
		return util.exportExcel(list, "score");
	}
	
	/**
	 * 新增学生成绩
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学生成绩
	 */
	@RequiresPermissions("student:score:add")
	@Log(title = "学生成绩", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuScore score)
	{		
		return toAjax(scoreService.insertScore(score));
	}

	/**
	 * 修改学生成绩
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuScore score = scoreService.selectScoreById(id);
		mmap.put("score", score);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学生成绩
	 */
	@RequiresPermissions("student:score:edit")
	@Log(title = "学生成绩", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuScore score)
	{		
		return toAjax(scoreService.updateScore(score));
	}
	
	/**
	 * 删除学生成绩
	 */
	@RequiresPermissions("student:score:remove")
	@Log(title = "学生成绩", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(scoreService.deleteScoreByIds(ids));
	}
	
}
