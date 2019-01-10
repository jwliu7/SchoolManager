package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuAbnormal;
import com.ruoyi.system.mapper.StuAbnormalMapper;
import com.ruoyi.system.service.IStuAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学生异常 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuAbnormalServiceImpl implements IStuAbnormalService
{
	@Autowired
	private StuAbnormalMapper abnormalMapper;

	/**
     * 查询学生异常信息
     * 
     * @param id 学生异常ID
     * @return 学生异常信息
     */
    @Override
	public StuAbnormal selectAbnormalById(Integer id)
	{
	    return abnormalMapper.selectAbnormalById(id);
	}
	
	/**
     * 查询学生异常列表
     * 
     * @param abnormal 学生异常信息
     * @return 学生异常集合
     */
	@Override
	public List<StuAbnormal> selectAbnormalList(StuAbnormal abnormal)
	{
	    return abnormalMapper.selectAbnormalList(abnormal);
	}
	
    /**
     * 新增学生异常
     * 
     * @param abnormal 学生异常信息
     * @return 结果
     */
	@Override
	public int insertAbnormal(StuAbnormal abnormal)
	{
	    return abnormalMapper.insertAbnormal(abnormal);
	}
	
	/**
     * 修改学生异常
     * 
     * @param abnormal 学生异常信息
     * @return 结果
     */
	@Override
	public int updateAbnormal(StuAbnormal abnormal)
	{
	    return abnormalMapper.updateAbnormal(abnormal);
	}

	/**
     * 删除学生异常对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAbnormalByIds(String ids)
	{
		return abnormalMapper.deleteAbnormalByIds(Convert.toStrArray(ids));
	}
	
}
