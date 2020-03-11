package com.example.educonnamddata.eduSchool;/*
 * @author p78o2
 * @date 2020/3/9
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "课程老师关联表")
public class EduCourseTeacher implements Serializable {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "教师id")
    private int teacherId;
    @ApiModelProperty(value = "课程id")
    private int courseId;
    @ApiModelProperty(value = "学校id")
    private int schoolId;
    @ApiModelProperty(value = "创建老师id")
    private int createTeacherId;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改老师id")
    private int modifyTeacherId;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "是否删除")
    private boolean isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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

    @Override
    public String toString() {
        return "EduCourseTeacher{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", courseId=" + courseId +
                ", schoolId=" + schoolId +
                ", createTeacherId=" + createTeacherId +
                ", createTime=" + createTime +
                ", modifyTeacherId=" + modifyTeacherId +
                ", modifyTime=" + modifyTime +
                ", isdel=" + isdel +
                '}';
    }

    public int getCreateTeacherId() {
        return createTeacherId;
    }

    public void setCreateTeacherId(int createTeacherId) {
        this.createTeacherId = createTeacherId;
    }

    public EduCourseTeacher(Integer id, int teacherId, int courseId, int schoolId, int createTeacherId, Date createTime, int modifyTeacherId, Date modifyTime, boolean isdel) {
        this.id = id;
        this.teacherId = teacherId;
        this.courseId = courseId;
        this.schoolId = schoolId;
        this.createTeacherId = createTeacherId;
        this.createTime = createTime;
        this.modifyTeacherId = modifyTeacherId;
        this.modifyTime = modifyTime;
        this.isdel = isdel;
    }

    public EduCourseTeacher() {
    }
}
