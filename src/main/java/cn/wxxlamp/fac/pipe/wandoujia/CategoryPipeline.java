package cn.wxxlamp.fac.pipe.wandoujia;

import cn.wxxlamp.fac.model.TempRequestList;
import cn.wxxlamp.fac.model.bean.wandoujia.Category;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/14~15:43
 */
@PipelineName("wandoujiaCategory")
public class CategoryPipeline implements Pipeline<Category> {

    private static final String CATEGORY = "/category/";

    @Override
    public void process(Category bean) {
        HttpRequest request = bean.getRequest();
        for (String url : bean.getAppHref()) {
            int index = url.indexOf(CATEGORY) + CATEGORY.length();
            String tempStr = url.substring(index);
            String[] cateAndTag = tempStr.split("_");
            String tagUrl = "https://www.wandoujia.com/wdjweb/api/category/more?catId="
                    + cateAndTag[0] + "&subCatId=" + cateAndTag[1]
                    + "&page=1&ctoken=xGipLhPfFmewPBkMfZZEV_V8";
            TempRequestList.REQUEST_LIST.add(request.subRequest(tagUrl));
        }
    }
}
