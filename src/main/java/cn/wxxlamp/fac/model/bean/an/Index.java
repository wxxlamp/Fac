package cn.wxxlamp.fac.model.bean.an;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/15~10:25
 */
@Gecco(matchUrl = {"http://www.anzhi.com/applist.html", "http://www.anzhi.com/gamelist.html"},
 pipelines = {"anIndex"}, timeout = 10_000)
public class Index implements HtmlBean {

    @Request
    private HttpRequest request;

    @HtmlField(cssPath = "body > div.content > div.sides")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "Index{" +
                "content" + content +
                '}';
    }
}