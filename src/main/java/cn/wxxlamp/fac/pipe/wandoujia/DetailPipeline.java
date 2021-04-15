package cn.wxxlamp.fac.pipe.wandoujia;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.wandoujia.Detail;
import cn.wxxlamp.fac.util.CypherUtils;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author wxxlamp
 * @date 2021/03/24~16:45
 */
@PipelineName("wandoujiaDetail")
public class DetailPipeline implements Pipeline<Detail> {

    public static final String KEY = "Wandoujia";

    private static final String APP_STORE = "WAN_DOU_JIA";

    @Override
    public void process(Detail bean) {
        String content = bean.getContent();
        content = content.replaceAll("\\\\", "");
        Document document = Jsoup.parse(content);
        Elements elements = document.getElementsByClass("card");
        for (Element element : elements) {
            AppDesc appDesc = getAppDesc(element);
            AppDescMapper.mapper(appDesc);
        }
//         爬取下一页
        if (bean.getCurrPage() == -1) {
            return;
        }
        String nextUrl = UrlUtils.getNextUrl(bean.getRequest().getUrl(), "page=", 1);
        DeriveSchedulerContext.into(bean.getRequest().subRequest(nextUrl));

    }

    private AppDesc getAppDesc(Element element) {
        AppDesc appDesc = new AppDesc();
        Elements a = element.select("a[class='name']");
        appDesc.setName(a.text());
        appDesc.setUrl(a.attr("href"));
        appDesc.setSize(element.select("span").get(2).text());
        appDesc.setPackageName(element.attr("data-pn"));
        appDesc.setKindName(element.select("a[class='tag-link']").text());
        appDesc.setTagName(appDesc.getKindName());
        appDesc.setAppId(CypherUtils.getMd5(appDesc.getName() + appDesc.getPackageName()));
        appDesc.setVersion(element.select("a[class='detail-check-btn']").attr("data-app-vname"));
        appDesc.setAppStore(APP_STORE);
        return appDesc;
    }
}
