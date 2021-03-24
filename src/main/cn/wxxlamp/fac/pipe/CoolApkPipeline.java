package cn.wxxlamp.fac.pipe;

import cn.wxxlamp.fac.model.FadFactory;
import cn.wxxlamp.fac.model.FinancialAppDesc;
import cn.wxxlamp.fac.model.bean.CoolApkDetail;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.response.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/24~15:28
 */
@PipelineName("coolApkPipeline")
public class CoolApkPipeline implements Pipeline<CoolApkDetail> {

    public static final String KEY = "COOL_APK";

    @Override
    public void process(CoolApkDetail bean) {
        String name = this.substring(bean.getName(), "<span ");
        String size = this.substring(bean.getSize(), " / ");
        List<FinancialAppDesc> fadList = FadFactory.getMap(KEY);
        FinancialAppDesc fad = new FinancialAppDesc();
        fad.setAppName(name);
        fad.setApkName(bean.getApkNameUrl());
        fad.setSize(size);
        fadList.add(fad);
    }

    private String substring(String origin, String end) {
        return origin.substring(0, origin.indexOf(end));
    }
}
