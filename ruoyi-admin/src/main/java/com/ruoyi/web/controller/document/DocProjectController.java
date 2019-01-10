package com.ruoyi.web.controller.document;

import java.util.List;

import com.ruoyi.system.domain.DocProject;
import com.ruoyi.system.service.IDocProjectService;
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
 * 项目 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/document/project")
public class DocProjectController extends BaseController
{
    private String prefix = "document/project";
	
	@Autowired
	private IDocProjectService projectService;
	
	@RequiresPermissions("document:project:view")
	@GetMapping()
	public String project()
	{
	    return prefix + "/project";
	}
	
	/**
	 * 查询项目列表
	 */
	@RequiresPermissions("document:project:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DocProject project)
	{
		startPage();
        List<DocProject> list = projectService.selectProjectList(project);
		return getDataTable(list);
	}
	
	/**
	 * 新增项目
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存项目
	 */
	@RequiresPermissions("document:project:add")
	@Log(title = "项目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DocProject project)
	{		
		return toAjax(projectService.insertProject(project));
	}

	/**
	 * 修改项目
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		DocProject project = projectService.selectProjectById(id);
		mmap.put("project", project);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存项目
	 */
	@RequiresPermissions("document:project:edit")
	@Log(title = "项目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DocProject project)
	{		
		return toAjax(projectService.updateProject(project));
	}
	
	/**
	 * 删除项目
	 */
	@RequiresPermissions("document:project:remove")
	@Log(title = "项目", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(projectService.deleteProjectByIds(ids));
	}
	
}
