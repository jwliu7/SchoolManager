package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 学生异常表 stu_abnormal
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuAbnormal extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 学生学号 */
	private Integer stuid;
	/** 学生姓名 */
	private String name;
	/** 异常信息 */
	private String abnormalInformation;
	/** 心理异常 */
	private String abnormalPsychology;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setStuid(Integer stuid) 
	{
		this.stuid = stuid;
	}

	public Integer getStuid() 
	{
		return stuid;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setAbnormalInformation(String abnormalInformation) 
	{
		this.abnormalInformation = abnormalInformation;
	}

	public String getAbnormalInformation() 
	{
		return abnormalInformation;
	}
	public void setAbnormalPsychology(String abnormalPsychology) 
	{
		this.abnormalPsychology = abnormalPsychology;
	}

	public String getAbnormalPsychology() 
	{
		return abnormalPsychology;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("abnormalInformation", getAbnormalInformation())
            .append("abnormalPsychology", getAbnormalPsychology())
            .toString();
    }
}
