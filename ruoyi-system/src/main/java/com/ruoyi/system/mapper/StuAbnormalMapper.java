package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StuAbnormal;

import java.util.List;

/**
 * 学生异常 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface StuAbnormalMapper
{
	/**
     * 查询学生异常信息
     * 
     * @param id 学生异常ID
     * @return 学生异常信息
     */
	public StuAbnormal selectAbnormalById(Integer id);
	
	/**
     * 查询学生异常列表
     * 
     * @param abnormal 学生异常信息
     * @return 学生异常集合
     */
	public List<StuAbnormal> selectAbnormalList(StuAbnormal abnormal);
	
	/**
     * 新增学生异常
     * 
     * @param abnormal 学生异常信息
     * @return 结果
     */
	public int insertAbnormal(StuAbnormal abnormal);
	
	/**
     * 修改学生异常
     * 
     * @param abnormal 学生异常信息
     * @return 结果
     */
	public int updateAbnormal(StuAbnormal abnormal);
	
	/**
     * 删除学生异常
     * 
     * @param id 学生异常ID
     * @return 结果
     */
	public int deleteAbnormalById(Integer id);
	
	/**
     * 批量删除学生异常
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAbnormalByIds(String[] ids);
	
}