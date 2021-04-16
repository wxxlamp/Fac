package cn.wxxlamp.fac.model.bean.baidu;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/16~10:38
 */
@Gecco(matchUrl = "https://shouji.baidu.com/{app}/{type}/list_{p}.html", timeout = 40_000)
public class Category implements HtmlBean {

    @Href(click = true)
    @HtmlField(cssPath = "#doc > div.list.big-app-wrap > div.sec-app.clearfix > div > ul > li > a")
    private List<String> appHref;

    @Href(click = true)
    @HtmlField(cssPath = "#doc > div.list.big-app-wrap > div.pager > ul > li.next > a")
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
