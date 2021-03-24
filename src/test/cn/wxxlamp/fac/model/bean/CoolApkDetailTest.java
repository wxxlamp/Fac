package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.GeccoEngine;
import org.junit.Test;

/**
 * @author wxxlamp
 * @date 2021/03/24~14:44
 */
public class CoolApkDetailTest {

    @Test
    public void test() {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac.model.bean")
                .interval(2000)
                .start("https://www.coolapk.com/apk/finance")
                .start();
    }

    public static void main(String[] args) {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac.model.bean")
                .interval(2000)
                .start("https://www.coolapk.com/apk/finance/?p=1")
                .start();
    }

}