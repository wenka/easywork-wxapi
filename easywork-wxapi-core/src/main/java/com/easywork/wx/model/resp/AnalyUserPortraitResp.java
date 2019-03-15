package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;
import com.easywork.wx.model.analysis.user.portrait.VisitUv;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 01:19
 * Description:
 */
public class AnalyUserPortraitResp extends BaseResp {

    private String ref_date;

    private VisitUv visit_uv;

    private VisitUv visit_uv_new;

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public VisitUv getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(VisitUv visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    public VisitUv getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(VisitUv visit_uv) {
        this.visit_uv = visit_uv;
    }

    @Override
    public String toString() {
        return "AnalyUserPortraitResp{" +
                "ref_date='" + ref_date + '\'' +
                ", visit_uv=" + visit_uv +
                ", visit_uv_new=" + visit_uv_new +
                "} " + super.toString();
    }
}
