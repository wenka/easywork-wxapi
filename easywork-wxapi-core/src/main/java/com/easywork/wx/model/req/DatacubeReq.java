package com.easywork.wx.model.req;

import com.easywork.wx.constant.WXErrorCode;
import com.easywork.wx.exception.WXException;
import com.easywork.wx.model.BaseReq;

import java.util.Objects;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 10:28
 * Description:
 */
public class DatacubeReq extends BaseReq {

    public enum Type {
        Daily, Monthly, Weekly
    }

    private String accessToken;

    /**
     * 日期格式 yyyymmdd
     */
    private String begin_date;

    /**
     * 日期格式 yyyymmdd
     */
    private String end_date;

    private Type type;

    public String getAccessToken() {
        return accessToken;
    }

    public DatacubeReq setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public DatacubeReq setBegin_date(String begin_date) {
        this.begin_date = begin_date;
        return this;
    }

    public String getEnd_date() {
        return end_date;
    }

    public DatacubeReq setEnd_date(String end_date) {
        this.end_date = end_date;
        return this;
    }

    public Type getType() {
        return type;
    }

    public DatacubeReq setType(Type type) {
        this.type = type;
        return this;
    }

    public boolean check(){
        if (type == null){
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }else if (type == Type.Daily){
            if (!Objects.equals(begin_date,end_date)){
                throw WXException.build(WXErrorCode.DATE_SMAE);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatacubeReq{" +
                "accessToken='" + accessToken + '\'' +
                ", beginDate='" + begin_date + '\'' +
                ", endDate='" + end_date + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
