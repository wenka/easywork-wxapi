package com.easywork.wx.config;


import com.easywork.wx.constant.WXDomain;
import com.easywork.wx.util.StringUtils;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:12
 * Description:
 */
public class WXConfig {

    private String appid;

    private String secret;

    private String domain = WXDomain.GENERAL.url();

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean verify() {
        return StringUtils.isNoEmpty(this.appid) && StringUtils.isNoEmpty(this.secret) && StringUtils.isNoEmpty(this.domain);
    }

    @Override
    public String toString() {
        return "WxConfig{" +
                "appid='" + appid + '\'' +
                ", secret='" + secret + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
