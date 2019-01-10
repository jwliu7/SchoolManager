package com.ruoyi.system.service;

import com.ruoyi.system.domain.TeaBusiness;
import java.util.List;

/**
 * 教师业务 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface TeaBusinessService
{
	/**
     * 查询教师业务信息
     * 
     * @param id 教师业务ID
     * @return 教师业务信息
     */
	public TeaBusiness selectBusinessById(Integer id);
	
	/**
     * 查询教师业务列表
     * 
     * @param business 教师业务信息
     * @return 教师业务集合
     */
	public List<TeaBusiness> selectBusinessList(TeaBusiness business);
	
	/**
     * 新增教师业务
     * 
     * @param business 教师业务信息
     * @return 结果
     */
	public int insertBusiness(TeaBusiness business);
	
	/**
     * 修改教师业务
     * 
     * @param business 教师业务信息
     * @return 结果
     */
	public int updateBusiness(TeaBusiness business);
		
	/**
     * 删除教师业务信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBusinessByIds(String ids);
	
}
