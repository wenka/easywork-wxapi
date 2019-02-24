package com.easywork.wx;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/24  下午 12:28
 * Description:
 */
@ConfigurationProperties(prefix = "wx")
public class WXConfig extends com.easywork.wx.config.WXConfig{
}
