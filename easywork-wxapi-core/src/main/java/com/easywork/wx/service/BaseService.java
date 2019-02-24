package com.easywork.wx.service;

import com.easywork.wx.config.WXConfig;
import com.easywork.wx.constant.WXErrorCode;
import com.easywork.wx.exception.WXException;
import com.easywork.wx.model.BaseReq;
import com.easywork.wx.model.BaseResp;

import java.util.Map;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:15
 * Description:
 */
public abstract class BaseService {

    protected WXConfig wxConfig;

    /**
     * 请求之前的操作
     *
     * @param baseReq
     */
    protected void reqBefore(BaseReq baseReq) {
        if (this.wxConfig.verify()) {
            baseReq.setAppid(this.wxConfig.getAppid());
            baseReq.setSecret(this.wxConfig.getSecret());
        } else {
            throw WXException.build(WXErrorCode.APPID_SECRET_NOT_EMPTY);
        }
    }

    /**
     * 请求之后的操作
     *
     * @param baseResp
     * @param responseBody
     */
    protected void reqAfter(BaseResp baseResp, Map<String, String> responseBody) {
        String errcode = responseBody.get("errcode");
        String errmsg = responseBody.get("errmsg");
        baseResp.setErrcode(errcode == null ? null : Integer.valueOf(errcode));
        baseResp.setErrmsg(errmsg);
    }
}
