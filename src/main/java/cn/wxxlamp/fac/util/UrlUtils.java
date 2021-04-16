package cn.wxxlamp.fac.util;

import cn.wxxlamp.fac.exception.NoSuchKeyException;

/**
 * @author wxxlamp
 * @date 2021/03/29~11:58
 */
public class UrlUtils {

    private static final Integer ZERO = 48;

    private static final char AND = '&';

    private static final char MINUS = '-';

    /**
     * 获得下一页的url
     * @return 下一页的url
     */
    public static String getNextUrl(String url, String key, int step) {
        int currPage = getUrlValue(url, key);
        return url.replace(key + currPage, key + (currPage + step));
    }

    public static Integer getUrlValue(String url, String key) {
        int index = checkKey(url, key) + key.length();
        int value = 0;
        boolean minus = false;
        if (url.charAt(index) == MINUS) {
            index ++;
            minus = true;
        }
        // TODO 这里不应该是！=and，应该是检测到非0-9
        while (index < url.length() && url.charAt(index) != AND) {
            value *= 10;
            value += url.charAt(index ++) - ZERO;
        }
        return minus ? -value : value;
    }

    public static String getUrlStrValue(String url, String key) {
        int index = checkKey(url, key) + key.length();
        StringBuilder sb = new StringBuilder();
        while (index < url.length() && url.charAt(index) != AND) {
            sb.append(url.charAt(index ++));
        }
        return sb.toString();
    }

    public static String substring(String origin, String end) {
        return origin.substring(0, origin.indexOf(end));
    }

    private static int checkKey(String url, String key) {
        int tIndex;
        if ((tIndex = url.indexOf(key)) == -1) {
            throw new NoSuchKeyException(url, key);
        }
        return tIndex;
    }
}
