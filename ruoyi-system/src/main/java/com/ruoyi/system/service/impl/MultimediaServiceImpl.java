package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.Multimedia;
import com.ruoyi.system.mapper.MultimediaMapper;
import com.ruoyi.system.service.IMultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 多媒体教室 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-28
 */
@Service
public class MultimediaServiceImpl implements IMultimediaService
{
	@Autowired
	private MultimediaMapper multimediaMapper;

	/**
     * 查询多媒体教室信息
     * 
     * @param id 多媒体教室ID
     * @return 多媒体教室信息
     */
    @Override
	public Multimedia selectMultimediaById(Integer id)
	{
	    return multimediaMapper.selectMultimediaById(id);
	}
	
	/**
     * 查询多媒体教室列表
     * 
     * @param multimedia 多媒体教室信息
     * @return 多媒体教室集合
     */
	@Override
	public List<Multimedia> selectMultimediaList(Multimedia multimedia)
	{
	    return multimediaMapper.selectMultimediaList(multimedia);
	}
	
    /**
     * 新增多媒体教室
     * 
     * @param multimedia 多媒体教室信息
     * @return 结果
     */
	@Override
	public int insertMultimedia(Multimedia multimedia)
	{
	    return multimediaMapper.insertMultimedia(multimedia);
	}
	
	/**
     * 修改多媒体教室
     * 
     * @param multimedia 多媒体教室信息
     * @return 结果
     */
	@Override
	public int updateMultimedia(Multimedia multimedia)
	{
	    return multimediaMapper.updateMultimedia(multimedia);
	}

	/**
     * 删除多媒体教室对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMultimediaByIds(String ids)
	{
		return multimediaMapper.deleteMultimediaByIds(Convert.toStrArray(ids));
	}
	
}
