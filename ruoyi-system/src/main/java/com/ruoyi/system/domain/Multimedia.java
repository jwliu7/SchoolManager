package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 多媒体教室表 rom_multimedia
 * 
 * @author ruoyi
 * @date 2018-11-28
 */
public class Multimedia extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Integer id;
	/** 教室 */
	private String classroom;
	/** 使用情况(0空闲，1已预约，2已租借) */
	private String state;
	/** 预约人 */
	private String appPeople;
	/** 预约时间 */
	private Date appTime;
	/** 使用人 */
	private String user;
	/** 开始时间 */
	private Date startTime;
	/** 结束时间 */
	private Date endTime;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setClassroom(String classroom) 
	{
		this.classroom = classroom;
	}

	public String getClassroom() 
	{
		return classroom;
	}
	public void setState(String state) 
	{
		this.state = state;
	}

	public String getState() 
	{
		return state;
	}
	public void setAppPeople(String appPeople) 
	{
		this.appPeople = appPeople;
	}

	public String getAppPeople() 
	{
		return appPeople;
	}
	public void setAppTime(Date appTime) 
	{
		this.appTime = appTime;
	}

	public Date getAppTime() 
	{
		return appTime;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}

	public String getUser() 
	{
		return user;
	}
	public void setStartTime(Date startTime) 
	{
		this.startTime = startTime;
	}

	public Date getStartTime() 
	{
		return startTime;
	}
	public void setEndTime(Date endTime) 
	{
		this.endTime = endTime;
	}

	public Date getEndTime() 
	{
		return endTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("classroom", getClassroom())
            .append("state", getState())
            .append("appPeople", getAppPeople())
            .append("appTime", getAppTime())
            .append("user", getUser())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
