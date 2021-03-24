package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.spider.HrefBean;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.geccocrawler.gecco.spider.JsonBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/23~11:41
 */
@Gecco(matchUrl="https://www.wandoujia.com/wdjweb/api/category/more?catId=5023&subCatId=0&page={p}&ctoken=xGipLhPfFmewPBkMfZZEV_V8", pipelines={"consolePipeline"})
public class Wandoujia implements JsonBean {

    private static final long serialVersionUID = 675662335418691818L;

    @JSONPath("$.data.content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
