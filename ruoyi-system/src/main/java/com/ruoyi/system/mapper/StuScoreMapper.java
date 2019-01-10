package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StuScore;

import java.util.List;

/**
 * 学生成绩 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface StuScoreMapper
{
	/**
     * 查询学生成绩信息
     * 
     * @param id 学生成绩ID
     * @return 学生成绩信息
     */
	public StuScore selectScoreById(Integer id);
	
	/**
     * 查询学生成绩列表
     * 
     * @param score 学生成绩信息
     * @return 学生成绩集合
     */
	public List<StuScore> selectScoreList(StuScore score);
	
	/**
     * 新增学生成绩
     * 
     * @param score 学生成绩信息
     * @return 结果
     */
	public int insertScore(StuScore score);
	
	/**
     * 修改学生成绩
     * 
     * @param score 学生成绩信息
     * @return 结果
     */
	public int updateScore(StuScore score);
	
	/**
     * 删除学生成绩
     * 
     * @param id 学生成绩ID
     * @return 结果
     */
	public int deleteScoreById(Integer id);
	
	/**
     * 批量删除学生成绩
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteScoreByIds(String[] ids);
	
}