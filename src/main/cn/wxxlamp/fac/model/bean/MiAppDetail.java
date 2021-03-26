package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/03/26~11:56
 */
@Gecco(matchUrl = "https://app.mi.com/details?id={id}", pipelines = {"miAppDetailPipeline"})
public class MiAppDetail implements HtmlBean {

    private static final long serialVersionUID = 675462335438691818L;

    @HtmlField(cssPath = "body > div.main > div.container.cf > div.app-intro.cf > div > div > h3")
    private String appName;

    @HtmlField(cssPath = "body > div.main > div.container.cf > div:nth-child(10) > div.float-left > div:nth-child(2)")
    private String apkName;

    @HtmlField(cssPath = "body > div.main > div.container.cf > div:nth-child(4) > div.float-left > div:nth-child(2)")
    private String size;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MiAppDetail{" +
                "appName='" + appName + '\'' +
                ", apkName='" + apkName + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
