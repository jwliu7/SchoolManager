package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuAbroad;
import com.ruoyi.system.mapper.StuAbroadMapper;
import com.ruoyi.system.service.IStuAbroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 出国留学生 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuAbroadServiceImpl implements IStuAbroadService
{
	@Autowired
	private StuAbroadMapper abroadMapper;

	/**
     * 查询出国留学生信息
     * 
     * @param id 出国留学生ID
     * @return 出国留学生信息
     */
    @Override
	public StuAbroad selectAbroadById(Integer id)
	{
	    return abroadMapper.selectAbroadById(id);
	}
	
	/**
     * 查询出国留学生列表
     * 
     * @param abroad 出国留学生信息
     * @return 出国留学生集合
     */
	@Override
	public List<StuAbroad> selectAbroadList(StuAbroad abroad)
	{
	    return abroadMapper.selectAbroadList(abroad);
	}
	
    /**
     * 新增出国留学生
     * 
     * @param abroad 出国留学生信息
     * @return 结果
     */
	@Override
	public int insertAbroad(StuAbroad abroad)
	{
	    return abroadMapper.insertAbroad(abroad);
	}
	
	/**
     * 修改出国留学生
     * 
     * @param abroad 出国留学生信息
     * @return 结果
     */
	@Override
	public int updateAbroad(StuAbroad abroad)
	{
	    return abroadMapper.updateAbroad(abroad);
	}

	/**
     * 删除出国留学生对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAbroadByIds(String ids)
	{
		return abroadMapper.deleteAbroadByIds(Convert.toStrArray(ids));
	}
	
}
