package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 外教基本表 tea_foreign
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class TeaForeign extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 工号 */
	@Excel(name = "工号")
	private Integer teaid;
	/** 外教姓名 */
	@Excel(name = "外教姓名")
	private String name;
	/** 性别(0为男，1为女) */
	@Excel(name = "性别(0为男，1为女)")
	private Integer sex;
	/** 年龄 */
	@Excel(name = "年龄")
	private Integer age;
	/** 出生日期 */
	@Excel(name = "出生日期")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date birthday;
	/** 国籍 */
	@Excel(name = "国籍")
	private String nationality;
	/** 所属系部 */
	@Excel(name = "所属系部")
	private String department;
	/** 学科方向 */
	@Excel(name = "学科方向")
	private String discipline;
	/** 学历 */
	@Excel(name = "学历")
	private String record;
	/** 毕业时间 */
	@Excel(name = "毕业时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date gradTime;
	/** 毕业学院 */
	@Excel(name = "毕业学院")
	private String gradSchool;
	/** 毕业专业 */
	@Excel(name = "毕业专业")
	private String gradProfe;
	/** 学位 */
	@Excel(name = "学位")
	private String degree;
	/** 学位获得时间 */
	@Excel(name = "学位获得时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date degreeTime;
	/** 职称 */
	@Excel(name = "职称")
	private String title;
	/** 职称确认时间 */
	@Excel(name = "职称确认时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date titleTime;
	/** 行政职务 */
	@Excel(name = "行政职务")
	private String istrativeDuties;
	/** 任职时间 */
	@Excel(name = "任职时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date employmentTime;
	/** 任职类型 */
	@Excel(name = "任职类型")
	private String fortype;
	/** 所教学科 */
	@Excel(name = "所教学科")
	private String taughtSubjects;
	/** 课时 */
	@Excel(name = "课时")
	private String classTime;

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
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
	}
	public void setAge(Integer age) 
	{
		this.age = age;
	}

	public Integer getAge() 
	{
		return age;
	}
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}

	public Date getBirthday() 
	{
		return birthday;
	}
	public void setNationality(String nationality) 
	{
		this.nationality = nationality;
	}

	public String getNationality() 
	{
		return nationality;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}
	public void setDiscipline(String discipline) 
	{
		this.discipline = discipline;
	}

	public String getDiscipline() 
	{
		return discipline;
	}
	public void setRecord(String record) 
	{
		this.record = record;
	}

	public String getRecord() 
	{
		return record;
	}
	public void setGradTime(Date gradTime) 
	{
		this.gradTime = gradTime;
	}

	public Date getGradTime() 
	{
		return gradTime;
	}
	public void setGradSchool(String gradSchool) 
	{
		this.gradSchool = gradSchool;
	}

	public String getGradSchool() 
	{
		return gradSchool;
	}
	public void setGradProfe(String gradProfe) 
	{
		this.gradProfe = gradProfe;
	}

	public String getGradProfe() 
	{
		return gradProfe;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}

	public String getDegree() 
	{
		return degree;
	}
	public void setDegreeTime(Date degreeTime) 
	{
		this.degreeTime = degreeTime;
	}

	public Date getDegreeTime() 
	{
		return degreeTime;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setTitleTime(Date titleTime) 
	{
		this.titleTime = titleTime;
	}

	public Date getTitleTime() 
	{
		return titleTime;
	}
	public void setIstrativeDuties(String istrativeDuties) 
	{
		this.istrativeDuties = istrativeDuties;
	}

	public String getIstrativeDuties() 
	{
		return istrativeDuties;
	}
	public void setEmploymentTime(Date employmentTime) 
	{
		this.employmentTime = employmentTime;
	}

	public Date getEmploymentTime() 
	{
		return employmentTime;
	}
	public void setFortype(String fortype) 
	{
		this.fortype = fortype;
	}

	public String getFortype() 
	{
		return fortype;
	}
	public void setTaughtSubjects(String taughtSubjects) 
	{
		this.taughtSubjects = taughtSubjects;
	}

	public String getTaughtSubjects() 
	{
		return taughtSubjects;
	}
	public void setClassTime(String classTime) 
	{
		this.classTime = classTime;
	}

	public String getClassTime() 
	{
		return classTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teaid", getTeaid())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("birthday", getBirthday())
            .append("nationality", getNationality())
            .append("department", getDepartment())
            .append("discipline", getDiscipline())
            .append("record", getRecord())
            .append("gradTime", getGradTime())
            .append("gradSchool", getGradSchool())
            .append("gradProfe", getGradProfe())
            .append("degree", getDegree())
            .append("degreeTime", getDegreeTime())
            .append("title", getTitle())
            .append("titleTime", getTitleTime())
            .append("istrativeDuties", getIstrativeDuties())
            .append("employmentTime", getEmploymentTime())
            .append("fortype", getFortype())
            .append("taughtSubjects", getTaughtSubjects())
            .append("classTime", getClassTime())
            .toString();
    }
}
