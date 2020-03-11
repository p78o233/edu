package com.example.educonnamddata.eduSchool;/*
 * @author p78o2
 * @date 2020/3/9
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "班级表")
public class EduClass implements Serializable {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "学校id")
    private int schoolId;
    @ApiModelProperty(value = "入学年份")
    private int enterYear;
    @ApiModelProperty(value = "班级名称")
    private String className;
    @ApiModelProperty(value = "班主任id")
    private int classMasterId;
    @ApiModelProperty(value = "创建班级的老师id")
    private int createTeacherId;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改老师id")
    private int modifyTeacherId;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "是否删除")
    private boolean isdel;

    public EduClass() {
    }

    @Override
    public String toString() {
        return "EduClass{" +
                "id=" + id +
                ", schoolId=" + schoolId +
                ", enterYear=" + enterYear +
                ", className='" + className + '\'' +
                ", classMasterId=" + classMasterId +
                ", createTeacherId=" + createTeacherId +
                ", createTime=" + createTime +
                ", modifyTeacherId=" + modifyTeacherId +
                ", modifyTime=" + modifyTime +
                ", isdel=" + isdel +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(int enterYear) {
        this.enterYear = enterYear;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassMasterId() {
        return classMasterId;
    }

    public void setClassMasterId(int classMasterId) {
        this.classMasterId = classMasterId;
    }

    public int getCreateTeacherId() {
        return createTeacherId;
    }

    public void setCreateTeacherId(int createTeacherId) {
        this.createTeacherId = createTeacherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getModifyTeacherId() {
        return modifyTeacherId;
    }

    public void setModifyTeacherId(int modifyTeacherId) {
        this.modifyTeacherId = modifyTeacherId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public EduClass(Integer id, int schoolId, int enterYear, String className, int classMasterId, int createTeacherId, Date createTime, int modifyTeacherId, Date modifyTime, boolean isdel) {
        this.id = id;
        this.schoolId = schoolId;
        this.enterYear = enterYear;
        this.className = className;
        this.classMasterId = classMasterId;
        this.createTeacherId = createTeacherId;
        this.createTime = createTime;
        this.modifyTeacherId = modifyTeacherId;
        this.modifyTime = modifyTime;
        this.isdel = isdel;
    }
}
