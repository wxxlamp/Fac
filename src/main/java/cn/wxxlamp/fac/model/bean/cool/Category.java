package cn.wxxlamp.fac.model.bean.cool;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/03/24~15:01
 */
@Gecco(matchUrl = "https://coolapk.com/apk?p={p}", pipelines = {"coolCategory"})
public class Category implements HtmlBean {

    private static final long serialVersionUID = 665662335418691818L;

    @Request
    private HttpRequest request;

    @Href(click = true)
    @HtmlField(cssPath = "body > div.warpper > div:nth-child(2) > div.app_left > div.app_left_list > a")
    private String detailUrl;

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "CoolApk{" +
                "detailUrl=" + detailUrl +
                '}';
    }
}
