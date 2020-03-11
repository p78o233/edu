package com.example.educonnamddata.eduSchool;/*
 * @author p78o2
 * @date 2020/3/9
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "课程班级老师关联表")
public class EduCourseClassTeacher implements Serializable {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "课程id")
    private int courseId;
    @ApiModelProperty(value = "班级id")
    private int teacherId;
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

    @Override
    public String toString() {
        return "EduCourseClassTeacher{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", teacherId=" + teacherId +
                ", createTeacherId=" + createTeacherId +
                ", createTime=" + createTime +
                ", modifyTeacherId=" + modifyTeacherId +
                ", modifyTime=" + modifyTime +
                ", isdel=" + isdel +
                '}';
    }

    public EduCourseClassTeacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public EduCourseClassTeacher(Integer id, int courseId, int teacherId, int createTeacherId, Date createTime, int modifyTeacherId, Date modifyTime, boolean isdel) {
        this.id = id;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.createTeacherId = createTeacherId;
        this.createTime = createTime;
        this.modifyTeacherId = modifyTeacherId;
        this.modifyTime = modifyTime;
        this.isdel = isdel;
    }
}
