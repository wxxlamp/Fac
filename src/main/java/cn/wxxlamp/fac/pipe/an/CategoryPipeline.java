package cn.wxxlamp.fac.pipe.an;

import cn.wxxlamp.fac.model.bean.an.Category;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @author wxxlamp
 * @date 2021/04/15~09:58
 */
@PipelineName("anCategory")
public class CategoryPipeline implements Pipeline<Category> {

    static final String URL = "http://www.anzhi.com";

    @Override
    public void process(Category bean) {
        String pages = bean.getPages();
        Document document = Jsoup.parse(pages);
        Elements elements = document.getElementsByClass("next");
        String url = elements.attr("href");
        if (StringUtils.isEmpty(url)) {
            return;
        }
        DeriveSchedulerContext.into(bean.getRequest().subRequest(URL + url));
    }
}
