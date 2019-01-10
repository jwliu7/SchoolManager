package com.ruoyi.system.service;

import com.ruoyi.system.domain.DocReport;

import java.util.List;

/**
 * 年度报告 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IDocReportService
{
	/**
     * 查询年度报告信息
     * 
     * @param id 年度报告ID
     * @return 年度报告信息
     */
	public DocReport selectReportById(Integer id);
	
	/**
     * 查询年度报告列表
     * 
     * @param report 年度报告信息
     * @return 年度报告集合
     */
	public List<DocReport> selectReportList(DocReport report);
	
	/**
     * 新增年度报告
     * 
     * @param report 年度报告信息
     * @return 结果
     */
	public int insertReport(DocReport report);
	
	/**
     * 修改年度报告
     * 
     * @param report 年度报告信息
     * @return 结果
     */
	public int updateReport(DocReport report);
		
	/**
     * 删除年度报告信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteReportByIds(String ids);

	public DocReport queryFileByID(int id);
}
