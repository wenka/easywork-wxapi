package com.easywork.wx.service;

import com.easywork.wx.client.WXClient;
import com.easywork.wx.config.WXConfig;
import com.easywork.wx.model.resp.AccessTokenResp;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:14
 * Description:
 */
public class CgiBinServiceTest extends BaseService {

    private WXConfig wxConfig;

    String accessToken = "19_1cj_foqld0_Ddkbgy-ts5xQiq6APfq9xAUiAOq8KxAFbkeunZat1CTKDVU_rFhXeOU8HZocpJt0cXEMYptZLOktCyauPYnsKA3ox2UXc0foVgRfpztDxWAVNI5uYTIYOmX3viU7qWNwEnGTWDPYjAHAJVE";

    @Before
    public void init() {
        wxConfig = new WXConfig();
        wxConfig.setAppid("wxdcb3900df2b039d7");
        wxConfig.setSecret("339506c6f838dbb0f1c3d5df20afb19a");
    }

    @Test
    public void accessToken() {
        CgiBinService cgiBinService = new CgiBinService(WXClient.build(wxConfig.getDomain()).buildCgiBinApi(), wxConfig);
        AccessTokenResp accessToken = cgiBinService.getAccessToken();
        System.out.println(accessToken);
    }

    @Test
    public void deleteMenu(){
        CgiBinService cgiBinService = new CgiBinService(WXClient.build(wxConfig.getDomain()).buildCgiBinApi(), wxConfig);
        cgiBinService.deleteMenu(accessToken);
    }
}

