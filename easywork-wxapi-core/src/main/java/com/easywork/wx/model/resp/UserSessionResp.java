package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 10:05
 * Description:
 */
public class UserSessionResp extends BaseResp {

    private String openId;

    private String sessionKey;

    private String unionid;

    public String getOpenId() {
        return openId;
    }

    public UserSessionResp setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public UserSessionResp setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }

    public String getUnionid() {
        return unionid;
    }

    public UserSessionResp setUnionid(String unionid) {
        this.unionid = unionid;
        return this;
    }

    @Override
    public String toString() {
        return "UserSessionResp{" +
                "openId='" + openId + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", unionid='" + unionid + '\'' +
                "} " + super.toString();
    }
}
