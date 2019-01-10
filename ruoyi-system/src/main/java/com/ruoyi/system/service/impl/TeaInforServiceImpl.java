package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.TeaInfor;
import com.ruoyi.system.mapper.TeaInforMapper;
import com.ruoyi.system.service.TeaInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 教师基本 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class TeaInforServiceImpl implements TeaInforService
{
	@Autowired
	private TeaInforMapper inforMapper;

	/**
     * 查询教师基本信息
     * 
     * @param id 教师基本ID
     * @return 教师基本信息
     */
    @Override
	public TeaInfor selectInforById(Integer id)
	{
	    return inforMapper.selectInforById(id);
	}

	/**
	 * 查询教师基本信息
	 *
	 * @param teaid 教师基本ID
	 * @return 教师基本信息
	 */
	@Override
	public TeaInfor selectInforByTeaId(Integer teaid) {
		return inforMapper.selectInforByTeaId(teaid);
	}

	/**
     * 查询教师基本列表
     * 
     * @param infor 教师基本信息
     * @return 教师基本集合
     */
	@Override
	public List<TeaInfor> selectInforList(TeaInfor infor)
	{
	    return inforMapper.selectInforList(infor);
	}
	
    /**
     * 新增教师基本
     * 
     * @param infor 教师基本信息
     * @return 结果
     */
	@Override
	public int insertInfor(TeaInfor infor)
	{
	    return inforMapper.insertInfor(infor);
	}
	
	/**
     * 修改教师基本
     * 
     * @param infor 教师基本信息
     * @return 结果
     */
	@Override
	public int updateInfor(TeaInfor infor)
	{
	    return inforMapper.updateInfor(infor);
	}

	/**
	 * 修改教师基本
	 *
	 * @param infor 教师基本信息
	 * @return 结果
	 */
	@Override
	public int updateInforByTeaId(TeaInfor infor) {
		return inforMapper.updateInforByTeaId(infor);
	}

	/**
     * 删除教师基本对象
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
