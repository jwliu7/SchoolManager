package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 学生成绩表 stu_score
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuScore extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 学生学号 */
	@Excel(name = "学生学号")
	private String stuid;
	/** 学生姓名 */
	@Excel(name = "学生姓名")
	private String name;
	/** 所属院系 */
	@Excel(name = "所属院系")
	private String department;
	/** 班级 */
	@Excel(name = "班级")
	private String stuClass;
	/** 学期 */
	@Excel(name = "学期")
	private String semester;
	/** 课程名称 */
	@Excel(name = "课程名称")
	private String course;
	/** 课程成绩 */
	@Excel(name = "课程成绩")
	private String score;
	/** 创建时间 */
	@Excel(name = "创建时间")
	private Date createTime;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setStuid(String stuid) 
	{
		this.stuid = stuid;
	}

	public String getStuid() 
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
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}
	public void setStuClass(String stuClass) 
	{
		this.stuClass = stuClass;
	}

	public String getStuClass() 
	{
		return stuClass;
	}
	public void setSemester(String semester) 
	{
		this.semester = semester;
	}

	public String getSemester() 
	{
		return semester;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}

	public String getCourse() 
	{
		return course;
	}
	public void setScore(String score) 
	{
		this.score = score;
	}

	public String getScore() 
	{
		return score;
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
            .append("stuid", getStuid())
            .append("name", getName())
            .append("department", getDepartment())
            .append("stuClass", getStuClass())
            .append("semester", getSemester())
            .append("course", getCourse())
            .append("score", getScore())
            .append("createTime", getCreateTime())
            .toString();
    }
}
