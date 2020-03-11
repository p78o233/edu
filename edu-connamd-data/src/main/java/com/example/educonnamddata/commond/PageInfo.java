package com.example.educonnamddata.commond;/*
 * @author p78o2
 * @date 2020/3/10
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "分页数据返回")
public class PageInfo<T> {
    @ApiModelProperty(value = "总行数")
    private int count;
    @ApiModelProperty(value = "分页数据信息")
    private List<T> list;

    @Override
    public String toString() {
        return "PageInfo{" +
                "count=" + count +
                ", list=" + list +
                '}';
    }

    public PageInfo() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageInfo(int count, List<T> list) {
        this.count = count;
        this.list = list;
    }
}
