package cn.wxxlamp.fac.pipe;

import cn.wxxlamp.fac.model.FadFactory;
import cn.wxxlamp.fac.model.FinancialAppDesc;
import cn.wxxlamp.fac.model.bean.Wandoujia;
import cn.wxxlamp.fac.util.IoUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/24~16:45
 */
@PipelineName("wandoujiaPipeline")
public class WandoujiaPipeline implements Pipeline<Wandoujia> {

    public static final String KEY = "Wandoujia";

    @Override
    public void process(Wandoujia bean) {
        String content = bean.getContent();
        content = content.replaceAll("\\\\", "");
        Document document = Jsoup.parse(content);
        Elements elements = document.getElementsByClass("app-desc");
        List<FinancialAppDesc> fadList = FadFactory.getMap(KEY);
        for (Element element : elements) {
            FinancialAppDesc fad = new FinancialAppDesc();
            Elements a = element.select("a[class='name']");
            fad.setAppName(a.text());
            fad.setApkName(a.attr("href"));
            fad.setSize(element.select("span").get(2).text());
            fadList.add(fad);
        }
        IoUtils.writeFile(KEY, fadList, false);
//         爬取下一页
        String nextUrl = next(bean.getRequest().getUrl(), bean.getCurrPage());
        if (nextUrl != null) {
            DeriveSchedulerContext.into(bean.getRequest().subRequest(nextUrl));
        }
    }

    private String next(String url, Integer currPage) {
        int nextPage;
        if ((nextPage = currPage + 1) == 0) {
            return null;
        }
        return url.replace("page=" + currPage, "page=" + nextPage);
    }
}
