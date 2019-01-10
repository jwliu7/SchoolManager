package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 外国留学生表 stu_foreign
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuForeign extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 学号 */
	@Excel(name = "学号")
	private Integer stuid;
	/** 学生姓名 */
	@Excel(name = "学生姓名")
	private String name;
	/** 年龄 */
	@Excel(name = "年龄")
	private Integer age;
	/** 性别(0为男，1为女) */
	@Excel(name = "性别(0为男，1为女)")
	private Integer sex;
	/** 所属院系 */
	@Excel(name = "所属院系")
	private String department;
	/** 年级 */
	@Excel(name = "年级")
	private String grade;
	/** 专业 */
	@Excel(name = "专业")
	private String professional;
	/** 班级 */
	@Excel(name = "班级")
	private String stuClass;
	/** 宿舍 */
	@Excel(name = "宿舍")
	private String dormitory;
	/** 联系方式 */
	@Excel(name = "联系方式")
	private String phone;
	/** 出生日期 */
	@Excel(name = "出生日期")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date birthday;
	/** 所属国家 */
	@Excel(name = "所属国家")
	private String country;
	/** 所属学院 */
	@Excel(name = "所属学院")
	private String college;
	/** 留学时间 */
	@Excel(name = "留学时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date stuTime;
	/** 留学类型 */
	@Excel(name = "留学类型")
	private String studyingType;

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
	public void setAge(Integer age) 
	{
		this.age = age;
	}

	public Integer getAge() 
	{
		return age;
	}
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}
	public void setGrade(String grade) 
	{
		this.grade = grade;
	}

	public String getGrade() 
	{
		return grade;
	}
	public void setProfessional(String professional) 
	{
		this.professional = professional;
	}

	public String getProfessional() 
	{
		return professional;
	}
	public void setStuClass(String stuClass) 
	{
		this.stuClass = stuClass;
	}

	public String getStuClass() 
	{
		return stuClass;
	}
	public void setDormitory(String dormitory) 
	{
		this.dormitory = dormitory;
	}

	public String getDormitory() 
	{
		return dormitory;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}

	public Date getBirthday() 
	{
		return birthday;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getCountry() 
	{
		return country;
	}
	public void setCollege(String college) 
	{
		this.college = college;
	}

	public String getCollege() 
	{
		return college;
	}
	public void setStuTime(Date stuTime) 
	{
		this.stuTime = stuTime;
	}

	public Date getStuTime() 
	{
		return stuTime;
	}
	public void setStudyingType(String studyingType) 
	{
		this.studyingType = studyingType;
	}

	public String getStudyingType() 
	{
		return studyingType;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .append("department", getDepartment())
            .append("grade", getGrade())
            .append("professional", getProfessional())
            .append("stuClass", getStuClass())
            .append("dormitory", getDormitory())
            .append("phone", getPhone())
            .append("birthday", getBirthday())
            .append("country", getCountry())
            .append("college", getCollege())
            .append("stuTime", getStuTime())
            .append("studyingType", getStudyingType())
            .toString();
    }
}
