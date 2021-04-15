package cn.wxxlamp.fac.model.bean.an;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/15~09:46
 */
@Gecco(matchUrl = "http://www.anzhi.com/sort_{c}_{p}_hot.html", pipelines = {"anCategory"}, timeout = 10_000)
public class Category implements HtmlBean {

    private static final long serialVersionUID = 665362335418691818L;

    @Request
    private HttpRequest request;

    @Href(click = true)
    @HtmlField(cssPath = "body > div.content > div.content_left > div.app_list.border_three > ul > li > div.app_info > span > a")
    private List<String> detailUrl;

    @HtmlField(cssPath = "body > div.content > div.content_left > div.app_list.border_three > div")
    private String pages;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public List<String> getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(List<String> detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Category{" +
                "detailUrl=" + detailUrl +
                ", pages='" + pages + '\'' +
                '}';
    }
}
