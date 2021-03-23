package cn.wxxlamp.fac.test;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * https://android.myapp.com/myapp/searchAjax.htm?kw=金融&pns=&sid=
 * @author wxxlamp
 * @date 2021/03/23~15:52
 */
public class JsonLauncher {
    @Test
    public void testPostJson() {
        // 创建Get请求
        HttpPost httpPost = new HttpPost("https://android.myapp.com/cate/appList.htm?orgame=1&categoryId=114&pageSize=20&pageContext=62");
//        httpPost.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
//        httpPost.setHeader("Cookie", "Cookie: session_uuid=b289c62b-f8f1-4a13-996e-e4449a5769e2; pgv_pvi=3449244672; pgv_pvid=4897029011; ts_uid=9731321956; JSESSIONID=aaalsQmpAzSv061xzaEHx; pgv_info=ssid=s6087609096; ts_last=android.myapp.com/myapp/search.htm");
//        httpPost.setHeader("Host","Host: android.myapp.com");
//        httpPost.setHeader("User-Agent","User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        httpPost.setHeader("Connection","keep-alive");
        // 响应模型
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(httpPost)) {
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                int tmp;
                StringBuilder result = new StringBuilder();
                while((tmp = responseEntity.getContent().read()) != -1){
                    result.append((char) tmp);
                }
                System.out.println(result);
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
