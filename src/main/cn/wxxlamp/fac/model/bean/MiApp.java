package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.JsonBean;

import java.util.List;

/**
 * 小米
 * @author wxxlamp
 * @date 2021/03/26~11:37
 */
@Gecco(matchUrl = "https://app.mi.com/categotyAllListApi?page={p}&categoryId=1&pageSize=30", pipelines = {"consolePipeline", "miAppPipeline"})
public class MiApp implements JsonBean {

    private static final long serialVersionUID = 6756623354386912318L;

    @Request
    private HttpRequest request;

    @JSONPath("$.data.packageName")
    private List<String> urlDetail;

    public List<String> getUrlDetail() {
        return urlDetail;
    }

    public void setUrlDetail(List<String> urlDetail) {
        this.urlDetail = urlDetail;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "MiApp{" +
                "request=" + request.getUrl() +
                "urlDetail=" + urlDetail +
                '}';
    }
}
