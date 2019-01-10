package com.ruoyi.web.controller.document;

import java.util.List;

import com.ruoyi.system.domain.DocActivity;
import com.ruoyi.system.service.IDocActivityService;
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
 * 学院活动 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/document/activity")
public class DocActivityController extends BaseController
{
    private String prefix = "document/activity";
	
	@Autowired
	private IDocActivityService activityService;
	
	@RequiresPermissions("document:activity:view")
	@GetMapping()
	public String activity()
	{
	    return prefix + "/activity";
	}
	
	/**
	 * 查询学院活动列表
	 */
	@RequiresPermissions("document:activity:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DocActivity activity)
	{
		startPage();
        List<DocActivity> list = activityService.selectActivityList(activity);
		return getDataTable(list);
	}
	
	/**
	 * 新增学院活动
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学院活动
	 */
	@RequiresPermissions("document:activity:add")
	@Log(title = "学院活动", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DocActivity activity)
	{		
		return toAjax(activityService.insertActivity(activity));
	}

	/**
	 * 修改学院活动
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		DocActivity activity = activityService.selectActivityById(id);
		mmap.put("activity", activity);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学院活动
	 */
	@RequiresPermissions("document:activity:edit")
	@Log(title = "学院活动", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DocActivity activity)
	{		
		return toAjax(activityService.updateActivity(activity));
	}
	
	/**
	 * 删除学院活动
	 */
	@RequiresPermissions("document:activity:remove")
	@Log(title = "学院活动", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(activityService.deleteActivityByIds(ids));
	}
	
}
