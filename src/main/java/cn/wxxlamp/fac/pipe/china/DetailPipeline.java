package cn.wxxlamp.fac.pipe.china;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.china.Detail;
import cn.wxxlamp.fac.util.CypherUtils;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

/**
 * @author wxxlamp
 * @date 2021/04/16~16:01
 */
@PipelineName("chinaDetail")
public class DetailPipeline implements Pipeline<Detail> {

    private static final String URL = "freeDownload(this,'";

    private static final String APP_STORE = "APP_CHINA";

    @Override
    public void process(Detail bean) {
        AppDesc appDesc = getAppDesc(bean);
        AppDescMapper.mapper(appDesc);
    }

    private AppDesc getAppDesc(Detail bean) {
        AppDesc appDesc = new AppDesc();
        String pkg = UrlUtils.getUrlStrValue(bean.getRequest().getUrl(),"/app/");
        appDesc.setPackageName(pkg);
        appDesc.setName(bean.getName());
        appDesc.setUrl(UrlUtils.substring(bean.getUrl().substring(URL.length()), "')"));
        appDesc.setAppStore(APP_STORE);
        appDesc.setSize(bean.getSize().substring(3));
        appDesc.setTagName(bean.getTagName());
        appDesc.setKindName(bean.getKindName());
        appDesc.setVersion(bean.getVersion().substring(3));
        appDesc.setAppId(CypherUtils.getMd5(bean.getName() + pkg));
        return appDesc;
    }
}
