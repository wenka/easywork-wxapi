package com.easywork.wx.constant;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:31
 * Description:
 */
public class WXErrorCode extends ErrorCode {
    public final static WXErrorCode REQUEST_ERR = new WXErrorCode(500, "wx request error,please check your url or params.");
    public final static WXErrorCode APPID_SECRET_NOT_EMPTY = new WXErrorCode(1001, "wx appid and secret must be not empty!");

    /**
     * 菜单相关
     */
    public final static WXErrorCode MENU_TOO_MUCH = new WXErrorCode(2001, "buttons size must be >0 and <3");
    public final static WXErrorCode SUBMENU_TOO_MUCH = new WXErrorCode(2002, "subButtons size must be <5");



    public WXErrorCode(int code, String message) {
        super(code, message);
    }
}
