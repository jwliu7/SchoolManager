package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.DocAppretrsch;
import com.ruoyi.system.mapper.DocAppretrschMapper;
import com.ruoyi.system.service.IDocAppretrschService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 上传的文件 服务层实现
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
@Service
public class DocAppretrschServiceImpl implements IDocAppretrschService
{
	@Autowired
	private DocAppretrschMapper appretrschMapper;

	/**
     * 查询上传的文件信息
     * 
     * @param id 上传的文件ID
     * @return 上传的文件信息
     */
    @Override
	public DocAppretrsch selectAppretrschById(Integer id)
	{
	    return appretrschMapper.selectAppretrschById(id);
	}
	
	/**
     * 查询上传的文件列表
     * 
     * @param appretrsch 上传的文件信息
     * @return 上传的文件集合
     */
	@Override
	public List<DocAppretrsch> selectAppretrschList(DocAppretrsch appretrsch)
	{
	    return appretrschMapper.selectAppretrschList(appretrsch);
	}
	
    /**
     * 新增上传的文件
     * 
     * @param appretrsch 上传的文件信息
     * @return 结果
     */
	@Override
	public int insertAppretrsch(DocAppretrsch appretrsch)
	{
	    return appretrschMapper.insertAppretrsch(appretrsch);
	}
	
	/**
     * 修改上传的文件
     * 
     * @param appretrsch 上传的文件信息
     * @return 结果
     */
	@Override
	public int updateAppretrsch(DocAppretrsch appretrsch)
	{
	    return appretrschMapper.updateAppretrsch(appretrsch);
	}

	/**
     * 删除上传的文件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAppretrschByIds(String ids)
	{
		return appretrschMapper.deleteAppretrschByIds(Convert.toStrArray(ids));
	}

	@Override
	public DocAppretrsch queryFileByID(int id) {
		return appretrschMapper.selectByPrimaryKey(id);
	}
}
