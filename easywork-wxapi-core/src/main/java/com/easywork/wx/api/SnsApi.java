package com.easywork.wx.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.Map;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:58
 * Description: sns
 */
public interface SnsApi {

    /**
     * 登录凭证校验
     *
     * @param grantType
     * @param appid
     * @param secret
     * @param jsCode    通过 com.easywork.wx.wx.login() 接口获得临时登录凭证 cod
     * @return
     */
    @GET("jscode2session")
    Call<Map<String, String>> jscode2session(@Query("grant_type") String grantType, @Query("appid") String appid, @Query("secret") String secret, @Query("js_code") String jsCode);
}
