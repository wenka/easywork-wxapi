package com.easywork.wx.model.req;

import com.easywork.wx.model.BaseReq;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 10:04
 * Description: 用户session_key请求
 */
public class UserSessionReq extends BaseReq {

    private String grantType = "authorization_code";

    private String jsCode;

    public String getGrantType() {
        return grantType;
    }

    public UserSessionReq setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }

    public String getJsCode() {
        return jsCode;
    }

    public UserSessionReq setJsCode(String jsCode) {
        this.jsCode = jsCode;
        return this;
    }
}
