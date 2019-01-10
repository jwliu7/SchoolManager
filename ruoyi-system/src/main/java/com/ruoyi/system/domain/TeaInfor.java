package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;

import java.util.Date;

/**
 * 教师基本表 tea_infor
 *
 * @author ruoyi
 * @date 2018-11-01
 */

public class TeaInfor extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**  */
    private Integer id;
    /**
     * 工号
     */
    @Excel(name = "工号")
    private Integer teaid;
    /**
     * 姓名
     */
    @Excel(name = "姓名")
    private String name;
    /**
     * 性别(0为男，1为女)
     */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;
    /**
     * 年龄
     */
    @Excel(name = "年龄")
    private Integer age;
    /**
     * 出生日期
     */
    @Excel(name = "出生日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String birthday;
    /**
     * 民族
     */
    @Excel(name = "民族")
    private String national;
    /**
     * 籍贯
     */
    @Excel(name = "籍贯")
    private String place;
    /**
     * 所属系部
     */
    @Excel(name = "所属系部")
    private String department;
    /**
     * 学科方向
     */
    @Excel(name = "学科方向")
    private String discipline;
    /**
     * 政治面貌
     */
    @Excel(name = "政治面貌")
    private String political;
    /**
     * 学历
     */
    @Excel(name = "学历")
    private String record;
    /**
     * 毕业时间
     */
    @Excel(name = "毕业时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String gradTime;
    /**
     * 毕业学校
     */
    @Excel(name = "毕业学校")
    private String gradSchool;
    /**
     * 毕业专业
     */
    @Excel(name = "毕业专业")
    private String gradProfe;
    /**
     * 学位
     */
    @Excel(name = "学位")
    private String degree;
    /**
     * 学位获得时间
     */
    @Excel(name = "学位获得时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String degreeTime;
    /**
     * 职称
     */
    @Excel(name = "职称")
    private String title;
    /**
     * 职称确定时间
     */
    @Excel(name = "职称确定时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String titleTime;
    /**
     * 行政职务
     */
    @Excel(name = "行政职务")
    private String istrativeDuties;
    /**
     * 任职时间
     */
    @Excel(name = "任职时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String employmentTime;
    /**
     * 计算机过级等级
     */
    @Excel(name = "计算机过级等级")
    private Integer computerRank;
    /**
     * 英语语种
     */
    @Excel(name = "英语语种")
    private String englishLanguage;
    /**
     * 英语水平
     */
    @Excel(name = "英语水平")
    private Integer englishLevel;
    /**
     * 主要教学课程
     */
    @Excel(name = "主要教学课程")
    private String teachingCourses;
    /**
     * 校内外及其它社会兼职
     */
    @Excel(name = "校内外及其它社会兼职")
    private String socialpart;
    /**
     * 参加何种学会任何职
     */
    @Excel(name = "参加何种学会任何职")
    private String learntoserve;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getNational() {
        return national;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getPolitical() {
        return political;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getRecord() {
        return record;
    }

    public void setGradTime(String gradTime) {
        this.gradTime = gradTime;
    }

    public String getGradTime() {
        return gradTime;
    }

    public void setGradSchool(String gradSchool) {
        this.gradSchool = gradSchool;
    }

    public String getGradSchool() {
        return gradSchool;
    }

    public void setGradProfe(String gradProfe) {
        this.gradProfe = gradProfe;
    }

    public String getGradProfe() {
        return gradProfe;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegreeTime(String degreeTime) {
        this.degreeTime = degreeTime;
    }

    public String getDegreeTime() {
        return degreeTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitleTime(String titleTime) {
        this.titleTime = titleTime;
    }

    public String getTitleTime() {
        return titleTime;
    }

    public void setIstrativeDuties(String istrativeDuties) {
        this.istrativeDuties = istrativeDuties;
    }

    public String getIstrativeDuties() {
        return istrativeDuties;
    }

    public void setEmploymentTime(String employmentTime) {
        this.employmentTime = employmentTime;
    }

    public String getEmploymentTime() {
        return employmentTime;
    }

    public void setComputerRank(Integer computerRank) {
        this.computerRank = computerRank;
    }

    public Integer getComputerRank() {
        return computerRank;
    }

    public void setEnglishLanguage(String englishLanguage) {
        this.englishLanguage = englishLanguage;
    }

    public String getEnglishLanguage() {
        return englishLanguage;
    }

    public void setEnglishLevel(Integer englishLevel) {
        this.englishLevel = englishLevel;
    }

    public Integer getEnglishLevel() {
        return englishLevel;
    }

    public void setTeachingCourses(String teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    public String getTeachingCourses() {
        return teachingCourses;
    }

    public void setSocialpart(String socialpart) {
        this.socialpart = socialpart;
    }

    public String getSocialpart() {
        return socialpart;
    }

    public void setLearntoserve(String learntoserve) {
        this.learntoserve = learntoserve;
    }

    public String getLearntoserve() {
        return learntoserve;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("teaid", getTeaid())
                .append("name", getName())
                .append("sex", getSex())
                .append("age", getAge())
                .append("birthday", getBirthday())
                .append("national", getNational())
                .append("place", getPlace())
                .append("department", getDepartment())
                .append("discipline", getDiscipline())
                .append("political", getPolitical())
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
                .append("computerRank", getComputerRank())
                .append("englishLanguage", getEnglishLanguage())
                .append("englishLevel", getEnglishLevel())
                .append("teachingCourses", getTeachingCourses())
                .append("socialpart", getSocialpart())
                .append("learntoserve", getLearntoserve())
                .toString();
    }
}
