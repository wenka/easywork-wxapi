package com.easywork.wx.service;

import com.easywork.wx.api.DatacubeApi;
import com.easywork.wx.config.WXConfig;
import com.easywork.wx.constant.WXErrorCode;
import com.easywork.wx.exception.WXException;
import com.easywork.wx.model.req.DatacubeReq;
import com.easywork.wx.model.resp.*;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 10:40
 * Description: 数据分析
 */
public class DatacubeService extends BaseService {

    private DatacubeApi datacubeApi;

    public DatacubeService(DatacubeApi datacubeApi, WXConfig wxConfig) {
        this.wxConfig = wxConfig;
        this.datacubeApi = datacubeApi;
    }

    /**
     * 获取用户访问小程序留存数据
     *
     * @param datacubeReq
     * @return
     */
    public AnalysisRetainResp getAnalysisRetain(DatacubeReq datacubeReq) {
        if (!datacubeReq.check()) {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        Call<AnalysisRetainResp> analysisRetain = null;
        if (datacubeReq.getType() == DatacubeReq.Type.Daily) {
            analysisRetain = this.datacubeApi.getAnalysisDailyRetain(datacubeReq.getAccessToken(), datacubeReq);
        } else if (datacubeReq.getType() == DatacubeReq.Type.Weekly) {
            analysisRetain = this.datacubeApi.getAnalysisWeeklyRetain(datacubeReq.getAccessToken(), datacubeReq);
        } else if (datacubeReq.getType() == DatacubeReq.Type.Monthly) {
            analysisRetain = this.datacubeApi.getAnalysisMonthlyRetain(datacubeReq.getAccessToken(), datacubeReq);
        } else {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        try {
            Response<AnalysisRetainResp> execute = analysisRetain.execute();
            AnalysisRetainResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 获取用户访问小程序数据概况
     *
     * @param datacubeReq
     * @return
     */
    public AnalysisDailySummaryResp getAnalysisDailySummary(DatacubeReq datacubeReq) {
        if (datacubeReq.getType() != DatacubeReq.Type.Daily) {
            throw WXException.build(WXErrorCode.RETAIN_DAILY_TYPE);
        }
        if (!datacubeReq.check()) {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        Call<AnalysisDailySummaryResp> analysisDailySummary = this.datacubeApi.getAnalysisDailySummary(datacubeReq.getAccessToken(), datacubeReq);
        try {
            Response<AnalysisDailySummaryResp> execute = analysisDailySummary.execute();
            AnalysisDailySummaryResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 获取用户访问小程序数据趋势
     *
     * @param datacubeReq
     * @return
     */
    public AnalysisVisitTrendResp getAnalysisVisitTrend(DatacubeReq datacubeReq) {
        if (!datacubeReq.check()) {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        Call<AnalysisVisitTrendResp> visitTrendRespCall = null;
        if (datacubeReq.getType() == DatacubeReq.Type.Daily) {
            visitTrendRespCall = this.datacubeApi.getAnalysisDailyVisitTrend(datacubeReq.getAccessToken(), datacubeReq);
        } else if (datacubeReq.getType() == DatacubeReq.Type.Weekly) {
            visitTrendRespCall = this.datacubeApi.getAnalysisWeeklyVisitTrend(datacubeReq.getAccessToken(), datacubeReq);
        } else if (datacubeReq.getType() == DatacubeReq.Type.Monthly) {
            visitTrendRespCall = this.datacubeApi.getAnalysisMonthlyVisitTrend(datacubeReq.getAccessToken(), datacubeReq);
        } else {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        try {
            Response<AnalysisVisitTrendResp> execute = visitTrendRespCall.execute();
            AnalysisVisitTrendResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 获取用户访问小程序数据概况
     *
     * @param datacubeReq
     * @return
     */
    public AnalyUserPortraitResp getAnalysisUserPortrait(DatacubeReq datacubeReq) {
        if (datacubeReq.getType() != DatacubeReq.Type.Daily) {
            throw WXException.build(WXErrorCode.RETAIN_DAILY_TYPE);
        }
        if (!datacubeReq.check()) {
            throw WXException.build(WXErrorCode.RETAIN_TYPE);
        }
        Call<AnalyUserPortraitResp> analysisDailySummary = this.datacubeApi.getAnalysisUserPortrait(datacubeReq.getAccessToken(), datacubeReq);
        try {
            Response<AnalyUserPortraitResp> execute = analysisDailySummary.execute();
            AnalyUserPortraitResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }

    /**
     * 获取用户访问小程序数据概况
     *
     * @param datacubeReq
     * @return
     */
    public AnalysisVisitPageResp getAnalysisVisitPage(DatacubeReq datacubeReq) {

        Call<AnalysisVisitPageResp> analysisVisitPage = this.datacubeApi.getAnalysisVisitPage(datacubeReq.getAccessToken(), datacubeReq);
        try {
            Response<AnalysisVisitPageResp> execute = analysisVisitPage.execute();
            AnalysisVisitPageResp body = execute.body();
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            throw WXException.build(WXErrorCode.REQUEST_ERR);
        }
    }
}
