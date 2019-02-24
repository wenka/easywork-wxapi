package com.easywork.wx.constant;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 08:27
 * Description:
 */
public enum WXDomain {
    GENERAL("https://api.weixin.qq.com"),
    SPARE("https://api2.weixin.qq.com"),
    SHANG_HAI("https://sh.api.weixin.qq.com"),
    SHEN_ZHEN("https://sz.api.weixin.qq.com"),
    HONG_KONG("https://hk.api.weixin.qq.com");

    WXDomain(String address) {
        this.address = address;
    }

    private String address;

    public String url() {
        return this.address;
    }
}
