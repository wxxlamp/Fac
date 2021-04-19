package cn.wxxlamp.fac.model.bean.yiqu;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 难以拿到包名，所以没爬
 * @author wxxlamp
 * @date 2021/04/15~15:43
 */
@Gecco(matchUrl = {"https://www.liqucn.com/rj/?page={page}", "https://www.liqucn.com/yx/?page={page}"}, pipelines = "yiquCategory")
public class Category implements HtmlBean {


}
