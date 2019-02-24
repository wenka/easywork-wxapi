package com.easywork.wx.model.req;

import com.easywork.wx.model.BaseReq;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 01:59
 * Description:
 */
public class CallBackIpReq extends BaseReq {

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public CallBackIpReq setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
}
