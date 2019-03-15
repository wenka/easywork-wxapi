package com.easywork.wx.model.analysis;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/03/15  上午 10:56
 * Description:
 */
public class KV {
    /**
     * 标识，0开始，表示当天，1表示1天后。依此类推，key取值分别是：0,1,2,3,4,5,6,7,14,30
     */
    int key;
    /**
     * key对应日期的新增用户数/活跃用户数（key=0时）或留存用户数（k>0时）
     */
    int value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KV{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
