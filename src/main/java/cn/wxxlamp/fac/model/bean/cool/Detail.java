package cn.wxxlamp.fac.model.bean.cool;

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
@Gecco(matchUrl = "https://coolapk.com/apk/{detail}", pipelines = {"coolDetail"})
public class Detail implements HtmlBean {

    private static final long serialVersionUID = 65662335318691818L;

    @Request
    private HttpRequest request;
    /**
     * appName
     */
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > p.detail_app_title")
    private String name;

    /**
     * 安装包大小
     */
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > p.apk_topba_message")
    private String size;

    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_two > div > div:nth-child(6) > p:nth-child(2) > a > span")
    private String tagName;

    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.apk_left_one > div > div > div.apk_topbar_mss > p.detail_app_title > span")
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CoolApkDetail{" +
                ", name='" + name + '\'' +
                ", tagName='" + tagName + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

