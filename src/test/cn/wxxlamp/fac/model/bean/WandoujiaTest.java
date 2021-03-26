package cn.wxxlamp.fac.model.bean;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * @author wxxlamp
 * @date 2021/03/24~17:50
 */
class WandoujiaTest {

    public static void main(String[] args) {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac.model.bean")
                .interval(2000)
                .start("https://www.wandoujia.com/wdjweb/api/category/more?catId=5023&subCatId=0&page=1&ctoken=xGipLhPfFmewPBkMfZZEV_V8")
                .start();
    }
}