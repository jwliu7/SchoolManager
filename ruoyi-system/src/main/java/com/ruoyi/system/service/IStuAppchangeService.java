package com.ruoyi.system.service;

import com.ruoyi.system.domain.StuAppchange;

import java.util.List;

/**
 * 学生学籍变更 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IStuAppchangeService
{
	/**
     * 查询学生学籍变更信息
     * 
     * @param id 学生学籍变更ID
     * @return 学生学籍变更信息
     */
	public StuAppchange selectAppchangeById(Integer id);
	
	/**
     * 查询学生学籍变更列表
     * 
     * @param appchange 学生学籍变更信息
     * @return 学生学籍变更集合
     */
	public List<StuAppchange> selectAppchangeList(StuAppchange appchange);
	
	/**
     * 新增学生学籍变更
     * 
     * @param appchange 学生学籍变更信息
     * @return 结果
     */
	public int insertAppchange(StuAppchange appchange);
	
	/**
     * 修改学生学籍变更
     * 
     * @param appchange 学生学籍变更信息
     * @return 结果
     */
	public int updateAppchange(StuAppchange appchange);
		
	/**
     * 删除学生学籍变更信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAppchangeByIds(String ids);
	
}
