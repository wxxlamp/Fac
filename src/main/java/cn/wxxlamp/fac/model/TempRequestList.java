package cn.wxxlamp.fac.model;

import com.geccocrawler.gecco.request.HttpRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/04/15~10:39
 */
public interface TempRequestList {
    List<HttpRequest> REQUEST_LIST = new ArrayList<>(64);
}
