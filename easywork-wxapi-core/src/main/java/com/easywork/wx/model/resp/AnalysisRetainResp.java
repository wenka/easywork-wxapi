package com.easywork.wx.model.resp;

import com.easywork.wx.model.BaseResp;
import com.easywork.wx.model.analysis.KV;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 10:30
 * Description: 留存数据
 */
public class AnalysisRetainResp extends BaseResp {

    /**
     * 日期
     */
    private String ref_date;

    /**
     * 新增用户留存
     */
    private List<KV> visit_uv_new;

    /**
     * 活跃用户留存
     */
    private List<KV> visit_uv;


    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String refDate) {
        this.ref_date = refDate;
    }

    public List<KV> getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(List<KV> visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    public List<KV> getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(List<KV> visit_uv) {
        this.visit_uv = visit_uv;
    }

    @Override
    public String toString() {
        return "AnalysisRetainResp{" +
                "refDate='" + ref_date + '\'' +
                ", visitUvNew=" + visit_uv_new +
                ", visitUv=" + visit_uv +
                "} " + super.toString();
    }
}
