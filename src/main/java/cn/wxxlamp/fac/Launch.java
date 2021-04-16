package cn.wxxlamp.fac;

import cn.wxxlamp.fac.model.TempRequestList;
import com.geccocrawler.gecco.GeccoEngine;

/**
 * @author wxxlamp
 * @date 2021/03/23~15:10
 */
public class Launch {
    public static void main(String[] args) {
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac")
                .interval(2000)
                .run();
        GeccoEngine.create()
                .classpath("cn.wxxlamp.fac")
                .interval(1000)
                .thread(8)
                .start(TempRequestList.REQUEST_LIST)
                .start();
    }
}
