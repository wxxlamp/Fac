package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.spider.JsonBean;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/23~19:32
 */
@Gecco(matchUrl="https://android.myapp.com/cate/appList.htm?orgame=1&categoryId=114&pageSize=25&pageContext=62", pipelines={"myAppPipeline"})
public class MyAppJson implements JsonBean, MyApp {

    private static final long serialVersionUID = -5696033709028657709L;

    /**
     * appName
     */
    @JSONPath("$.obj.appName")
    private List<String> name;

    /**
     * apkName
     */
    @JSONPath("$.obj.apkUrl")
    private List<String> apkName;

    /**
     * 安装包大小
     */
    @JSONPath("$.obj.fileSize")
    private List<String> size;

    @Override
    public List<String> getName() {
        return name;
    }

    @Override
    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public List<String> getSize() {
        return size;
    }

    @Override
    public void setSize(List<String> size) {
        this.size = size;
    }

    @Override
    public List<String> getApkName() {
        return apkName;
    }

    @Override
    public void setApkName(List<String> apkName) {
        this.apkName = apkName;
    }

    @Override
    public String toString() {
        return "MyApp{" +
                "name=" + name +
                ", apkName=" + apkName +
                ", size=" + size +
                '}';
    }

}
