package cn.wxxlamp.fac.model.bean.china;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/16~15:47
 */
@Gecco(matchUrl = "http://www.appchina.com/category/{type}/{p}_1_1_3_0_0_0.html", pipelines = "chinaCategory", timeout = 40_000)
public class Category implements HtmlBean {

    @Href(click = true)
    @HtmlField(cssPath = "#left > ul > li > div.app-intro > a.view-detail.has-border")
    private List<String> appHref;

    @Href(click = true)
    @HtmlField(cssPath = "#left > div.discuss_fangye > ul > li > a.next")
    private String nextPage;

    public List<String> getAppHref() {
        return appHref;
    }

    public void setAppHref(List<String> appHref) {
        this.appHref = appHref;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
}
