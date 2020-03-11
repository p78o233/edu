package com.example.educonnamddata.eduSchool;/*
 * @author p78o2
 * @date 2020/3/9
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "学校表")
public class EduSchool implements Serializable {
    @ApiModelProperty(value = "学校表主键")
    private Integer id;
    @ApiModelProperty(value = "学校名称")
    private String name;
    @ApiModelProperty(value = "省")
    private String province;
    @ApiModelProperty(value = "市")
    private String city;
    @ApiModelProperty(value = "区")
    private String area;
    @ApiModelProperty(value = "详细地址")
    private String address;
    @ApiModelProperty(value = "学校官网")
    private String webUrl;
    @ApiModelProperty(value = "公众号名字")
    private String wxAppName;
    @ApiModelProperty(value = "公众号appId")
    private String wxAppId;
    @ApiModelProperty(value = "公众号appSecret")
    private String wxSecret;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "创建后台管理员id")
    private int createAdminId;
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
    @ApiModelProperty(value = "修改后台管理员id")
    private int modifyAdmin;
    @ApiModelProperty(value = "是否删除")
    private boolean isdel;

    public EduSchool() {
    }

    @Override
    public String toString() {
        return "EduSchool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", wxAppName='" + wxAppName + '\'' +
                ", wxAppId='" + wxAppId + '\'' +
                ", wxSecret='" + wxSecret + '\'' +
                ", createTime=" + createTime +
                ", createAdminId=" + createAdminId +
                ", modifyTime=" + modifyTime +
                ", modifyAdmin=" + modifyAdmin +
                ", isdel=" + isdel +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWxAppName() {
        return wxAppName;
    }

    public void setWxAppName(String wxAppName) {
        this.wxAppName = wxAppName;
    }

    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public String getWxSecret() {
        return wxSecret;
    }

    public void setWxSecret(String wxSecret) {
        this.wxSecret = wxSecret;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreateAdminId() {
        return createAdminId;
    }

    public void setCreateAdminId(int createAdminId) {
        this.createAdminId = createAdminId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getModifyAdmin() {
        return modifyAdmin;
    }

    public void setModifyAdmin(int modifyAdmin) {
        this.modifyAdmin = modifyAdmin;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public EduSchool(Integer id, String name, String province, String city, String area, String address, String webUrl, String wxAppName, String wxAppId, String wxSecret, Date createTime, int createAdminId, Date modifyTime, int modifyAdmin, boolean isdel) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.webUrl = webUrl;
        this.wxAppName = wxAppName;
        this.wxAppId = wxAppId;
        this.wxSecret = wxSecret;
        this.createTime = createTime;
        this.createAdminId = createAdminId;
        this.modifyTime = modifyTime;
        this.modifyAdmin = modifyAdmin;
        this.isdel = isdel;
    }
}
