package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * @author wxxlamp
 * @date 2021/03/26~10:48
 */
public class MyAppTest {

    public static void main(String[] args) {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac.model.bean")
                .interval(2000)
                .start("https://android.myapp.com/category.htm?orgame=1&categoryId=114")
                .start("https://android.myapp.com/cate/appList.htm?orgame=1&categoryId=114&pageSize=25&pageContext=62")
                .start();
    }

}
