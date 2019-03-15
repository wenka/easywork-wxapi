package com.easywork.wx.model.analysis.user.portrait;

import java.util.List;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  下午 01:20
 * Description:
 */
public class VisitUv {

    private Integer index; //分布类型

    private List<UV> province;

    private List<UV> city;

    private List<UV> genders;

    private List<UV> platforms;

    private List<UV> devices;

    private List<UV> ages;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<UV> getProvince() {
        return province;
    }

    public void setProvince(List<UV> province) {
        this.province = province;
    }

    public List<UV> getCity() {
        return city;
    }

    public void setCity(List<UV> city) {
        this.city = city;
    }

    public List<UV> getGenders() {
        return genders;
    }

    public void setGenders(List<UV> genders) {
        this.genders = genders;
    }

    public List<UV> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<UV> platforms) {
        this.platforms = platforms;
    }

    public List<UV> getDevices() {
        return devices;
    }

    public void setDevices(List<UV> devices) {
        this.devices = devices;
    }

    public List<UV> getAges() {
        return ages;
    }

    public void setAges(List<UV> ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "VisitUv{" +
                "index=" + index +
                ", province=" + province +
                ", city=" + city +
                ", genders=" + genders +
                ", platforms=" + platforms +
                ", devices=" + devices +
                ", ages=" + ages +
                '}';
    }
}
