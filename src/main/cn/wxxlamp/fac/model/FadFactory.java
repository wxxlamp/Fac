package cn.wxxlamp.fac.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 其实没啥用了
 * @author wxxlamp
 * @date 2021/03/23~18:06
 */
public class FadFactory {

    private static Map<String, List<FinancialAppDesc>> map;

    private FadFactory(){}

    public static Map<String, List<FinancialAppDesc>> getMap() {
        if (map == null) {
            map = new HashMap<>(4);
        }
        return map;
    }

    public static List<FinancialAppDesc> getMap(String key) {
        if ((map = getMap()).get(key) == null) {
            map.put(key, new ArrayList<>(100));
        }
        return map.get(key);
    }



}
