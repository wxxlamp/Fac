package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/24~15:01
 */
@Gecco(matchUrl = "https://www.coolapk.com/apk/finance/?p={p}", pipelines = {"consolePipeline"})
public class CoolApk implements HtmlBean {

    private static final long serialVersionUID = 665662335418691818L;

    @Href(click = true)
    @HtmlField(cssPath = "#game_left > div > a")
    private List<String> detailUrl;

    @Href(click = true)
    @HtmlField(cssPath = "#game_left > div > div.panel-footer.ex-card-footer.text-center > ul > li:nth-child(8) > a")
    private String nextPage;

    public List<String> getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(List<String> detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public String toString() {
        return "CoolApk{" +
                "detailUrl=" + detailUrl +
                ", nextPage=" + nextPage +
                '}';
    }
}
