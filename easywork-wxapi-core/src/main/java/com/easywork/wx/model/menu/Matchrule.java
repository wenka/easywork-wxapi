package com.easywork.wx.model.menu;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/23  下午 03:24
 * Description:
 */
public class Matchrule {
    private int group_id;
    private int sex;
    private String country;
    private String province;
    private String city;
    private int client_platform_type;

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getClient_platform_type() {
        return client_platform_type;
    }

    public void setClient_platform_type(int client_platform_type) {
        this.client_platform_type = client_platform_type;
    }

    @Override
    public String toString() {
        return "Matchrule{" +
                "group_id=" + group_id +
                ", sex=" + sex +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", client_platform_type=" + client_platform_type +
                '}';
    }
}
