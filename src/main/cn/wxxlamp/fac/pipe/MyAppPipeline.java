package cn.wxxlamp.fac.pipe;

import cn.wxxlamp.fac.model.FadFactory;
import cn.wxxlamp.fac.model.FinancialAppDesc;
import cn.wxxlamp.fac.model.bean.MyApp;
import cn.wxxlamp.fac.util.IoUtils;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/23~14:57
 */
@PipelineName("myAppPipeline")
public class MyAppPipeline implements Pipeline<MyApp> {

    public static final String KEY = "MyApp";

    @Override
    public void process(MyApp bean) {
        List<FinancialAppDesc> list = FadFactory.getMap(KEY);
        if (bean.getApkName().size() == bean.getName().size()) {
            if (bean.getSize().size() == bean.getName().size()) {
                int size = bean.getSize().size();
                for (int i = 0; i < size; i++) {
                    FinancialAppDesc fad =  new FinancialAppDesc();
                    String apkName = bean.getApkName().get(i);
                    fad.setApkName(this.subString(apkName));
                    fad.setAppName(bean.getName().get(i));
                    fad.setSize(String.valueOf(bean.getSize().get(i)));
                    list.add(fad);
                }
            }
        }
        IoUtils.writeFile(KEY, FadFactory.getMap(KEY), false);
    }

    private String subString(String origin) {
        StringBuilder sb = new StringBuilder();
        for (int i = origin.indexOf("fsname=") + 7; i < origin.length(); i++) {
            if ("&amp;csr=".equals(origin.substring(i, i + 9)) ||
                    "&csr=".equals(origin.substring(i, i + 5))) {
                break;
            }
            sb.append(origin.charAt(i));
        }
        return sb.toString();
    }
}
