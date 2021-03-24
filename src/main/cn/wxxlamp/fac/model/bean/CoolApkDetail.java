package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 酷安
 * @author wxxlamp
 * @date 2021/03/23~20:31
 */
@Gecco(matchUrl = "https://www.coolapk.com/apk/{detail}", pipelines = {"consolePipeline",
//        "coolApkPipeline"
})
public class CoolApkDetail implements HtmlBean {

    private static final long serialVersionUID = 65662335318691818L;

    @Request
    private HttpRequest request;
    /**
     * appName
     */
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > p.detail_app_title")
    private String name;

    /**
     * 点击才能获得apkName，302
     */
    @Href(click = true)
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > a.show-dialog")
    private String apkNameUrl;

    /**
     * 安装包大小
     */
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > p.apk_topba_message")
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApkNameUrl() {
        return apkNameUrl;
    }

    public void setApkNameUrl(String apkNameUrl) {
        this.apkNameUrl = apkNameUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "CoolApkDetail{" +
                "request=" + request +
                ", name='" + name + '\'' +
                ", apkNameUrl='" + apkNameUrl + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

