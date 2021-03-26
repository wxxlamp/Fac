package cn.wxxlamp.fac.pipe;

import cn.wxxlamp.fac.model.FinancialAppDesc;
import cn.wxxlamp.fac.model.bean.MiAppDetail;
import cn.wxxlamp.fac.util.IoUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

/**
 * @author wxxlamp
 * @date 2021/03/26~15:48
 */
@PipelineName("miAppDetailPipeline")
public class MiAppDetailPipeline implements Pipeline<MiAppDetail> {

    public static final String KEY = "MiApp";

    @Override
    public void process(MiAppDetail bean) {
        FinancialAppDesc fad = new FinancialAppDesc();
        fad.setApkName(bean.getApkName());
        fad.setSize(bean.getSize());
        fad.setAppName(bean.getAppName());
        IoUtils.writeFile(KEY, fad);
    }
}
