package com.easywork.wx.model;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:38
 * Description:
 */
public class BaseResp {

    private Integer errcode;

    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public boolean isSuccess() {
        return this.errcode == null || this.errcode == 0;
    }

    @Override
    public String toString() {
        return "BaseResp{" +
                "isSuccess=" + isSuccess() +
                ", errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
