package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuInfor;
import com.ruoyi.system.mapper.StuInforMapper;
import com.ruoyi.system.service.IStuInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学生基本 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuInforServiceImpl implements IStuInforService
{
	@Autowired
	private StuInforMapper inforMapper;

	/**
     * 查询学生基本信息
     * 
     * @param id 学生基本ID
     * @return 学生基本信息
     */
    @Override
	public StuInfor selectInforById(Integer id)
	{
	    return inforMapper.selectInforById(id);
	}
	
	/**
     * 查询学生基本列表
     * 
     * @param infor 学生基本信息
     * @return 学生基本集合
     */
	@Override
	public List<StuInfor> selectInforList(StuInfor infor)
	{
	    return inforMapper.selectInforList(infor);
	}
	
    /**
     * 新增学生基本
     * 
     * @param infor 学生基本信息
     * @return 结果
     */
	@Override
	public int insertInfor(StuInfor infor)
	{
	    return inforMapper.insertInfor(infor);
	}
	
	/**
     * 修改学生基本
     * 
     * @param infor 学生基本信息
     * @return 结果
     */
	@Override
	public int updateInfor(StuInfor infor)
	{
	    return inforMapper.updateInfor(infor);
	}

	/**
     * 删除学生基本对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteInforByIds(String ids)
	{
		return inforMapper.deleteInforByIds(Convert.toStrArray(ids));
	}
	
}
