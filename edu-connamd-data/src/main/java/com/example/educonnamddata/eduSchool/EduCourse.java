package com.example.educonnamddata.eduSchool;/*
 * @author p78o2
 * @date 2020/3/9
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "开设课程表")
public class EduCourse implements Serializable {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "课程名称")
    private String courseName;
    @ApiModelProperty(value = "学校id")
    private int schoolId;
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
    @ApiModelProperty(value = "课程描述")
    private String desc;

    @Override
    public String toString() {
        return "EduCourse{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", schoolId=" + schoolId +
                ", createTeacherId=" + createTeacherId +
                ", createTime=" + createTime +
                ", modifyTeacherId=" + modifyTeacherId +
                ", modifyTime=" + modifyTime +
                ", isdel=" + isdel +
                ", desc='" + desc + '\'' +
                '}';
    }

    public EduCourse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EduCourse(Integer id, String courseName, int schoolId, int createTeacherId, Date createTime, int modifyTeacherId, Date modifyTime, boolean isdel, String desc) {
        this.id = id;
        this.courseName = courseName;
        this.schoolId = schoolId;
        this.createTeacherId = createTeacherId;
        this.createTime = createTime;
        this.modifyTeacherId = modifyTeacherId;
        this.modifyTime = modifyTime;
        this.isdel = isdel;
        this.desc = desc;
    }
}
