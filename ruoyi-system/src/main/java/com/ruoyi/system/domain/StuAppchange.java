package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

/**
 * 学生学籍变更表 stu_appchange
 * 
 * @author ruoyi
 * @date 2018-11-01
 */
public class StuAppchange extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/** 学号 */
	private Integer stuid;
	/** 姓名 */
	private String name;
	/** 所属院系 */
	private String department;
	/** 原专业 */
	private String originalProfessional;
	/** 变更专业 */
	private String changeProfessional;
	/** 班级 */
	private String stuClass;
	/** 学籍变更原因 */
	private String reasonsChange;
	/** 学籍变更申请(1通过 2未通过) */
	private Integer applicationChange;

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
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setOriginalProfessional(String originalProfessional) {
		this.originalProfessional = originalProfessional;
	}

	public String getOriginalProfessional(){
		return originalProfessional;
	}

	public void setChangeProfessional(String changeProfessional) {
		this.changeProfessional = changeProfessional;
	}

	public String getChangeProfessional() {
		return changeProfessional;
	}

	public void setStuClass(String stuClass)
	{
		this.stuClass = stuClass;
	}

	public String getStuClass() 
	{
		return stuClass;
	}
	public void setReasonsChange(String reasonsChange) 
	{
		this.reasonsChange = reasonsChange;
	}

	public String getReasonsChange() 
	{
		return reasonsChange;
	}
	public void setApplicationChange(Integer applicationChange) 
	{
		this.applicationChange = applicationChange;
	}

	public Integer getApplicationChange() 
	{
		return applicationChange;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("department", getDepartment())
            .append("originalProfessional", getOriginalProfessional())
			.append("changeProfessional", getChangeProfessional())
            .append("stuClass", getStuClass())
            .append("reasonsChange", getReasonsChange())
            .append("applicationChange", getApplicationChange())
            .toString();
    }
}
