package cn.wxxlamp.fac.pipe.cool;

import cn.wxxlamp.fac.model.bean.cool.Category;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;

/**
 * @author wxxlamp
 * @date 2021/04/14~19:02
 */
@PipelineName("coolCategory")
public class CategoryPipeline implements Pipeline<Category> {

    private static final int PAGES = 288;

    private static final String KEY = "p=";

    @Override
    public void process(Category bean) {
        HttpRequest request = bean.getRequest();
        if (UrlUtils.getUrlValue(request.getUrl(), KEY) == PAGES) {
            return;
        }
        String url = UrlUtils.getNextUrl(request.getUrl(), KEY, 1);
        DeriveSchedulerContext.into(bean.getRequest().subRequest(url));
    }
}
