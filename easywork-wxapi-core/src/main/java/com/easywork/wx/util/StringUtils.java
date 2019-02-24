package com.easywork.wx.util;

/**
 * Created with IDEA
 * author:wenka wkwenka@gmail.com
 * Date:2019/02/24  下午 01:29
 * Description:
 */
public class StringUtils {

    /**
     * 验证是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }


    /**
     * 验证是否不为空
     *
     * @param str
     * @return
     */
    public static boolean isNoEmpty(String str) {
        return !isEmpty(str);
    }

}
