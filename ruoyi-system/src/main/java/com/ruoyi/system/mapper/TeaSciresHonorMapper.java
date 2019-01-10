package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TeaSciresHonor;
import java.util.List;

/**
 * 教师科研及荣誉资质证书 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface TeaSciresHonorMapper
{
	/**
     * 查询教师科研及荣誉资质证书信息
     * 
     * @param id 教师科研及荣誉资质证书ID
     * @return 教师科研及荣誉资质证书信息
     */
	public TeaSciresHonor selectSciresHonorById(Integer id);
	
	/**
     * 查询教师科研及荣誉资质证书列表
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 教师科研及荣誉资质证书集合
     */
	public List<TeaSciresHonor> selectSciresHonorList(TeaSciresHonor sciresHonor);
	
	/**
     * 新增教师科研及荣誉资质证书
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 结果
     */
	public int insertSciresHonor(TeaSciresHonor sciresHonor);
	
	/**
     * 修改教师科研及荣誉资质证书
     * 
     * @param sciresHonor 教师科研及荣誉资质证书信息
     * @return 结果
     */
	public int updateSciresHonor(TeaSciresHonor sciresHonor);
	
	/**
     * 删除教师科研及荣誉资质证书
     * 
     * @param id 教师科研及荣誉资质证书ID
     * @return 结果
     */
	public int deleteSciresHonorById(Integer id);
	
	/**
     * 批量删除教师科研及荣誉资质证书
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSciresHonorByIds(String[] ids);
	
}