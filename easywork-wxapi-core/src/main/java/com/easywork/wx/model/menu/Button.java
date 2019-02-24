package com.easywork.wx.model.menu;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 02:14
 * Description:
 */
public class Button {

    /**
     * 菜单的响应动作类型 view表示网页类型，click表示点击类型，miniprogram表示小程序类型
     */
    private String type;

    /**
     * 菜单标题，不超过16个字节，子菜单不超过60个字节
     */
    private String name;

    /**
     * click等点击类型必须
     * 菜单KEY值，用于消息接口推送，不超过128字节
     */
    private String key;

    /**
     * view、miniprogram类型必须
     * 网页 链接，用户点击菜单可打开链接，不超过1024字节。 type为miniprogram时，不支持小程序的老版本客户端将打开本url。
     */
    private String url;

    /**
     * media_id类型和view_limited类型必须
     * 调用新增永久素材接口返回的合法media_id
     */
    private String media_id;

    /**
     * miniprogram类型必须
     * 小程序的appid（仅认证公众号可配置）
     */
    private String appid;

    /**
     * miniprogram类型必须
     * 小程序的页面路径
     */
    private String pagepath;

    private List<Button> sub_button;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

    public String getMedia_id() {
        return media_id;
    }

    public String getAppid() {
        return appid;
    }

    public String getPagepath() {
        return pagepath;
    }

    public List<Button> getSub_button() {
        return sub_button;
    }

    public Button setType(String type) {
        this.type = type;
        return this;
    }

    public Button setName(String name) {
        this.name = name;
        return this;
    }

    public Button setKey(String key) {
        this.key = key;
        return this;
    }

    public Button setUrl(String url) {
        this.url = url;
        return this;
    }

    public Button setMedia_id(String media_id) {
        this.media_id = media_id;
        return this;
    }

    public Button setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public Button setPagepath(String pagepath) {
        this.pagepath = pagepath;
        return this;
    }

    public Button setSub_button(List<Button> sub_button) {
        this.sub_button = sub_button;
        return this;
    }

    @Override
    public String toString() {
        return "Button{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", url='" + url + '\'' +
                ", media_id='" + media_id + '\'' +
                ", appid='" + appid + '\'' +
                ", pagepath='" + pagepath + '\'' +
                ", sub_button=" + sub_button +
                '}';
    }
}
