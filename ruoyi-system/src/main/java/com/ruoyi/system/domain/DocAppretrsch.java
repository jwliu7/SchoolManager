package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 上传的文件表 doc_appretrsch
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class DocAppretrsch extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 文件原名 */
	private String filename;
	/** 文件名称 */
	private String nowname;
	/** 存放位置 */
	private String savepath;
	/** 访问地址 */
	private String url;
	/** 文件类型 */
	private String filetype;
	/** 文件大小(字节) */
	private Long filesize;
	/** 上传时间 */
	private Date addtime;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setFilename(String filename) 
	{
		this.filename = filename;
	}

	public String getFilename() 
	{
		return filename;
	}
	public void setNowname(String nowname) 
	{
		this.nowname = nowname;
	}

	public String getNowname() 
	{
		return nowname;
	}
	public void setSavepath(String savepath) 
	{
		this.savepath = savepath;
	}

	public String getSavepath() 
	{
		return savepath;
	}
	public void setUrl(String url) 
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	public void setFiletype(String filetype) 
	{
		this.filetype = filetype;
	}

	public String getFiletype() 
	{
		return filetype;
	}
	public void setFilesize(Long filesize) 
	{
		this.filesize = filesize;
	}

	public Long getFilesize() 
	{
		return filesize;
	}
	public void setAddtime(Date addtime) 
	{
		this.addtime = addtime;
	}

	public Date getAddtime() 
	{
		return addtime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("filename", getFilename())
            .append("nowname", getNowname())
            .append("savepath", getSavepath())
            .append("url", getUrl())
            .append("filetype", getFiletype())
            .append("filesize", getFilesize())
            .append("addtime", getAddtime())
            .toString();
    }
}
