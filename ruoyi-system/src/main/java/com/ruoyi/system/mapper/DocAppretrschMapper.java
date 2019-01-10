package com.ruoyi.system.mapper;

import com.ruoyi.common.file.MyMapper;
import com.ruoyi.system.domain.DocAppretrsch;

import java.util.List;

/**
 * 上传的文件 数据层
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public interface DocAppretrschMapper extends MyMapper<DocAppretrsch>
{
	/**
     * 查询上传的文件信息
     * 
     * @param id 上传的文件ID
     * @return 上传的文件信息
     */
	public DocAppretrsch selectAppretrschById(Integer id);
	
	/**
     * 查询上传的文件列表
     * 
     * @param appretrsch 上传的文件信息
     * @return 上传的文件集合
     */
	public List<DocAppretrsch> selectAppretrschList(DocAppretrsch appretrsch);
	
	/**
     * 新增上传的文件
     * 
     * @param appretrsch 上传的文件信息
     * @return 结果
     */
	public int insertAppretrsch(DocAppretrsch appretrsch);
	
	/**
     * 修改上传的文件
     * 
     * @param appretrsch 上传的文件信息
     * @return 结果
     */
	public int updateAppretrsch(DocAppretrsch appretrsch);
	
	/**
     * 删除上传的文件
     * 
     * @param id 上传的文件ID
     * @return 结果
     */
	public int deleteAppretrschById(Integer id);
	
	/**
     * 批量删除上传的文件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAppretrschByIds(String[] ids);
	
}