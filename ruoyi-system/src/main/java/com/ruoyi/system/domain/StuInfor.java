package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 学生基本表 stu_infor
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuInfor extends BaseEntity
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
	/** 专业 */
	@Excel(name = "专业")
	private String professional;
	/** 年级 */
	@Excel(name = "年级")
	private String grade;
	/** 班级 */
	@Excel(name = "班级")
	private String stuClass;
	/** 宿舍 */
	@Excel(name = "宿舍")
	private String dormitory;
	/** 民族 */
	@Excel(name = "民族")
	private String national;
	/** 籍贯 */
	@Excel(name = "籍贯")
	private String nativePlace;
	/** 政治面貌 */
	@Excel(name = "政治面貌")
	private String political;
	/** 联系方式 */
	@Excel(name = "联系方式")
	private String contact;
	/** 出生日期 */
	@Excel(name = "出生日期")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date birthday;
	/** 家庭住址 */
	@Excel(name = "家庭住址")
	private String address;
	/** 家庭联系电话 */
	@Excel(name = "家庭联系电话")
	private String phone;
	/** 是否贫困生(1是 0不是) */
	@Excel(name = "是否贫困生(1是 0不是)")
	private Integer stuPoor;

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
	public void setProfessional(String professional) 
	{
		this.professional = professional;
	}

	public String getProfessional() 
	{
		return professional;
	}
	public void setGrade(String grade) 
	{
		this.grade = grade;
	}

	public String getGrade() 
	{
		return grade;
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
	public void setNational(String national) 
	{
		this.national = national;
	}

	public String getNational() 
	{
		return national;
	}
	public void setNativePlace(String nativePlace) 
	{
		this.nativePlace = nativePlace;
	}

	public String getNativePlace() 
	{
		return nativePlace;
	}
	public void setPolitical(String political) 
	{
		this.political = political;
	}

	public String getPolitical() 
	{
		return political;
	}
	public void setContact(String contact) 
	{
		this.contact = contact;
	}

	public String getContact() 
	{
		return contact;
	}
	public void setBirthday(Date birthday) 
	{
		this.birthday = birthday;
	}

	public Date getBirthday() 
	{
		return birthday;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setStuPoor(Integer stuPoor) 
	{
		this.stuPoor = stuPoor;
	}

	public Integer getStuPoor() 
	{
		return stuPoor;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .append("department", getDepartment())
            .append("professional", getProfessional())
            .append("grade", getGrade())
            .append("stuClass", getStuClass())
            .append("dormitory", getDormitory())
            .append("national", getNational())
            .append("nativePlace", getNativePlace())
            .append("political", getPolitical())
            .append("contact", getContact())
            .append("birthday", getBirthday())
            .append("address", getAddress())
            .append("phone", getPhone())
            .append("stuPoor", getStuPoor())
            .toString();
    }
}
