package com.easywork.wx.api;

import com.easywork.wx.model.req.MenuReq;
import com.easywork.wx.model.resp.MenuResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:37
 * Description: cgi-bin
 */
public interface CgiBinApi {

    /**
     * @param grantType 获取access_token填写client_credential
     * @param appid     第三方用户唯一凭证
     * @param secret    第三方用户唯一凭证密钥，即appsecret
     * @return
     */
    @GET("token")
    Call<Map<String, String>> getAccessToken(@Query("grant_type") String grantType, @Query("appid") String appid, @Query("secret") String secret);

    /**
     * 获取微信服务器IP地址
     *
     * @param accessToken
     * @return
     */
    @GET("getcallbackip")
    Call<Map<String, List<String>>> getcallbackip(@Query("access_token") String accessToken);

    /**
     * 自定义菜单创建接口
     *
     * @param accessToken
     * @param menuReq
     * @return
     */
    @POST("menu/create")
    Call<Map<String, String>> createMenu(@Query("access_token") String accessToken, @Body MenuReq menuReq);

    /**
     * 自定义菜单查询接口
     *
     * @param accessToken
     * @return
     */
    @GET("menu/get")
    Call<MenuResp> getMenu(@Query("access_token") String accessToken);
}
