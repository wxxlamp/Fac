package cn.wxxlamp.fac.model.bean.china;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/16~15:51
 */
@Gecco(matchUrl = "http://www.appchina.com/app/{pkg}", pipelines = "chinaDetail", timeout = 40_000)
public class Detail implements HtmlBean {

    @Request
    private HttpRequest request;

    @HtmlField(cssPath = "#pagecontainer > div.main > div.app-msg > div.app-detail > div > h1")
    private String name;

    @Attr("onclick")
    @HtmlField(cssPath = "#pagecontainer > div.main > div.app-msg > div.detail-classify > div.detail-app-tag-other-info > div > a")
    private String url;

    @HtmlField(cssPath = "#pagecontainer > div.main > div.detail-app-intro > div.main-right > div:nth-child(1) > div > p:nth-child(3)")
    private String size;

    @HtmlField(cssPath = "#pagecontainer > div.main > div.detail-app-intro > div.main-right > div:nth-child(1) > div > p:nth-child(5)")
    private String version;

    @HtmlField(cssPath = "#pagecontainer > div.breadcrumb.centre-content > a:nth-child(2)")
    private String kindName;

    @HtmlField(cssPath = "#pagecontainer > div.breadcrumb.centre-content > a:nth-child(3)")
    private String tagName;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
