package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.spider.SpiderBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/23~20:01
 */
public interface MyApp extends SpiderBean {
    /**
     * 获取app的名字
     * @return 数组
     */
    List<String> getName();

    /**
     * 设置app的名字
     * @param name 名字
     */
    void setName(List<String> name);

    /**
     * 获取app的容量
     * @return 数组
     */
    List<String> getSize();

    /**
     * 设置app的容量
     * @param size 容量
     */
    void setSize(List<String> size);

    /**
     * 获取apk的名字
     * @return 数组
     */
    List<String> getApkName();

    /**
     * 设置app的名字
     * @param apkName 下载地址
     */
    void setApkName(List<String> apkName);
}
