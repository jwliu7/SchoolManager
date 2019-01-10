package com.ruoyi.system.service;

import com.ruoyi.system.domain.DocProject;

import java.util.List;

/**
 * 项目 服务层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface IDocProjectService
{
	/**
     * 查询项目信息
     * 
     * @param id 项目ID
     * @return 项目信息
     */
	public DocProject selectProjectById(Integer id);
	
	/**
     * 查询项目列表
     * 
     * @param project 项目信息
     * @return 项目集合
     */
	public List<DocProject> selectProjectList(DocProject project);
	
	/**
     * 新增项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	public int insertProject(DocProject project);
	
	/**
     * 修改项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	public int updateProject(DocProject project);
		
	/**
     * 删除项目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectByIds(String ids);

	public DocProject queryFileByID(int id);
}
