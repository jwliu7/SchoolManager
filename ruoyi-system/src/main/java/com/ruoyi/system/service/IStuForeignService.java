package com.ruoyi.system.service;

import com.ruoyi.system.domain.StuForeign;

import java.util.List;

/**
 * 外国留学生 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IStuForeignService
{
	/**
     * 查询外国留学生信息
     * 
     * @param id 外国留学生ID
     * @return 外国留学生信息
     */
	public StuForeign selectForeignById(Integer id);
	
	/**
     * 查询外国留学生列表
     * 
     * @param foreign 外国留学生信息
     * @return 外国留学生集合
     */
	public List<StuForeign> selectForeignList(StuForeign foreign);
	
	/**
     * 新增外国留学生
     * 
     * @param foreign 外国留学生信息
     * @return 结果
     */
	public int insertForeign(StuForeign foreign);
	
	/**
     * 修改外国留学生
     * 
     * @param foreign 外国留学生信息
     * @return 结果
     */
	public int updateForeign(StuForeign foreign);
		
	/**
     * 删除外国留学生信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteForeignByIds(String ids);
	
}
