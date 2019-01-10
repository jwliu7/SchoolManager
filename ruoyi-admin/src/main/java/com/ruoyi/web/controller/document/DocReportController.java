package com.ruoyi.web.controller.document;

import java.util.List;

import com.ruoyi.system.domain.DocReport;
import com.ruoyi.system.service.IDocReportService;
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
 * 年度报告 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Controller
@RequestMapping("/document/report")
public class DocReportController extends BaseController
{
    private String prefix = "document/report";
	
	@Autowired
	private IDocReportService reportService;
	
	@RequiresPermissions("document:report:view")
	@GetMapping()
	public String report()
	{
	    return prefix + "/report";
	}
	
	/**
	 * 查询年度报告列表
	 */
	@RequiresPermissions("document:report:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DocReport report)
	{
		startPage();
        List<DocReport> list = reportService.selectReportList(report);
		return getDataTable(list);
	}
	
	/**
	 * 新增年度报告
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存年度报告
	 */
	@RequiresPermissions("document:report:add")
	@Log(title = "年度报告", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DocReport report)
	{		
		return toAjax(reportService.insertReport(report));
	}

	/**
	 * 修改年度报告
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		DocReport report = reportService.selectReportById(id);
		mmap.put("report", report);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存年度报告
	 */
	@RequiresPermissions("document:report:edit")
	@Log(title = "年度报告", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DocReport report)
	{		
		return toAjax(reportService.updateReport(report));
	}
	
	/**
	 * 删除年度报告
	 */
	@RequiresPermissions("document:report:remove")
	@Log(title = "年度报告", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(reportService.deleteReportByIds(ids));
	}
	
}
