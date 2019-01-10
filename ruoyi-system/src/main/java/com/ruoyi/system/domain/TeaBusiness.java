package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 教师业务表 tea_business
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class TeaBusiness extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 工号 */
	@Excel(name = "工号")
	private Integer teaid;
	/** 教师姓名 */
	@Excel(name = "教师姓名")
	private String name;
	/** 任教学期 */
	@Excel(name = "任教学期")
	private String teaSemester;
	/** 所教课程 */
	@Excel(name = "所教课程")
	private String curriculum;
	/** 班级 */
	@Excel(name = "班级")
	private String teachClass;
	/** 学生人数 */
	@Excel(name = "学生人数")
	private Integer stuNumber;
	/** 周数 */
	@Excel(name = "周数")
	private Integer weeks;
	/** 周学时数 */
	@Excel(name = "周学时数")
	private Integer weekPeriod;
	/** 实验课程 */
	@Excel(name = "实验课程")
	private String expeCourse;
	/** 实验课学时数 */
	@Excel(name = "实验课学时数")
	private Integer expeCourseTime;
	/** 指导实习情况 */
	@Excel(name = "指导实习情况")
	private String guideInternship;
	/** 指导毕业论文情况 */
	@Excel(name = "指导毕业论文情况")
	private String guideGraduation;
	/** 指导研究生情况 */
	@Excel(name = "指导研究生情况")
	private String guideGraduate;
	/** 是否新开课(1是  0不是) */
	@Excel(name = "是否新开课(1是  0不是)")
	private Integer newCourse;

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
	public void setTeaSemester(String teaSemester) 
	{
		this.teaSemester = teaSemester;
	}

	public String getTeaSemester() 
	{
		return teaSemester;
	}
	public void setCurriculum(String curriculum) 
	{
		this.curriculum = curriculum;
	}

	public String getCurriculum() 
	{
		return curriculum;
	}
	public void setTeachClass(String teachClass) 
	{
		this.teachClass = teachClass;
	}

	public String getTeachClass() 
	{
		return teachClass;
	}
	public void setStuNumber(Integer stuNumber) 
	{
		this.stuNumber = stuNumber;
	}

	public Integer getStuNumber() 
	{
		return stuNumber;
	}
	public void setWeeks(Integer weeks) 
	{
		this.weeks = weeks;
	}

	public Integer getWeeks() 
	{
		return weeks;
	}
	public void setWeekPeriod(Integer weekPeriod) 
	{
		this.weekPeriod = weekPeriod;
	}

	public Integer getWeekPeriod() 
	{
		return weekPeriod;
	}
	public void setExpeCourse(String expeCourse) 
	{
		this.expeCourse = expeCourse;
	}

	public String getExpeCourse() 
	{
		return expeCourse;
	}
	public void setExpeCourseTime(Integer expeCourseTime) 
	{
		this.expeCourseTime = expeCourseTime;
	}

	public Integer getExpeCourseTime() 
	{
		return expeCourseTime;
	}
	public void setGuideInternship(String guideInternship) 
	{
		this.guideInternship = guideInternship;
	}

	public String getGuideInternship() 
	{
		return guideInternship;
	}
	public void setGuideGraduation(String guideGraduation) 
	{
		this.guideGraduation = guideGraduation;
	}

	public String getGuideGraduation() 
	{
		return guideGraduation;
	}
	public void setGuideGraduate(String guideGraduate) 
	{
		this.guideGraduate = guideGraduate;
	}

	public String getGuideGraduate() 
	{
		return guideGraduate;
	}
	public void setNewCourse(Integer newCourse) 
	{
		this.newCourse = newCourse;
	}

	public Integer getNewCourse() 
	{
		return newCourse;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teaid", getTeaid())
            .append("name", getName())
            .append("teaSemester", getTeaSemester())
            .append("curriculum", getCurriculum())
            .append("teachClass", getTeachClass())
            .append("stuNumber", getStuNumber())
            .append("weeks", getWeeks())
            .append("weekPeriod", getWeekPeriod())
            .append("expeCourse", getExpeCourse())
            .append("expeCourseTime", getExpeCourseTime())
            .append("guideInternship", getGuideInternship())
            .append("guideGraduation", getGuideGraduation())
            .append("guideGraduate", getGuideGraduate())
            .append("newCourse", getNewCourse())
            .toString();
    }
}
