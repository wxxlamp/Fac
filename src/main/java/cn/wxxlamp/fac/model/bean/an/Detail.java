package cn.wxxlamp.fac.model.bean.an;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/15~10:03
 */
@Gecco(matchUrl = "http://www.anzhi.com/pkg/{pkg.html}", pipelines = {"anDetail"}, timeout = 10_000)
public class Detail implements HtmlBean {

    @HtmlField(cssPath = "body > div.content > div.content_left > div.border_three > div.app_detail > div.detail_description > div:nth-child(1) > h3")
    private String name;

    @HtmlField(cssPath = "body > div.content > div.content_left > div.border_three > div.app_detail > div.detail_description > div:nth-child(2) > h3")
    private String namePlus;

    @HtmlField(cssPath = "#detail_line_ul > li:nth-child(4) > span")
    private String size;

    @HtmlField(cssPath = "body > div.content > div.content_left > div.border_three > div.app_detail > div.detail_description > div:nth-child(2) > span")
    private String versionPlus;

    @HtmlField(cssPath = "body > div.content > div.content_left > div.border_three > div.app_detail > div.detail_description > div:nth-child(1) > span")
    private String version;

    @HtmlField(cssPath = "#detail_line_ul > li:nth-child(1)")
    private String tagName;

    @Href
    @HtmlField(cssPath = "body > div.content > div.content_left > div.border_three > div.app_detail > div.detail_other > div.detail_down > a")
    private String url;

    public String getNamePlus() {
        return namePlus;
    }

    public void setNamePlus(String namePlus) {
        this.namePlus = namePlus;
    }

    public String getVersionPlus() {
        return versionPlus;
    }

    public void setVersionPlus(String versionPlus) {
        this.versionPlus = versionPlus;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", version='" + version + '\'' +
                ", tagName='" + tagName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
