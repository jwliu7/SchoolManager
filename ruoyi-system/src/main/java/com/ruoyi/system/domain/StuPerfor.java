package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 学生在校现情况表 stu_perfor
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuPerfor extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 学号 */
	private Integer stuid;
	/** 学生姓名 */
	private String name;
	/** 参与活动 */
	private String activities;
	/** 荣誉称号 */
	private String honor;
	/** 发表专著 */
	private String monographs;
	/** 成果奖项 */
	private String achievement;
	/** 参与项目 */
	private String projectinvo;
	/** 惩处违纪 */
	private String violation;
	/** 学生干部 */
	private String cadres;

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
	public void setActivities(String activities) 
	{
		this.activities = activities;
	}

	public String getActivities() 
	{
		return activities;
	}
	public void setHonor(String honor) 
	{
		this.honor = honor;
	}

	public String getHonor() 
	{
		return honor;
	}
	public void setMonographs(String monographs) 
	{
		this.monographs = monographs;
	}

	public String getMonographs() 
	{
		return monographs;
	}
	public void setAchievement(String achievement) 
	{
		this.achievement = achievement;
	}

	public String getAchievement() 
	{
		return achievement;
	}
	public void setProjectinvo(String projectinvo) 
	{
		this.projectinvo = projectinvo;
	}

	public String getProjectinvo() 
	{
		return projectinvo;
	}
	public void setViolation(String violation) 
	{
		this.violation = violation;
	}

	public String getViolation() 
	{
		return violation;
	}
	public void setCadres(String cadres) 
	{
		this.cadres = cadres;
	}

	public String getCadres() 
	{
		return cadres;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("activities", getActivities())
            .append("honor", getHonor())
            .append("monographs", getMonographs())
            .append("achievement", getAchievement())
            .append("projectinvo", getProjectinvo())
            .append("violation", getViolation())
            .append("cadres", getCadres())
            .toString();
    }
}
