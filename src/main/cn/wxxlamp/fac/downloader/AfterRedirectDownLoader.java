package cn.wxxlamp.fac.downloader;

import cn.wxxlamp.fac.model.bean.MiApp;
import com.geccocrawler.gecco.annotation.GeccoClass;
import com.geccocrawler.gecco.downloader.AfterDownload;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.response.HttpResponse;

/**
 * 没有被加载到
 * @author wxxlamp
 * @date 2021/03/24~16:07
 */
@GeccoClass(MiApp.class)
public class AfterRedirectDownLoader implements AfterDownload {

    @Override
    public void process(HttpRequest request, HttpResponse response) {
//        if (response.getStatus() == 302) {
//            System.out.println(response.getContent());
//            response.setStatus(100);
//        }
//        System.out.println("after Down");
    }
}
