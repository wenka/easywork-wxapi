package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;
import com.easywork.wx.model.analysis.AnalysisDailySummary;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 11:25
 * Description:
 */
public class AnalysisDailySummaryResp  extends BaseResp {

    private List<AnalysisDailySummary> list;

    public List<AnalysisDailySummary> getList() {
        return list;
    }

    public void setList(List<AnalysisDailySummary> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AnalysisDailySummaryResp{" +
                "list=" + list +
                "} " + super.toString();
    }
}
