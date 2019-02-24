package com.easywork.wx;

import com.easywork.wx.client.WXClient;
import com.easywork.wx.service.CgiBinService;
import com.easywork.wx.service.SnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/24  上午 10:29
 * Description:
 */
@Configuration//开启配置
@EnableConfigurationProperties(WXConfig.class)//开启使用映射实体对象
public class WXApiConfiguration {

    @Autowired
    private WXConfig wxConfig;

    @Bean
    public CgiBinService cgiBinService() {
        return new CgiBinService(WXClient.build(wxConfig.getDomain()).buildCgiBinApi(), wxConfig);
    }

    @Bean
    public SnsService snsService() {
        return new SnsService(WXClient.build(wxConfig.getDomain()).buildSnsApi(), wxConfig);
    }
}
