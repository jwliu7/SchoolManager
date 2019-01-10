package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.DocReport;
import com.ruoyi.system.mapper.DocReportMapper;
import com.ruoyi.system.service.IDocReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 年度报告 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class DocReportServiceImpl implements IDocReportService
{
	@Autowired
	private DocReportMapper reportMapper;

	/**
     * 查询年度报告信息
     * 
     * @param id 年度报告ID
     * @return 年度报告信息
     */
    @Override
	public DocReport selectReportById(Integer id)
	{
	    return reportMapper.selectReportById(id);
	}
	
	/**
     * 查询年度报告列表
     * 
     * @param report 年度报告信息
     * @return 年度报告集合
     */
	@Override
	public List<DocReport> selectReportList(DocReport report)
	{
	    return reportMapper.selectReportList(report);
	}
	
    /**
     * 新增年度报告
     * 
     * @param report 年度报告信息
     * @return 结果
     */
	@Override
	public int insertReport(DocReport report)
	{
	    return reportMapper.insertReport(report);
	}
	
	/**
     * 修改年度报告
     * 
     * @param report 年度报告信息
     * @return 结果
     */
	@Override
	public int updateReport(DocReport report)
	{
	    return reportMapper.updateReport(report);
	}

	/**
     * 删除年度报告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteReportByIds(String ids)
	{
		return reportMapper.deleteReportByIds(Convert.toStrArray(ids));
	}

	@Override
	public DocReport queryFileByID(int id) {
		return reportMapper.selectByPrimaryKey(id);
	}
}
