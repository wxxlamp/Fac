package cn.wxxlamp.fac.pipe;

import cn.wxxlamp.fac.model.bean.MiApp;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;

/**
 * @author wxxlamp
 * @date 2021/03/26~15:19
 */
@PipelineName("miAppPipeline")
public class MiAppPipeline implements Pipeline<MiApp> {

    private static final String URL = "https://app.mi.com/details?id=";

    private static final Integer ZERO = 48;

    @Override
    public void process(MiApp bean) {
        bean.getUrlDetail().forEach(e -> {
            if (e == null) {
                return;
            }
            String nextUrl = URL + e;
            DeriveSchedulerContext.into(bean.getRequest().subRequest(nextUrl));
        });
        String url = next(bean.getRequest().getUrl());
        DeriveSchedulerContext.into(bean.getRequest().subRequest(url));
    }

    private String next(String url) {
        int curPage = url.charAt(url.indexOf("page=") + 5) - ZERO;
        int nextPage = curPage + 1;
        return url.replace("page=" + curPage, "page=" + nextPage);
    }
}
