package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.DocProject;
import com.ruoyi.system.mapper.DocProjectMapper;
import com.ruoyi.system.service.IDocProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 项目 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class DocProjectServiceImpl implements IDocProjectService
{
	@Autowired
	private DocProjectMapper projectMapper;

	/**
     * 查询项目信息
     * 
     * @param id 项目ID
     * @return 项目信息
     */
    @Override
	public DocProject selectProjectById(Integer id)
	{
	    return projectMapper.selectProjectById(id);
	}
	
	/**
     * 查询项目列表
     * 
     * @param project 项目信息
     * @return 项目集合
     */
	@Override
	public List<DocProject> selectProjectList(DocProject project)
	{
	    return projectMapper.selectProjectList(project);
	}
	
    /**
     * 新增项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	@Override
	public int insertProject(DocProject project)
	{
	    return projectMapper.insertProject(project);
	}
	
	/**
     * 修改项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	@Override
	public int updateProject(DocProject project)
	{
	    return projectMapper.updateProject(project);
	}

	/**
     * 删除项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProjectByIds(String ids)
	{
		return projectMapper.deleteProjectByIds(Convert.toStrArray(ids));
	}

	@Override
	public DocProject queryFileByID(int id) {
		return projectMapper.selectByPrimaryKey(id);
	}
}
