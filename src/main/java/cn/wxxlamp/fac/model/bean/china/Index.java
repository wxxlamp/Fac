package cn.wxxlamp.fac.model.bean.china;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/16~16:11
 */
@Gecco(matchUrl = "http://www.appchina.com/", pipelines = "chinaIndex", timeout = 40_000)
public class Index implements HtmlBean {

    @Request
    private HttpRequest request;

    @Href
    @HtmlField(cssPath = "#soft")
    private String appHref;

    @Href
    @HtmlField(cssPath = "#game")
    private String gameHref;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public String getAppHref() {
        return appHref;
    }

    public void setAppHref(String appHref) {
        this.appHref = appHref;
    }

    public String getGameHref() {
        return gameHref;
    }

    public void setGameHref(String gameHref) {
        this.gameHref = gameHref;
    }
}
