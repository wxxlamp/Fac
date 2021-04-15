package cn.wxxlamp.fac.pipe.an;

import cn.wxxlamp.fac.model.TempRequestList;
import cn.wxxlamp.fac.model.bean.an.Index;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;

import java.util.Collections;

import static cn.wxxlamp.fac.pipe.an.CategoryPipeline.URL;

/**
 * @author wxxlamp
 * @date 2021/04/15~10:32
 */
@PipelineName("anIndex")
public class IndexPipeline implements Pipeline<Index> {
    @Override
    public void process(Index bean) {
        HttpRequest request = bean.getRequest();
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_45_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_50_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_43_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_53_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_54_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_39_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_52_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_46_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_44_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_47_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_40_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_42_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_49_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_51_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_55_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_41_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_48_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_21_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_15_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_14_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_16_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_19_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_20_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_24_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_56_1_hot.html"));
        TempRequestList.REQUEST_LIST.add(request.subRequest(URL + "/sort_57_1_hot.html"));
        Collections.reverse(TempRequestList.REQUEST_LIST);
    }
}
