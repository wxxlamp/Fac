package cn.wxxlamp.fac.test;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @author wxxlamp
 * @date 2021/03/23~11:54
 */
public class HttpTest {
    @Test
    public void doGetTestOne() {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Get请求
        HttpGet httpGet = new HttpGet("https://android.myapp.com/category.htm?orgame=1&categoryId=114");
        httpGet.setHeader("cookie","Cookie: pgv_pvi=3449244672; pgv_pvid=4897029011; ts_uid=9731321956; JSESSIONID=aaalsQmpAzSv061xzaEHx; pgv_info=ssid=s6087609096; ts_last=android.myapp.com/category.htm; session_uuid=cc17bc5c-4a1b-4a31-b9cd-2aa783fce54a");
        httpGet.setHeader("Cache-Control","no-cache");
        httpGet.setHeader("Postman-Token","");
        httpGet.setHeader("Host","android.myapp.com");
        httpGet.setHeader("Accept","*/*");
        httpGet.setHeader("Accept-Encoding","gzip, deflate, br");
        httpGet.setHeader("Connection","keep-alive");
        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                for (Header allHeader : response.getAllHeaders()) {
                    System.out.println(allHeader);
                }
                int tmp;
                StringBuilder result = new StringBuilder();
                while((tmp = responseEntity.getContent().read()) != -1){
                    result.append((char) tmp);
                }
                System.out.println(result);
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
