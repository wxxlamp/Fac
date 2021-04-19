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

    private static boolean unInit;

    private static final String URL = "http://www.appchina.com/category/";

    @Override
    public void process(Index bean) {
        if (!unInit) {
            unInit = true;
            HttpRequest request = bean.getRequest();
            TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "30/1_1_1_3_0_0_0.html"));
            TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "40/1_1_1_3_0_0_0.html"));
        }
    }
}
