package com.easywork.wx.api;

import com.easywork.wx.model.req.DatacubeReq;
import com.easywork.wx.model.resp.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 10:26
 * Description: 数据分析
 */
public interface DatacubeApi {

    /**
     * 获取用户访问小程序日留存
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappiddailyretaininfo")
    Call<AnalysisRetainResp> getAnalysisDailyRetain(@Query("access_token") String accessToken,
                                                    @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序月留存
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappidmonthlyretaininfo")
    Call<AnalysisRetainResp> getAnalysisMonthlyRetain(@Query("access_token") String accessToken,
                                                      @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序周留存
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappidweeklyretaininfo")
    Call<AnalysisRetainResp> getAnalysisWeeklyRetain(@Query("access_token") String accessToken,
                                                     @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序数据概况
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappiddailysummarytrend")
    Call<AnalysisDailySummaryResp> getAnalysisDailySummary(@Query("access_token") String accessToken,
                                                           @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序数据日趋势
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappiddailyvisittrend")
    Call<AnalysisVisitTrendResp> getAnalysisDailyVisitTrend(@Query("access_token") String accessToken,
                                                            @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序数据周趋势
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappidweeklyvisittrend")
    Call<AnalysisVisitTrendResp> getAnalysisWeeklyVisitTrend(@Query("access_token") String accessToken,
                                                             @Body DatacubeReq datacubeReq);

    /**
     * 获取用户访问小程序数据月趋势
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappidmonthlyvisittrend")
    Call<AnalysisVisitTrendResp> getAnalysisMonthlyVisitTrend(@Query("access_token") String accessToken,
                                                              @Body DatacubeReq datacubeReq);

    /**
     * 获取小程序新增或活跃用户的画像分布数据。时间范围支持昨天、最近7天、最近30天。
     * 其中，新增用户数为时间范围内首次访问小程序的去重用户数，活跃用户数为时间范围内访问过小程序的去重用户数。
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappiduserportrait")
    Call<AnalyUserPortraitResp> getAnalysisUserPortrait(@Query("access_token") String accessToken,
                                                        @Body DatacubeReq datacubeReq);

    /**
     * 访问页面。目前只提供按 page_visit_pv 排序的 top200。
     *
     * @param accessToken
     * @param datacubeReq
     * @return
     */
    @POST("getweanalysisappidvisitpage")
    Call<AnalysisVisitPageResp> getAnalysisVisitPage(@Query("access_token") String accessToken,
                                                     @Body DatacubeReq datacubeReq);
}
