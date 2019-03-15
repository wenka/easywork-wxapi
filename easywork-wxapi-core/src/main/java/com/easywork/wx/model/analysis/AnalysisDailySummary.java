package com.easywork.wx.model.analysis;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 11:27
 * Description: 用户访问小程序数据概况
 */
public class AnalysisDailySummary {

    /**
     * 日期
     */
    private String ref_date;

    /**
     * 累计用户数
     */
    private int visit_total;

    /**
     * 转发次数
     */
    private int share_pv;

    /**
     * 	转发人数
     */
    private int share_uv;

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public int getVisit_total() {
        return visit_total;
    }

    public void setVisit_total(int visit_total) {
        this.visit_total = visit_total;
    }

    public int getShare_pv() {
        return share_pv;
    }

    public void setShare_pv(int share_pv) {
        this.share_pv = share_pv;
    }

    public int getShare_uv() {
        return share_uv;
    }

    public void setShare_uv(int share_uv) {
        this.share_uv = share_uv;
    }

    @Override
    public String toString() {
        return "AnalysisDailySummary{" +
                "ref_date='" + ref_date + '\'' +
                ", visit_total=" + visit_total +
                ", share_pv=" + share_pv +
                ", share_uv=" + share_uv +
                "} " + super.toString();
    }
}
