package com.easywork.wx.model.analysis;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 01:01
 * Description: 用户访问小程序数据趋势
 */
public class AnalysisVisitTrend {

    private String ref_date; //日期

    private int session_cnt; //打开次数

    private int visit_pv; //访问次数

    private int visit_uv; //访问人数

    private int visit_uv_new; // 新用户数

    private double stay_time_uv; // 人均停留时长(秒)

    private double stay_time_session; //次均停留时长(秒)

    private double visit_depth; // 平均访问深度

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public int getSession_cnt() {
        return session_cnt;
    }

    public void setSession_cnt(int session_cnt) {
        this.session_cnt = session_cnt;
    }

    public int getVisit_pv() {
        return visit_pv;
    }

    public void setVisit_pv(int visit_pv) {
        this.visit_pv = visit_pv;
    }

    public int getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(int visit_uv) {
        this.visit_uv = visit_uv;
    }

    public int getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(int visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    public double getStay_time_uv() {
        return stay_time_uv;
    }

    public void setStay_time_uv(double stay_time_uv) {
        this.stay_time_uv = stay_time_uv;
    }

    public double getStay_time_session() {
        return stay_time_session;
    }

    public void setStay_time_session(double stay_time_session) {
        this.stay_time_session = stay_time_session;
    }

    public double getVisit_depth() {
        return visit_depth;
    }

    public void setVisit_depth(double visit_depth) {
        this.visit_depth = visit_depth;
    }

    @Override
    public String toString() {
        return "AnalysisVisitTrend{" +
                "ref_date='" + ref_date + '\'' +
                ", session_cnt=" + session_cnt +
                ", visit_pv=" + visit_pv +
                ", visit_uv=" + visit_uv +
                ", visit_uv_new=" + visit_uv_new +
                ", stay_time_uv=" + stay_time_uv +
                ", stay_time_session=" + stay_time_session +
                ", visit_depth=" + visit_depth +
                '}';
    }
}
