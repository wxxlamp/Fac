package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * @author wxxlamp
 * @date 2021/03/26~11:39
 */
class MiAppTest {

    public static void main(String[] args) {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac.model.bean")
                .interval(2000)
                .start();
    }
}