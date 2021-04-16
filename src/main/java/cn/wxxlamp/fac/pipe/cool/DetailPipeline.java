package cn.wxxlamp.fac.pipe.cool;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.cool.Detail;
import cn.wxxlamp.fac.util.CypherUtils;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

/**
 * @author wxxlamp
 * @date 2021/03/24~15:28
 */
@PipelineName("coolDetail")
public class DetailPipeline implements Pipeline<Detail> {

    private static final String APP_STORE = "COO_APK";

    private static final String URL = "https://coolapk.com/apk/";

    @Override
    public void process(Detail bean) {
        AppDesc appDesc = getAppDesc(bean);
        AppDescMapper.mapper(appDesc);
    }

    private AppDesc getAppDesc(Detail bean) {
        String name = UrlUtils.substring(bean.getName(), "<span ");
        String size = UrlUtils.substring(bean.getSize(), " / ");
        String packageName = bean.getRequest().getUrl().substring(URL.length());
        AppDesc appDesc = new AppDesc();
        appDesc.setAppStore(APP_STORE);
        appDesc.setVersion(bean.getVersion());
        if (bean.getTagName() == null) {
            bean.setTagName("null");
        }
        if (bean.getTagName().contains("\n")) {
            bean.setTagName(bean.getTagName().split("\n")[0]);
        }
        appDesc.setTagName(bean.getTagName());
        appDesc.setKindName(bean.getTagName());
        appDesc.setPackageName(packageName);
        appDesc.setSize(size);
        appDesc.setName(name);
        appDesc.setUrl(bean.getRequest().getUrl());
        appDesc.setAppId(CypherUtils.getMd5(name + packageName));
        return appDesc;
    }
}
