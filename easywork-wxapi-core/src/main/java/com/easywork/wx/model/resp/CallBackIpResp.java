package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 02:00
 * Description:
 */
public class CallBackIpResp extends BaseResp {

    private List<String> ipList;

    public List<String> getIpList() {
        return ipList;
    }

    public CallBackIpResp setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
}
