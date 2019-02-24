package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:38
 * Description:全局唯一接口调用凭据返回实体
 */
public class AccessTokenResp extends BaseResp {

    private String accessToken;

    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public AccessTokenResp setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public AccessTokenResp setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    @Override
    public String toString() {
        return "AccessTokenResp{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                "} " + super.toString();
    }
}
