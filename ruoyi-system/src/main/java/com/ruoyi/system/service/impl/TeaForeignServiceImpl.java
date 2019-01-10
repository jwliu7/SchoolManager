package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.TeaForeign;
import com.ruoyi.system.mapper.TeaForeignMapper;
import com.ruoyi.system.service.TeaForeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 外教基本 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class TeaForeignServiceImpl implements TeaForeignService
{
	@Autowired
	private TeaForeignMapper foreignMapper;

	/**
     * 查询外教基本信息
     * 
     * @param id 外教基本ID
     * @return 外教基本信息
     */
    @Override
	public TeaForeign selectForeignById(Integer id)
	{
	    return foreignMapper.selectForeignById(id);
	}
	
	/**
     * 查询外教基本列表
     * 
     * @param foreign 外教基本信息
     * @return 外教基本集合
     */
	@Override
	public List<TeaForeign> selectForeignList(TeaForeign foreign)
	{
	    return foreignMapper.selectForeignList(foreign);
	}
	
    /**
     * 新增外教基本
     * 
     * @param foreign 外教基本信息
     * @return 结果
     */
	@Override
	public int insertForeign(TeaForeign foreign)
	{
	    return foreignMapper.insertForeign(foreign);
	}
	
	/**
     * 修改外教基本
     * 
     * @param foreign 外教基本信息
     * @return 结果
     */
	@Override
	public int updateForeign(TeaForeign foreign)
	{
	    return foreignMapper.updateForeign(foreign);
	}

	/**
     * 删除外教基本对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteForeignByIds(String ids)
	{
		return foreignMapper.deleteForeignByIds(Convert.toStrArray(ids));
	}
	
}
