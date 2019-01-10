package com.ruoyi.system.service;

import com.ruoyi.system.domain.StuInfor;

import java.util.List;

/**
 * 学生基本 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IStuInforService
{
	/**
     * 查询学生基本信息
     * 
     * @param id 学生基本ID
     * @return 学生基本信息
     */
	public StuInfor selectInforById(Integer id);
	
	/**
     * 查询学生基本列表
     * 
     * @param infor 学生基本信息
     * @return 学生基本集合
     */
	public List<StuInfor> selectInforList(StuInfor infor);
	
	/**
     * 新增学生基本
     * 
     * @param infor 学生基本信息
     * @return 结果
     */
	public int insertInfor(StuInfor infor);
	
	/**
     * 修改学生基本
     * 
     * @param infor 学生基本信息
     * @return 结果
     */
	public int updateInfor(StuInfor infor);
		
	/**
     * 删除学生基本信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteInforByIds(String ids);
	
}
