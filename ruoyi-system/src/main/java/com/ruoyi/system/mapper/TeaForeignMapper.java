package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TeaForeign;
import java.util.List;	

/**
 * 外教基本 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface TeaForeignMapper
{
	/**
     * 查询外教基本信息
     * 
     * @param id 外教基本ID
     * @return 外教基本信息
     */
	public TeaForeign selectForeignById(Integer id);
	
	/**
     * 查询外教基本列表
     * 
     * @param foreign 外教基本信息
     * @return 外教基本集合
     */
	public List<TeaForeign> selectForeignList(TeaForeign foreign);
	
	/**
     * 新增外教基本
     * 
     * @param foreign 外教基本信息
     * @return 结果
     */
	public int insertForeign(TeaForeign foreign);
	
	/**
     * 修改外教基本
     * 
     * @param foreign 外教基本信息
     * @return 结果
     */
	public int updateForeign(TeaForeign foreign);
	
	/**
     * 删除外教基本
     * 
     * @param id 外教基本ID
     * @return 结果
     */
	public int deleteForeignById(Integer id);
	
	/**
     * 批量删除外教基本
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteForeignByIds(String[] ids);
	
}