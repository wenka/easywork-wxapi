package com.easywork.wx.model.req;

import com.easywork.wx.model.BaseReq;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:16
 * Description: 全局唯一接口调用凭据 请求类
 */
public class AccessTokenReq extends BaseReq {

    private String grantType = "client_credential";

    public String getGrantType() {
        return grantType;
    }

    public AccessTokenReq setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
}
