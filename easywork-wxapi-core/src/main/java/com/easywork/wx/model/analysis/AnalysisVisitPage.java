package com.easywork.wx.model.analysis;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 02:07
 * Description:
 */
public class AnalysisVisitPage {

    private String page_path;

    private int page_visit_pv;

    private int page_visit_uv;

    private int page_staytime_pv;

    private int entrypage_pv;

    private int exitpage_pv;

    private int page_share_pv;

    private int page_share_uv;

    public String getPage_path() {
        return page_path;
    }

    public void setPage_path(String page_path) {
        this.page_path = page_path;
    }

    public int getPage_visit_pv() {
        return page_visit_pv;
    }

    public void setPage_visit_pv(int page_visit_pv) {
        this.page_visit_pv = page_visit_pv;
    }

    public int getPage_visit_uv() {
        return page_visit_uv;
    }

    public void setPage_visit_uv(int page_visit_uv) {
        this.page_visit_uv = page_visit_uv;
    }

    public int getPage_staytime_pv() {
        return page_staytime_pv;
    }

    public void setPage_staytime_pv(int page_staytime_pv) {
        this.page_staytime_pv = page_staytime_pv;
    }

    public int getEntrypage_pv() {
        return entrypage_pv;
    }

    public void setEntrypage_pv(int entrypage_pv) {
        this.entrypage_pv = entrypage_pv;
    }

    public int getExitpage_pv() {
        return exitpage_pv;
    }

    public void setExitpage_pv(int exitpage_pv) {
        this.exitpage_pv = exitpage_pv;
    }

    public int getPage_share_pv() {
        return page_share_pv;
    }

    public void setPage_share_pv(int page_share_pv) {
        this.page_share_pv = page_share_pv;
    }

    public int getPage_share_uv() {
        return page_share_uv;
    }

    public void setPage_share_uv(int page_share_uv) {
        this.page_share_uv = page_share_uv;
    }

    @Override
    public String toString() {
        return "AnalysisVisitPage{" +
                "page_path='" + page_path + '\'' +
                ", page_visit_pv=" + page_visit_pv +
                ", page_visit_uv=" + page_visit_uv +
                ", page_staytime_pv=" + page_staytime_pv +
                ", entrypage_pv=" + entrypage_pv +
                ", exitpage_pv=" + exitpage_pv +
                ", page_share_pv=" + page_share_pv +
                ", page_share_uv=" + page_share_uv +
                '}';
    }
}
