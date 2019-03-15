package com.easywork.wx.model.resp;

import com.easywork.wx.model.analysis.AnalysisVisitPage;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 02:09
 * Description:
 */
public class AnalysisVisitPageResp {

    private String ref_date;

    private List<AnalysisVisitPage> list;

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public List<AnalysisVisitPage> getList() {
        return list;
    }

    public void setList(List<AnalysisVisitPage> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AnalysisVisitPageResp{" +
                "ref_date='" + ref_date + '\'' +
                ", list=" + list +
                '}';
    }
}
