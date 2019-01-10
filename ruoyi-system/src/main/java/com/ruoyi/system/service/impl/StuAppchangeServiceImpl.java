package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuAppchange;
import com.ruoyi.system.mapper.StuAppchangeMapper;
import com.ruoyi.system.service.IStuAppchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学生学籍变更 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuAppchangeServiceImpl implements IStuAppchangeService
{
	@Autowired
	private StuAppchangeMapper appchangeMapper;

	/**
     * 查询学生学籍变更信息
     * 
     * @param id 学生学籍变更ID
     * @return 学生学籍变更信息
     */
    @Override
	public StuAppchange selectAppchangeById(Integer id)
	{
	    return appchangeMapper.selectAppchangeById(id);
	}
	
	/**
     * 查询学生学籍变更列表
     * 
     * @param appchange 学生学籍变更信息
     * @return 学生学籍变更集合
     */
	@Override
	public List<StuAppchange> selectAppchangeList(StuAppchange appchange)
	{
	    return appchangeMapper.selectAppchangeList(appchange);
	}
	
    /**
     * 新增学生学籍变更
     * 
     * @param appchange 学生学籍变更信息
     * @return 结果
     */
	@Override
	public int insertAppchange(StuAppchange appchange)
	{
	    return appchangeMapper.insertAppchange(appchange);
	}
	
	/**
     * 修改学生学籍变更
     * 
     * @param appchange 学生学籍变更信息
     * @return 结果
     */
	@Override
	public int updateAppchange(StuAppchange appchange)
	{
	    return appchangeMapper.updateAppchange(appchange);
	}

	/**
     * 删除学生学籍变更对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAppchangeByIds(String ids)
	{
		return appchangeMapper.deleteAppchangeByIds(Convert.toStrArray(ids));
	}
	
}
