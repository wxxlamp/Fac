package cn.wxxlamp.fac.pipe.an;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.an.Detail;
import cn.wxxlamp.fac.util.CypherUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.apache.commons.lang3.StringUtils;

/**
 * @author wxxlamp
 * @date 2021/04/15~10:11
 */
@PipelineName("anDetail")
public class DetailPipeline implements Pipeline<Detail> {

    private static final String APP_STORE = "AN_ZHI";

    @Override
    public void process(Detail bean) {
        AppDesc appDesc = getAppDesc(bean);
        AppDescMapper.mapper(appDesc);
    }

    private AppDesc getAppDesc(Detail bean) {
        AppDesc appDesc = new AppDesc();
        int begin = bean.getUrl().indexOf("_") + 1;
        int end = bean.getUrl().lastIndexOf(".html#");
        String packageName = bean.getUrl().substring(begin, end);
        if (StringUtils.isEmpty(bean.getName())) {
            bean.setName(bean.getNamePlus());
            bean.setVersion(bean.getVersionPlus());
        }
        appDesc.setUrl(bean.getUrl());
        appDesc.setName(bean.getName());
        appDesc.setSize(bean.getSize().substring(3));
        appDesc.setPackageName(packageName);
        appDesc.setAppStore(APP_STORE);
        bean.setTagName(bean.getTagName().substring(3));
        appDesc.setKindName(bean.getTagName());
        appDesc.setTagName(bean.getTagName());
        appDesc.setAppId(CypherUtils.getMd5(bean.getName() + packageName));
        appDesc.setVersion(bean.getVersion().substring(1, bean.getVersion().lastIndexOf(")")));
        return appDesc;
    }
}
