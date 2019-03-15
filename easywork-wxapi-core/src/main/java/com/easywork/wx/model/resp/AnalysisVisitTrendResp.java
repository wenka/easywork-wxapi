package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;
import com.easywork.wx.model.analysis.AnalysisVisitTrend;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 01:04
 * Description:
 */
public class AnalysisVisitTrendResp extends BaseResp {

    private List<AnalysisVisitTrend> list;

    public List<AnalysisVisitTrend> getList() {
        return list;
    }

    public void setList(List<AnalysisVisitTrend> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AnalysisVisitTrendResp{" +
                "list=" + list +
                "} " + super.toString();
    }
}
