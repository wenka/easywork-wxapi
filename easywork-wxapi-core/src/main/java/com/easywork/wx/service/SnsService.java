package com.easywork.wx.service;

import com.easywork.wx.api.SnsApi;
import com.easywork.wx.config.WXConfig;
import com.easywork.wx.constant.WXErrorCode;
import com.easywork.wx.exception.WXException;
import com.easywork.wx.model.req.UserSessionReq;
import com.easywork.wx.model.resp.UserSessionResp;
import retrofit2.Call;

import java.io.IOException;
import java.util.Map;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 10:02
 * Description:
 */
public class SnsService extends BaseService {

    private SnsApi snsApi;

    public SnsService(SnsApi snsApi, WXConfig wxConfig) {
        this.wxConfig = wxConfig;
        this.snsApi = snsApi;
    }

    /**
     * 登录凭证校验。
     * 获取openId ,unionId
     *
     * @param jsCode x.login() 接口获得临时登录凭证 code
     * @return
     */
    public UserSessionResp jscode2session(String jsCode) {
        UserSessionReq userSessionReq = new UserSessionReq();
        this.reqBefore(userSessionReq);
        userSessionReq.setJsCode(jsCode);

        Call<Map<String, String>> call = this.snsApi.jscode2session(userSessionReq.getGrantType(), userSessionReq.getAppid(), userSessionReq.getSecret(), userSessionReq.getJsCode());

        try {
            Map<String, String> body = call.execute().body();
            UserSessionResp userSessionResp = new UserSessionResp();
            this.reqAfter(userSessionResp, body);
            userSessionResp.setOpenId(body.get("openid"))
                    .setSessionKey(body.get("session_key"))
                    .setUnionid(body.get("unionid"));
            return userSessionResp;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }
}
