package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.DocActivity;
import com.ruoyi.system.mapper.DocActivityMapper;
import com.ruoyi.system.service.IDocActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学院活动 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class DocActivityServiceImpl implements IDocActivityService
{
	@Autowired
	private DocActivityMapper activityMapper;

	/**
     * 查询学院活动信息
     * 
     * @param id 学院活动ID
     * @return 学院活动信息
     */
    @Override
	public DocActivity selectActivityById(Integer id)
	{
	    return activityMapper.selectActivityById(id);
	}
	
	/**
     * 查询学院活动列表
     * 
     * @param activity 学院活动信息
     * @return 学院活动集合
     */
	@Override
	public List<DocActivity> selectActivityList(DocActivity activity)
	{
	    return activityMapper.selectActivityList(activity);
	}
	
    /**
     * 新增学院活动
     * 
     * @param activity 学院活动信息
     * @return 结果
     */
	@Override
	public int insertActivity(DocActivity activity)
	{
	    return activityMapper.insertActivity(activity);
	}
	
	/**
     * 修改学院活动
     * 
     * @param activity 学院活动信息
     * @return 结果
     */
	@Override
	public int updateActivity(DocActivity activity)
	{
	    return activityMapper.updateActivity(activity);
	}

	/**
     * 删除学院活动对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteActivityByIds(String ids)
	{
		return activityMapper.deleteActivityByIds(Convert.toStrArray(ids));
	}

	@Override
	public DocActivity queryFileByID(int id) {
		return activityMapper.selectByPrimaryKey(id);
	}
	
}
