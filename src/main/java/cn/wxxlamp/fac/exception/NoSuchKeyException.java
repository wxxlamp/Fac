package cn.wxxlamp.fac.exception;

/**
 * @author wxxlamp
 * @date 2021/04/16~11:18
 */
public class NoSuchKeyException extends RuntimeException {
    public NoSuchKeyException(String url, String key) {
        super("url: " + url + " has no such key: " + key);
    }
}
