package cn.wxxlamp.fac.pipe.china;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.china.Detail;
import cn.wxxlamp.fac.util.CypherUtils;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author wxxlamp
 * @date 2021/04/16~16:01
 */
@PipelineName("chinaDetail")
public class DetailPipeline implements Pipeline<Detail> {

    private static final String URL = "freeDownload(this,'";

    private static final String APP_STORE = "APP_CHINA";

    private static final Log LOGGER = LogFactory.getLog(DetailPipeline.class);

    @Override
    public void process(Detail bean) {
        AppDesc appDesc = getAppDesc(bean);
        LOGGER.info(bean.getRequest().getUrl() + ": " + appDesc);
        AppDescMapper.mapper(appDesc);
    }

    private AppDesc getAppDesc(Detail bean) {
        String url = bean.getRequest().getUrl();
        String pkg = UrlUtils.getUrlStrValue(url,"/app/");
        // 未发布app不收录
        if (pkg.contains("appchina") || "应用汇".equals(bean.getName())) {
            return null;
        }
        AppDesc appDesc = new AppDesc();
        appDesc.setPackageName(pkg);
        appDesc.setName(bean.getName());
        if (bean.getUrl().contains(URL)) {
            appDesc.setUrl(UrlUtils.substring(bean.getUrl().substring(URL.length()), "')"));
        } else {
            appDesc.setUrl(url);
        }
        appDesc.setAppStore(APP_STORE);
        appDesc.setSize(bean.getSize().substring(3));
        appDesc.setTagName(UrlUtils.substring(bean.getTagName().substring(2),"APP"));
        appDesc.setKindName(bean.getKindName().substring(2));
        appDesc.setVersion(bean.getVersion().substring(3));
        appDesc.setAppId(CypherUtils.getMd5(bean.getName() + pkg));
        return appDesc;
    }
}
