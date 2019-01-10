package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 附件表 sys_attachment
 * 
 * @author ruoyi
 * @date 2018-12-26
 */
public class Attachment extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Long id;
	/** 业务类型 */
	private String businessType;
	/** 业务Id */
	private String businessId;
	/** 文件路径 */
	private String filePath;
	/** 真实的文件名 */
	private String fileNameReal;
	/** 显示用的文件名 */
	private String fileNameShow;
	/** 文件大小 */
	private Long fileSize;
	/** 删除标记 */
	private Integer delFlag;
	/** 创建时间 */
	private Date createTime;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setBusinessType(String businessType) 
	{
		this.businessType = businessType;
	}

	public String getBusinessType() 
	{
		return businessType;
	}
	public void setBusinessId(String businessId) 
	{
		this.businessId = businessId;
	}

	public String getBusinessId() 
	{
		return businessId;
	}
	public void setFilePath(String filePath) 
	{
		this.filePath = filePath;
	}

	public String getFilePath() 
	{
		return filePath;
	}
	public void setFileNameReal(String fileNameReal) 
	{
		this.fileNameReal = fileNameReal;
	}

	public String getFileNameReal() 
	{
		return fileNameReal;
	}
	public void setFileNameShow(String fileNameShow) 
	{
		this.fileNameShow = fileNameShow;
	}

	public String getFileNameShow() 
	{
		return fileNameShow;
	}
	public void setFileSize(Long fileSize) 
	{
		this.fileSize = fileSize;
	}

	public Long getFileSize() 
	{
		return fileSize;
	}
	public void setDelFlag(Integer delFlag) 
	{
		this.delFlag = delFlag;
	}

	public Integer getDelFlag() 
	{
		return delFlag;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("businessType", getBusinessType())
            .append("businessId", getBusinessId())
            .append("filePath", getFilePath())
            .append("fileNameReal", getFileNameReal())
            .append("fileNameShow", getFileNameShow())
            .append("fileSize", getFileSize())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .toString();
    }
}
