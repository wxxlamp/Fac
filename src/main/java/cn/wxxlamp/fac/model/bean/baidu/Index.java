package cn.wxxlamp.fac.model.bean.baidu;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * @author wxxlamp
 * @date 2021/04/16~10:46
 */
@Gecco(matchUrl = "https://shouji.baidu.com/", pipelines = "baiduIndex", timeout = 40_000)
public class Index implements HtmlBean {

    @Request
    private HttpRequest request;

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }
}
