package com.ruoyi.web.controller.student;

import java.util.List;

import com.ruoyi.system.domain.StuPerfor;
import com.ruoyi.system.service.IStuPerforService;
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
 * 学生在校现情况 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/student/perfor")
public class StuPerforController extends BaseController
{
    private String prefix = "student/perfor";
	
	@Autowired
	private IStuPerforService perforService;
	
	@RequiresPermissions("student:perfor:view")
	@GetMapping()
	public String perfor()
	{
	    return prefix + "/perfor";
	}
	
	/**
	 * 查询学生在校现情况列表
	 */
	@RequiresPermissions("student:perfor:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StuPerfor perfor)
	{
		startPage();
        List<StuPerfor> list = perforService.selectPerforList(perfor);
		return getDataTable(list);
	}
	
	/**
	 * 新增学生在校现情况
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存学生在校现情况
	 */
	@RequiresPermissions("student:perfor:add")
	@Log(title = "学生在校现情况", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StuPerfor perfor)
	{		
		return toAjax(perforService.insertPerfor(perfor));
	}

	/**
	 * 修改学生在校现情况
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		StuPerfor perfor = perforService.selectPerforById(id);
		mmap.put("perfor", perfor);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存学生在校现情况
	 */
	@RequiresPermissions("student:perfor:edit")
	@Log(title = "学生在校现情况", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StuPerfor perfor)
	{		
		return toAjax(perforService.updatePerfor(perfor));
	}
	
	/**
	 * 删除学生在校现情况
	 */
	@RequiresPermissions("student:perfor:remove")
	@Log(title = "学生在校现情况", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(perforService.deletePerforByIds(ids));
	}
	
}
