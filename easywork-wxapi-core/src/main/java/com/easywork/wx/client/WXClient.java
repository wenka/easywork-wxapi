package com.easywork.wx.client;

import com.easywork.wx.api.CgiBinApi;
import com.easywork.wx.api.SnsApi;
import com.easywork.wx.constant.WXModuleConstant;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:35
 * Description:
 */
public class WXClient {

    private volatile static WXClient wxClient;

    private String baseUrl;

    private WXClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static WXClient build(String baseUrl) {
        if (wxClient == null) {
            synchronized (WXClient.class) {
                if (wxClient == null) {
                    wxClient = new WXClient(baseUrl);
                }
            }
        }
        return wxClient;
    }


    public CgiBinApi buildCgiBinApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl + "/" + WXModuleConstant.CGI_BIN + "/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(CgiBinApi.class);
    }

    public SnsApi buildSnsApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl + "/" + WXModuleConstant.SNS + "/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(SnsApi.class);
    }

}
