package com.easywork.wx.service;

import com.easywork.wx.api.CgiBinApi;
import com.easywork.wx.config.WXConfig;
import com.easywork.wx.constant.WXErrorCode;
import com.easywork.wx.exception.WXException;
import com.easywork.wx.model.BaseResp;
import com.easywork.wx.model.req.AccessTokenReq;
import com.easywork.wx.model.req.CallBackIpReq;
import com.easywork.wx.model.req.MenuReq;
import com.easywork.wx.model.resp.AccessTokenResp;
import com.easywork.wx.model.resp.CallBackIpResp;
import com.easywork.wx.model.resp.MenuResp;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:14
 * Description:
 */
public class CgiBinService extends BaseService {

    private CgiBinApi cgiBinApi;

    public CgiBinService(CgiBinApi cgiBinApi, WXConfig wxConfig) {
        this.wxConfig = wxConfig;
        this.cgiBinApi = cgiBinApi;
    }

    /**
     * 获取 access_token
     *
     * @return
     */
    public AccessTokenResp getAccessToken() {
        AccessTokenReq accessTokenReq = new AccessTokenReq();
        this.reqBefore(accessTokenReq);
        Call<Map<String, String>> call = this.cgiBinApi.getAccessToken(accessTokenReq.getGrantType(), accessTokenReq.getAppid(), accessTokenReq.getSecret());
        try {
            Map<String, String> body = call.execute().body();
            AccessTokenResp accessTokenResp = new AccessTokenResp();
            accessTokenResp.setAccessToken(body.get("access_token"));
            accessTokenResp.setExpiresIn(Integer.valueOf(body.get("expires_in")));
            this.reqAfter(accessTokenResp, body);
            return accessTokenResp;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 获取微信服务器IP地址
     *
     * @param accessToken 公众号的access_token
     * @return
     */
    public CallBackIpResp getcallbackip(String accessToken) {
        CallBackIpReq callBackIpReq = new CallBackIpReq().setAccessToken(accessToken);
        Call<Map<String, List<String>>> call = this.cgiBinApi.getcallbackip(callBackIpReq.getAccessToken());
        try {
            Map<String, List<String>> body = call.execute().body();
            CallBackIpResp callBackIpResp = new CallBackIpResp()
                    .setIpList(body.get("ip_list"));
            return callBackIpResp;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 自定义菜单创建接口
     *
     * @param accessToken
     * @param menuReq
     * @return
     */
    public BaseResp createMenu(String accessToken, MenuReq menuReq) {
        Call<Map<String, String>> call = this.cgiBinApi.createMenu(accessToken, menuReq);
        try {
            Map<String, String> body = call.execute().body();
            BaseResp baseResp = new BaseResp();
            this.reqAfter(baseResp, body);
            return baseResp;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 自定义菜单创建接口
     *
     * @param accessToken
     * @return
     */
    public MenuResp getMenu(String accessToken) {
        Call<MenuResp> call = this.cgiBinApi.getMenu(accessToken);
        try {
            Response<MenuResp> execute = call.execute();
            MenuResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }
}

