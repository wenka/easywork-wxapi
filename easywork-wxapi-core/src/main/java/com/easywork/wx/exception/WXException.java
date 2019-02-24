package com.easywork.wx.exception;

import com.easywork.wx.constant.WXErrorCode;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  上午 09:24
 * Description:
 */
public class WXException extends RuntimeException {

    private int code;

    private String msg;

    public WXException(int code, String msg) {
        super(code + ": " + msg);
        this.code = code;
        this.msg = msg;
    }

    public WXException(WXErrorCode wxErrorCode) {
        super(wxErrorCode.getCode() + ": " + wxErrorCode.getMessage());
        this.code = wxErrorCode.getCode();
        this.msg = wxErrorCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static WXException build(WXErrorCode wxErrorCode){
        return new WXException(wxErrorCode);
    }
}
