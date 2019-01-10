package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 出国留学生表 stu_abroad
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuAbroad extends BaseEntity
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
	/** 性别(0为男，1为女) */
	@Excel(name = "性别(0为男，1为女)")
	private Integer sex;
	/** 年龄 */
	@Excel(name = "年龄")
	private Integer age;
	/** 联系电话 */
	@Excel(name = "联系电话")
	private String phone;
	/** 专业 */
	@Excel(name = "专业")
	private String professional;
	/** 留学国家 */
	@Excel(name = "留学国家")
	private String stuAbroadCountries;
	/** 留学时间 */
	@Excel(name = "留学时间")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date stuTime;
	/** 留学地点 */
	@Excel(name = "留学地点")
	private String destinations;
	/** 留学类型 */
	@Excel(name = "留学类型")
	private String studyingType;
	/** 类型转换 */
	@Excel(name = "类型转换")
	private String typeConversion;
	/** 校纪信息 */
	@Excel(name = "校纪信息")
	private String rulesInformation;

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
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setProfessional(String professional) 
	{
		this.professional = professional;
	}

	public String getProfessional() 
	{
		return professional;
	}
	public void setStuAbroadCountries(String stuAbroadCountries) 
	{
		this.stuAbroadCountries = stuAbroadCountries;
	}

	public String getStuAbroadCountries() 
	{
		return stuAbroadCountries;
	}
	public void setStuTime(Date stuTime) 
	{
		this.stuTime = stuTime;
	}

	public Date getStuTime() 
	{
		return stuTime;
	}
	public void setDestinations(String destinations) 
	{
		this.destinations = destinations;
	}

	public String getDestinations() 
	{
		return destinations;
	}
	public void setStudyingType(String studyingType) 
	{
		this.studyingType = studyingType;
	}

	public String getStudyingType() 
	{
		return studyingType;
	}
	public void setTypeConversion(String typeConversion) 
	{
		this.typeConversion = typeConversion;
	}

	public String getTypeConversion() 
	{
		return typeConversion;
	}
	public void setRulesInformation(String rulesInformation) 
	{
		this.rulesInformation = rulesInformation;
	}

	public String getRulesInformation() 
	{
		return rulesInformation;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("sex", getSex())
            .append("age", getAge())
            .append("phone", getPhone())
            .append("professional", getProfessional())
            .append("stuAbroadCountries", getStuAbroadCountries())
            .append("stuTime", getStuTime())
            .append("destinations", getDestinations())
            .append("studyingType", getStudyingType())
            .append("typeConversion", getTypeConversion())
            .append("rulesInformation", getRulesInformation())
            .toString();
    }
}
