package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.JsonBean;

/**
 * @author wxxlamp
 * @date 2021/03/23~11:41
 */
@Gecco(matchUrl="https://www.wandoujia.com/wdjweb/api/category/more?catId=5023&subCatId=0&page={p}&ctoken=xGipLhPfFmewPBkMfZZEV_V8", pipelines={"consolePipeline", "wandoujiaPipeline"})
public class Wandoujia implements JsonBean {

    private static final long serialVersionUID = 675662335438691818L;

    @Request
    private HttpRequest request;

    @JSONPath("$.data.content")
    private String content;

    @JSONPath("$.data.currPage")
    private Integer currPage;

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

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    @Override
    public String toString() {
        return "Wandoujia{" +
                "request=" + request.getUrl() +
                ", content='" + content + '\'' +
                ", currPage='" + currPage + '\'' +
                '}';
    }
}
