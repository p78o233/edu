package com.example.educonnamddata.commond;/*
 * @author p78o2
 * @date 2020/3/10
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回值对象")
public class R {
    @ApiModelProperty(value = "是否正常")
    private boolean ret;
    @ApiModelProperty(value = "状态码")
    private int status;
    @ApiModelProperty(value = "返回值对象")
    private Object data;
    @ApiModelProperty(value = "消息")
    private String msg;

    @Override
    public String toString() {
        return "R{" +
                "ret=" + ret +
                ", status=" + status +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public R() {
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public R(boolean ret, int status, Object data, String msg) {
        this.ret = ret;
        this.status = status;
        this.data = data;
        this.msg = msg;
    }
}
