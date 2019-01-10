package com.ruoyi.system.service;

import com.ruoyi.system.domain.DocActivity;

import java.util.List;

/**
 * 学院活动 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IDocActivityService
{
	/**
     * 查询学院活动信息
     * 
     * @param id 学院活动ID
     * @return 学院活动信息
     */
	public DocActivity selectActivityById(Integer id);
	
	/**
     * 查询学院活动列表
     * 
     * @param activity 学院活动信息
     * @return 学院活动集合
     */
	public List<DocActivity> selectActivityList(DocActivity activity);
	
	/**
     * 新增学院活动
     * 
     * @param activity 学院活动信息
     * @return 结果
     */
	public int insertActivity(DocActivity activity);
	
	/**
     * 修改学院活动
     * 
     * @param activity 学院活动信息
     * @return 结果
     */
	public int updateActivity(DocActivity activity);
		
	/**
     * 删除学院活动信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityByIds(String ids);

	public DocActivity queryFileByID(int id);
	
}
