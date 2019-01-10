package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 教师科研及荣誉资质证书表 tea_scires_honor
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class TeaSciresHonor extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 工号 */
	private Integer teaid;
	/** 教师姓名 */
	private String name;
	/** 论文题目 */
	private String paperTopics;
	/** 刊物名称 */
	private String publication;
	/** 发表时间 */
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date publishedTime;
	/** 论文获奖情况 */
	private String awards;
	/** 科研课题 */
	private String researchSubject;
	/** 课题来源 */
	private String topicSource;
	/** 科研项目名称 */
	private String researchProject;
	/** 起止年份 */
	private String fromYear;
	/** 本人作用 */
	private String myRole;
	/** 荣获奖励 */
	private String award;
	/** 获奖级别 */
	private String awardLevel;
	/** 荣誉证书 */
	private String certificateHonor;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setTeaid(Integer teaid) 
	{
		this.teaid = teaid;
	}

	public Integer getTeaid() 
	{
		return teaid;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPaperTopics(String paperTopics) 
	{
		this.paperTopics = paperTopics;
	}

	public String getPaperTopics() 
	{
		return paperTopics;
	}
	public void setPublication(String publication) 
	{
		this.publication = publication;
	}

	public String getPublication() 
	{
		return publication;
	}
	public void setPublishedTime(Date publishedTime) 
	{
		this.publishedTime = publishedTime;
	}

	public Date getPublishedTime() 
	{
		return publishedTime;
	}
	public void setAwards(String awards) 
	{
		this.awards = awards;
	}

	public String getAwards() 
	{
		return awards;
	}
	public void setResearchSubject(String researchSubject) 
	{
		this.researchSubject = researchSubject;
	}

	public String getResearchSubject() 
	{
		return researchSubject;
	}
	public void setTopicSource(String topicSource) 
	{
		this.topicSource = topicSource;
	}

	public String getTopicSource() 
	{
		return topicSource;
	}
	public void setResearchProject(String researchProject) 
	{
		this.researchProject = researchProject;
	}

	public String getResearchProject() 
	{
		return researchProject;
	}
	public void setFromYear(String fromYear) 
	{
		this.fromYear = fromYear;
	}

	public String getFromYear() 
	{
		return fromYear;
	}
	public void setMyRole(String myRole) 
	{
		this.myRole = myRole;
	}

	public String getMyRole() 
	{
		return myRole;
	}
	public void setAward(String award) 
	{
		this.award = award;
	}

	public String getAward() 
	{
		return award;
	}
	public void setAwardLevel(String awardLevel) 
	{
		this.awardLevel = awardLevel;
	}

	public String getAwardLevel() 
	{
		return awardLevel;
	}
	public void setCertificateHonor(String certificateHonor) 
	{
		this.certificateHonor = certificateHonor;
	}

	public String getCertificateHonor() 
	{
		return certificateHonor;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teaid", getTeaid())
            .append("name", getName())
            .append("paperTopics", getPaperTopics())
            .append("publication", getPublication())
            .append("publishedTime", getPublishedTime())
            .append("awards", getAwards())
            .append("researchSubject", getResearchSubject())
            .append("topicSource", getTopicSource())
            .append("researchProject", getResearchProject())
            .append("fromYear", getFromYear())
            .append("myRole", getMyRole())
            .append("award", getAward())
            .append("awardLevel", getAwardLevel())
            .append("certificateHonor", getCertificateHonor())
            .toString();
    }
}
