package cn.wxxlamp.fac.model.bean.wandoujia;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/14~15:41
 */
@Gecco(matchUrl = "https://www.wandoujia.com/category/app", pipelines = "wandoujiaCategory")
public class Category implements HtmlBean {

    @Request
    private HttpRequest request;

    @Href
    @HtmlField(cssPath = "body > div.container > ul.clearfix.tag-box > li > div > a")
    private List<String> appHref;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public List<String> getAppHref() {
        return appHref;
    }

    public void setAppHref(List<String> appHref) {
        this.appHref = appHref;
    }
}
