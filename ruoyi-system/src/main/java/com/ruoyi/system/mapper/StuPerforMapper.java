package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StuPerfor;

import java.util.List;

/**
 * 学生在校现情况 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface StuPerforMapper
{
	/**
     * 查询学生在校现情况信息
     * 
     * @param id 学生在校现情况ID
     * @return 学生在校现情况信息
     */
	public StuPerfor selectPerforById(Integer id);
	
	/**
     * 查询学生在校现情况列表
     * 
     * @param perfor 学生在校现情况信息
     * @return 学生在校现情况集合
     */
	public List<StuPerfor> selectPerforList(StuPerfor perfor);
	
	/**
     * 新增学生在校现情况
     * 
     * @param perfor 学生在校现情况信息
     * @return 结果
     */
	public int insertPerfor(StuPerfor perfor);
	
	/**
     * 修改学生在校现情况
     * 
     * @param perfor 学生在校现情况信息
     * @return 结果
     */
	public int updatePerfor(StuPerfor perfor);
	
	/**
     * 删除学生在校现情况
     * 
     * @param id 学生在校现情况ID
     * @return 结果
     */
	public int deletePerforById(Integer id);
	
	/**
     * 批量删除学生在校现情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePerforByIds(String[] ids);
	
}