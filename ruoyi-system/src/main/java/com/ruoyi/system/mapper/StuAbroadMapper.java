package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StuAbroad;

import java.util.List;

/**
 * 出国留学生 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface StuAbroadMapper
{
	/**
     * 查询出国留学生信息
     * 
     * @param id 出国留学生ID
     * @return 出国留学生信息
     */
	public StuAbroad selectAbroadById(Integer id);
	
	/**
     * 查询出国留学生列表
     * 
     * @param abroad 出国留学生信息
     * @return 出国留学生集合
     */
	public List<StuAbroad> selectAbroadList(StuAbroad abroad);
	
	/**
     * 新增出国留学生
     * 
     * @param abroad 出国留学生信息
     * @return 结果
     */
	public int insertAbroad(StuAbroad abroad);
	
	/**
     * 修改出国留学生
     * 
     * @param abroad 出国留学生信息
     * @return 结果
     */
	public int updateAbroad(StuAbroad abroad);
	
	/**
     * 删除出国留学生
     * 
     * @param id 出国留学生ID
     * @return 结果
     */
	public int deleteAbroadById(Integer id);
	
	/**
     * 批量删除出国留学生
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAbroadByIds(String[] ids);
	
}