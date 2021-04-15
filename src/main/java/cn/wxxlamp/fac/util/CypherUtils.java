package cn.wxxlamp.fac.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * 通过md5加密
 * @author wxxlamp
 * @date 2021/04/01~12:01
 */
public class CypherUtils {

    /**
     * 16进制的字符集
     */
    private final static char [] HEX_DIGITS_CHAR =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static final String MD5 = "MD5";

    private static final String UTF_8 = "UTF-8";

    /**
     * MD5加密字符串
     *
     * @param source 源字符串
     *
     * @return 加密后的字符串
     *
     */
    public static String getMd5(String source) {
        String mdString = null;
        if (source != null) {
            mdString = getMd5(source.getBytes(StandardCharsets.UTF_8));
        }
        return mdString;
    }
    /**
     * MD5加密以byte数组表示的字符串
     *
     * @param source 源字节数组
     *
     * @return 加密后的字符串
     */
    public static String getMd5(byte[] source) {
        String s = null;

        final int temp = 0xf;
        final int arraySize = 32;
        final int strLen = 16;
        final int offset = 4;
        try {
            MessageDigest md = MessageDigest.getInstance(MD5);
            md.update(source);
            byte [] tmp = md.digest();
            char [] str = new char[arraySize];
            int k = 0;
            for (int i = 0; i < strLen; i++) {
                byte byte0 = tmp[i];
                str[k++] = HEX_DIGITS_CHAR[byte0 >>> offset & temp];
                str[k++] = HEX_DIGITS_CHAR[byte0 & temp];
            }
            s = new String(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String httpEncode(String str) {
        String encode = null;
        try {
            encode = URLEncoder.encode(str, UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encode;
    }
}
