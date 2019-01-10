package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.Attachment;
import com.ruoyi.system.mapper.AttachmentMapper;
import com.ruoyi.system.service.IAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 附件 服务层实现
 * 
 * @author ruoyi
 * @date 2018-12-26
 */
@Service
public class AttachmentServiceImpl implements IAttachmentService
{
	@Autowired
	private AttachmentMapper attachmentMapper;

	/**
     * 查询附件信息
     * 
     * @param id 附件ID
     * @return 附件信息
     */
    @Override
	public Attachment selectAttachmentById(Long id)
	{
	    return attachmentMapper.selectAttachmentById(id);
	}
	
	/**
     * 查询附件列表
     * 
     * @param attachment 附件信息
     * @return 附件集合
     */
	@Override
	public List<Attachment> selectAttachmentList(Attachment attachment)
	{
	    return attachmentMapper.selectAttachmentList(attachment);
	}
	
    /**
     * 新增附件
     * 
     * @param attachment 附件信息
     * @return 结果
     */
	@Override
	public int insertAttachment(Attachment attachment)
	{
	    return attachmentMapper.insertAttachment(attachment);
	}
	
	/**
     * 修改附件
     * 
     * @param attachment 附件信息
     * @return 结果
     */
	@Override
	public int updateAttachment(Attachment attachment)
	{
	    return attachmentMapper.updateAttachment(attachment);
	}

	/**
     * 删除附件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAttachmentByIds(String ids)
	{
		return attachmentMapper.deleteAttachmentByIds(Convert.toStrArray(ids));
	}
	
}
