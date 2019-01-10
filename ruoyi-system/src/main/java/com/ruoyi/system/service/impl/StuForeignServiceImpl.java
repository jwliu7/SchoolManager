package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuForeign;
import com.ruoyi.system.mapper.StuForeignMapper;
import com.ruoyi.system.service.IStuForeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 外国留学生 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuForeignServiceImpl implements IStuForeignService
{
	@Autowired
	private StuForeignMapper foreignMapper;

	/**
     * 查询外国留学生信息
     * 
     * @param id 外国留学生ID
     * @return 外国留学生信息
     */
    @Override
	public StuForeign selectForeignById(Integer id)
	{
	    return foreignMapper.selectForeignById(id);
	}
	
	/**
     * 查询外国留学生列表
     * 
     * @param foreign 外国留学生信息
     * @return 外国留学生集合
     */
	@Override
	public List<StuForeign> selectForeignList(StuForeign foreign)
	{
	    return foreignMapper.selectForeignList(foreign);
	}
	
    /**
     * 新增外国留学生
     * 
     * @param foreign 外国留学生信息
     * @return 结果
     */
	@Override
	public int insertForeign(StuForeign foreign)
	{
	    return foreignMapper.insertForeign(foreign);
	}
	
	/**
     * 修改外国留学生
     * 
     * @param foreign 外国留学生信息
     * @return 结果
     */
	@Override
	public int updateForeign(StuForeign foreign)
	{
	    return foreignMapper.updateForeign(foreign);
	}

	/**
     * 删除外国留学生对象
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
