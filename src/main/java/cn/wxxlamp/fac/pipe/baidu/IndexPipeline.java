package cn.wxxlamp.fac.pipe.baidu;

import cn.wxxlamp.fac.model.TempRequestList;
import cn.wxxlamp.fac.model.bean.baidu.Index;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;

/**
 * @author wxxlamp
 * @date 2021/04/16~10:48
 */
@PipelineName("baiduIndex")
public class IndexPipeline implements Pipeline<Index> {
    @Override
    public void process(Index bean) {
        HttpRequest request = bean.getRequest();
        for (int i = 1; i <= 8; i++) {
            TempRequestList.REQUEST_LIST.add(request.subRequest("https://shouji.baidu.com/software/50" + i + "/list_1.html"));
            TempRequestList.REQUEST_LIST.add(request.subRequest("https://shouji.baidu.com/game/40" + i + "/list_1.html"));
        }
        TempRequestList.REQUEST_LIST.add(request.subRequest("https://shouji.baidu.com/software/510/list_1.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest("https://shouji.baidu.com/software/509/list_1.html"));
    }
}
