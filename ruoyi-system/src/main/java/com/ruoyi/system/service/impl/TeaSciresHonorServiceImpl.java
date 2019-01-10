package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.TeaSciresHonor;
import com.ruoyi.system.mapper.TeaSciresHonorMapper;
import com.ruoyi.system.service.TeaSciresHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 教师科研及荣誉资质证书 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class TeaSciresHonorServiceImpl implements TeaSciresHonorService
{
	@Autowired
	private TeaSciresHonorMapper sciresHonorMapper;

	/**
     * 查询教师科研及荣誉资质证书信息
     * 
     * @param id 教师科研及荣誉资质证书ID
     * @return 教师科研及荣誉资质证书信息
     */
    @Override
	public TeaSciresHonor selectSciresHonorById(Integer id)
	{
	    return sciresHonorMapper.selectSciresHonorById(id);
	}
	
	/**
     * 查询教师科研及荣誉资质证书列表
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 教师科研及荣誉资质证书集合
     */
	@Override
	public List<TeaSciresHonor> selectSciresHonorList(TeaSciresHonor sciresHonor)
	{
	    return sciresHonorMapper.selectSciresHonorList(sciresHonor);
	}
	
    /**
     * 新增教师科研及荣誉资质证书
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 结果
     */
	@Override
	public int insertSciresHonor(TeaSciresHonor sciresHonor)
	{
	    return sciresHonorMapper.insertSciresHonor(sciresHonor);
	}
	
	/**
     * 修改教师科研及荣誉资质证书
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 结果
     */
	@Override
	public int updateSciresHonor(TeaSciresHonor sciresHonor)
	{
	    return sciresHonorMapper.updateSciresHonor(sciresHonor);
	}

	/**
     * 删除教师科研及荣誉资质证书对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSciresHonorByIds(String ids)
	{
		return sciresHonorMapper.deleteSciresHonorByIds(Convert.toStrArray(ids));
	}
	
}
