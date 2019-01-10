package com.ruoyi.system.service;

import com.ruoyi.system.domain.Multimedia;

import java.util.List;

/**
 * 多媒体教室 服务层
 * 
 * @author ruoyi
 * @date 2018-11-28
 */
public interface IMultimediaService 
{
	/**
     * 查询多媒体教室信息
     * 
     * @param id 多媒体教室ID
     * @return 多媒体教室信息
     */
	public Multimedia selectMultimediaById(Integer id);
	
	/**
     * 查询多媒体教室列表
     * 
     * @param multimedia 多媒体教室信息
     * @return 多媒体教室集合
     */
	public List<Multimedia> selectMultimediaList(Multimedia multimedia);
	
	/**
     * 新增多媒体教室
     * 
     * @param multimedia 多媒体教室信息
     * @return 结果
     */
	public int insertMultimedia(Multimedia multimedia);
	
	/**
     * 修改多媒体教室
     * 
     * @param multimedia 多媒体教室信息
     * @return 结果
     */
	public int updateMultimedia(Multimedia multimedia);
		
	/**
     * 删除多媒体教室信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMultimediaByIds(String ids);
	
}
