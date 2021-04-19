package cn.wxxlamp.fac.pipe.baidu;

import cn.wxxlamp.fac.dao.AppDescMapper;
import cn.wxxlamp.fac.exception.NoSuchKeyException;
import cn.wxxlamp.fac.model.AppDesc;
import cn.wxxlamp.fac.model.bean.baidu.Detail;
import cn.wxxlamp.fac.util.UrlUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author wxxlamp
 * @date 2021/04/16~11:06
 */
@PipelineName("baiduDetail")
public class DetailPipeline implements Pipeline<Detail> {

    private static final String APP_STORE = "BAI_DU";

    private static final Log LOGGER = LogFactory.getLog(DetailPipeline.class);

    @Override
    public void process(Detail bean) {
        AppDesc appDesc = getAppDesc(bean);
        LOGGER.info(bean.getRequest().getUrl() + ": " + appDesc);
        AppDescMapper.mapper(appDesc);
    }

    private AppDesc getAppDesc(Detail bean) {
        AppDesc appDesc = new AppDesc();
        String appId;
        try {
            appId = UrlUtils.substring(UrlUtils.getUrlStrValue(bean.getRequest().getUrl(), "game/"), ".html");
        } catch (NoSuchKeyException ex) {
            appId = UrlUtils.substring(UrlUtils.getUrlStrValue(bean.getRequest().getUrl(), "software/"), ".html");
        }
        appDesc.setAppId(appId);
        appDesc.setVersion(bean.getVersion().substring(3));
        appDesc.setName(bean.getName());
        appDesc.setKindName(bean.getKindName().substring(2));
        appDesc.setTagName(UrlUtils.substring(bean.getTagName().substring(2), "APP"));
        appDesc.setAppStore(APP_STORE);
        appDesc.setSize(bean.getSize().substring(3));
        appDesc.setPackageName(bean.getPackageName());
        // 这个地方没有插入下载的url，主要是因为url太长，对存储有影响，收益不大
        appDesc.setUrl(bean.getRequest().getUrl());
        return appDesc;
    }
}
