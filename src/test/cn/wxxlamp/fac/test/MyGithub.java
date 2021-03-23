package cn.wxxlamp.fac.test;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;

import java.util.List;

/**
 * @Auther: lianjc
 * @Date: 2018/11/19 0019 09:54
 * @Description:
 */
@Gecco(matchUrl = "https://blog.csdn.net/u013396133/article/details/84255590",pipelines = "consolePipeline")
public class MyGithub implements HtmlBean {

    @Request
    private HttpRequest request;

    @Text
    @HtmlField(cssPath = "#mainBox > main > div.blog-content-box > div > div > div.article-title-box > h1")
    private String title;

    @HtmlField(cssPath = "#content_views > p:nth-child(5)")
    private String content;

    @HtmlField(cssPath = "#mainBox > main > div.blog-content-box > article")
    private List<String> contents;


    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        GeccoEngine.create()
                //Gecco搜索的包路径
                .classpath("cn.wxxlamp.fac")
                //开始抓取的页面地址
                .start("https://blog.csdn.net/u013396133/article/details/84255590")
                //开启几个爬虫线程
                .thread(1)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(2000).start();
    }

}