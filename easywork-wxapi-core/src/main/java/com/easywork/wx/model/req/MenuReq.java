package com.easywork.wx.model.req;

import com.easywork.wx.model.BaseReq;
import com.easywork.wx.model.menu.Button;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 02:19
 * Description:
 */
public class MenuReq extends BaseReq {

    private List<Button> button = new LinkedList<>();

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }
}
