package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * 应用宝
 * @author wxxlamp
 * @date 2021/03/23~14:42
 */
@Gecco(matchUrl="https://android.myapp.com/category.htm?orgame=1&categoryId=114", pipelines={"myAppPipeline"})
public class MyAppHtml implements HtmlBean, MyApp {

    private static final long serialVersionUID = 665662335318691818L;

    /**
     * appName
     */
    @HtmlField(cssPath = "body > div.category-wrapper.clearfix > div.main > ul > li > div > div > a.name.ofh")
    private List<String> name;

    /**
     * apkName
     */
    @HtmlField(cssPath = "body > div.category-wrapper.clearfix > div.main > ul > li > div > div")
    private List<String> apkName;

    /**
     * 安装包大小
     */
    @HtmlField(cssPath = "div > div > span.size")
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
