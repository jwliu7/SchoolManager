package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.StuPerfor;
import com.ruoyi.system.mapper.StuPerforMapper;
import com.ruoyi.system.service.IStuPerforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 学生在校现情况 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class StuPerforServiceImpl implements IStuPerforService
{
	@Autowired
	private StuPerforMapper perforMapper;

	/**
     * 查询学生在校现情况信息
     * 
     * @param id 学生在校现情况ID
     * @return 学生在校现情况信息
     */
    @Override
	public StuPerfor selectPerforById(Integer id)
	{
	    return perforMapper.selectPerforById(id);
	}
	
	/**
     * 查询学生在校现情况列表
     * 
     * @param perfor 学生在校现情况信息
     * @return 学生在校现情况集合
     */
	@Override
	public List<StuPerfor> selectPerforList(StuPerfor perfor)
	{
	    return perforMapper.selectPerforList(perfor);
	}
	
    /**
     * 新增学生在校现情况
     * 
     * @param perfor 学生在校现情况信息
     * @return 结果
     */
	@Override
	public int insertPerfor(StuPerfor perfor)
	{
	    return perforMapper.insertPerfor(perfor);
	}
	
	/**
     * 修改学生在校现情况
     * 
     * @param perfor 学生在校现情况信息
     * @return 结果
     */
	@Override
	public int updatePerfor(StuPerfor perfor)
	{
	    return perforMapper.updatePerfor(perfor);
	}

	/**
     * 删除学生在校现情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePerforByIds(String ids)
	{
		return perforMapper.deletePerforByIds(Convert.toStrArray(ids));
	}
	
}
