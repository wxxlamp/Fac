package cn.wxxlamp.fac.model.bean.baidu;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/16~10:55
 */
@Gecco(matchUrl = "https://shouji.baidu.com/{type}/{app}.html", timeout = 40_000, pipelines = "baiduDetail")
public class Detail implements HtmlBean {

    @Request
    private HttpRequest request;

    @HtmlField(cssPath = "#doc > div.yui3-g > div > div.app-intro > div > div.content-right > h1 > span")
    private String name;

    @HtmlField(cssPath = "#doc > div.yui3-g > div > div.app-intro > div > div.content-right > div.detail > span.size")
    private String size;

    @HtmlField(cssPath = "#doc > div.yui3-g > div > div.app-intro > div > div.content-right > div.detail > span.version")
    private String version;

    @HtmlField(cssPath = "#doc > div.app-nav > div > span:nth-child(5) > a")
    private String tagName;

    @HtmlField(cssPath = "#doc > div.app-nav > div > span:nth-child(3) > a")
    private String kindName;

    @Attr("data_package")
    @HtmlField(cssPath = "#doc > div.yui3-g > div > div.app-intro > div > div.area-one-setup > span")
    private String packageName;

    @Href
    @HtmlField(cssPath = "#doc > div.yui3-g > div > div.app-intro > div > div.area-download > a")
    private String url;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
