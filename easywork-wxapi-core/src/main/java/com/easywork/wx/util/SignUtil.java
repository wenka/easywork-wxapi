package com.easywork.wx.util;

import java.util.*;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/12/21
 * @desc
 */
public class SignUtil {

    /**
     * 生成签名
     *
     * @param args
     * @param paykey
     * @return
     */
    public static String getSign(Map args, String paykey) {
        Set set = args.keySet();
        List<String> keys = new LinkedList<String>(set);
        Collections.sort(keys, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        StringBuffer buffer = new StringBuffer();
        for (String key : keys) {
            Object o = args.get(key);
            if (o != null && !o.toString().trim().equals("")) {
                buffer.append(key + "=" + o.toString() + "&");
            }
        }
        String stringSignTemp = buffer.append("key=" + paykey).toString();
        String sign = MD5Util.MD5Encode(stringSignTemp).toUpperCase();
        return sign;
    }
}
