package cn.wxxlamp.fac.pipe.china;

import cn.wxxlamp.fac.model.TempRequestList;
import cn.wxxlamp.fac.model.bean.china.Index;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;

/**
 * @author wxxlamp
 * @date 2021/04/16~16:14
 */
@PipelineName("chinaIndex")
public class IndexPipeline implements Pipeline<Index> {
    @Override
    public void process(Index bean) {
        HttpRequest request = bean.getRequest();
        TempRequestList.REQUEST_LIST.add(request.subRequest(bean.getAppHref()));
        TempRequestList.REQUEST_LIST.add(request.subRequest(bean.getGameHref()));
    }
}
