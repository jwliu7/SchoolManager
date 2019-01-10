package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.TeaBusiness;
import com.ruoyi.system.mapper.TeaBusinessMapper;
import com.ruoyi.system.service.TeaBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.support.Convert;

/**
 * 教师业务 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class TeaBusinessServiceImpl implements TeaBusinessService
{
	@Autowired
	private TeaBusinessMapper businessMapper;

	/**
     * 查询教师业务信息
     * 
     * @param id 教师业务ID
     * @return 教师业务信息
     */
    @Override
	public TeaBusiness selectBusinessById(Integer id)
	{
	    return businessMapper.selectBusinessById(id);
	}
	
	/**
     * 查询教师业务列表
     * 
     * @param business 教师业务信息
     * @return 教师业务集合
     */
	@Override
	public List<TeaBusiness> selectBusinessList(TeaBusiness business)
	{
	    return businessMapper.selectBusinessList(business);
	}
	
    /**
     * 新增教师业务
     * 
     * @param business 教师业务信息
     * @return 结果
     */
	@Override
	public int insertBusiness(TeaBusiness business)
	{
	    return businessMapper.insertBusiness(business);
	}
	
	/**
     * 修改教师业务
     * 
     * @param business 教师业务信息
     * @return 结果
     */
	@Override
	public int updateBusiness(TeaBusiness business)
	{
	    return businessMapper.updateBusiness(business);
	}

	/**
     * 删除教师业务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBusinessByIds(String ids)
	{
		return businessMapper.deleteBusinessByIds(Convert.toStrArray(ids));
	}
	
}
