package cn.wxxlamp.fac;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * @author wxxlamp
 * @date 2021/04/14~16:13
 */
public class JsoupTest {

    @Test
    public void test() {
        String content = "<li data-pn=\"com.syezon.wifikey\" data-appid=\"7609125\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7609125\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2020/07/29/11/110_8a65466c35888b0a95257d5cf3d509e0_con_130x130.png\" alt=\"WiFi密码神器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7609125\" title=\"WiFi密码神器\" class=\"name\">WiFi密码神器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">1.4万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"12.42MB\">12.42MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">wifi钥匙密码</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.syezon.wifikey\">系统工具</a>\n" +
                "  <a data-app-id=\"7609125\" data-app-vid=\"600965119\" data-app-name=\"WiFi密码神器\" data-app-pname=\"com.syezon.wifikey\" data-app-vcode=\"69\" data-app-vname=\"1.6.9\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2020/07/29/11/110_8a65466c35888b0a95257d5cf3d509e0_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7609125\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.ruijie.wifim\" data-appid=\"7046415\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7046415\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/01/14/4/110_b2a592ca369449fbab14aa182cde0a9c_con_130x130.png\" alt=\"WiFi魔盒\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7046415\" title=\"WiFi魔盒\" class=\"name\">WiFi魔盒</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">1.3万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"18.63MB\">18.63MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">WiFi检测神器</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.ruijie.wifim\">系统工具</a>\n" +
                "  <a data-app-id=\"7046415\" data-app-vid=\"800960598\" data-app-name=\"WiFi魔盒\" data-app-pname=\"com.ruijie.wifim\" data-app-vcode=\"377\" data-app-vname=\"3.12.4\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/01/14/4/110_b2a592ca369449fbab14aa182cde0a9c_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7046415\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.jiesiwangluo.wifi\" data-appid=\"7063940\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7063940\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2020/02/22/4/106_dc8c170db63ea8691f009856a05f287b_con_130x130.png\" alt=\"wifi密码查看大师\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7063940\" title=\"wifi密码查看大师\" class=\"name\">wifi密码查看大师</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">1.2万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"6.83MB\">6.83MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">查看wifi密码</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.jiesiwangluo.wifi\">系统工具</a>\n" +
                "  <a data-app-id=\"7063940\" data-app-vid=\"500571727\" data-app-name=\"wifi密码查看大师\" data-app-pname=\"com.jiesiwangluo.wifi\" data-app-vcode=\"71\" data-app-vname=\"7.1\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2020/02/22/4/106_dc8c170db63ea8691f009856a05f287b_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7063940\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.equipment\" data-appid=\"7936844\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7936844\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2019/09/20/7/110_c85ad41051a1558a42e92676b9fa7558_con_130x130.png\" alt=\"TenbayWiFi\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7936844\" title=\"TenbayWiFi\" class=\"name\">TenbayWiFi</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">1.2万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"19.97MB\">19.97MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">管理网络设备</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.equipment\">系统工具</a>\n" +
                "  <a data-app-id=\"7936844\" data-app-vid=\"500546222\" data-app-name=\"TenbayWiFi\" data-app-pname=\"com.equipment\" data-app-vcode=\"1\" data-app-vname=\"1.0.2\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2019/09/20/7/110_c85ad41051a1558a42e92676b9fa7558_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7936844\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.enqualcomm.kids.cyp\" data-appid=\"7446365\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7446365\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/01/06/7/122_8af4adbc6f2281f7b4141d4f344b890f_con_130x130.png\" alt=\"西瓜皮\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7446365\" title=\"西瓜皮\" class=\"name\">西瓜皮</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">1.2万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"131.57MB\">131.57MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">西瓜皮云平台儿童手表专用APP</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.enqualcomm.kids.cyp\">系统工具</a>\n" +
                "  <a data-app-id=\"7446365\" data-app-vid=\"601012507\" data-app-name=\"西瓜皮\" data-app-pname=\"com.enqualcomm.kids.cyp\" data-app-vcode=\"60402\" data-app-vname=\"6.4.2\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/01/06/7/122_8af4adbc6f2281f7b4141d4f344b890f_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7446365\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"cn.dooone.wifihelper_cn\" data-appid=\"6517382\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6517382\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2019/05/07/9/106_8c5f30f7205521c6e4c6aec5f0940e4c_con_130x130.png\" alt=\"wifi上网加速器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6517382\" title=\"wifi上网加速器\" class=\"name\">wifi上网加速器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">1.1万人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"4.87MB\">4.87MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">免费WiFi神器，手机上网更快哦！</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_cn.dooone.wifihelper_cn\">系统工具</a>\n" +
                "  <a data-app-id=\"6517382\" data-app-vid=\"700499949\" data-app-name=\"wifi上网加速器\" data-app-pname=\"cn.dooone.wifihelper_cn\" data-app-vcode=\"138\" data-app-vname=\"4.8.8\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2019/05/07/9/106_8c5f30f7205521c6e4c6aec5f0940e4c_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6517382\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.morega.wifiup\" data-appid=\"601039\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/601039\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/03/23/0/110_50ee49854f25b5772828ac3bd47a465c_con_130x130.png\" alt=\"WiFi信号增强放大器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/601039\" title=\"WiFi信号增强放大器\" class=\"name\">WiFi信号增强放大器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">9690人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"13.47MB\">13.47MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">免费WiFi神器，手机上网更快哦！</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.morega.wifiup\">系统工具</a>\n" +
                "  <a data-app-id=\"601039\" data-app-vid=\"800975295\" data-app-name=\"WiFi信号增强放大器\" data-app-pname=\"com.morega.wifiup\" data-app-vcode=\"1202103161\" data-app-vname=\"7.8.4\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/03/23/0/110_50ee49854f25b5772828ac3bd47a465c_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/601039\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"cn.lezhi.speedtest\" data-appid=\"7891649\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7891649\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/14/8/2_309c7def4b73b0565837362772bd12e2_con_130x130.png\" alt=\"网速管家\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7891649\" title=\"网速管家\" class=\"name\">网速管家</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">8280人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"33.94MB\">33.94MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">wifi测速5G</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_cn.lezhi.speedtest\">系统工具</a>\n" +
                "  <a data-app-id=\"7891649\" data-app-vid=\"200976684\" data-app-name=\"网速管家\" data-app-pname=\"cn.lezhi.speedtest\" data-app-vcode=\"91\" data-app-vname=\"6.4.1\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/14/8/2_309c7def4b73b0565837362772bd12e2_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7891649\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.link.browser.app\" data-appid=\"8055045\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/8055045\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/09/3/110_1e7454c99587fc05c9c50a8bf502c964_con_130x130.png\" alt=\"WiFi万能钥匙浏览器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/8055045\" title=\"WiFi万能钥匙浏览器\" class=\"name\">WiFi万能钥匙浏览器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">7830人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"9.13MB\">9.13MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">免流量上网神器</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.link.browser.app\">系统工具</a>\n" +
                "  <a data-app-id=\"8055045\" data-app-vid=\"601034328\" data-app-name=\"WiFi万能钥匙浏览器\" data-app-pname=\"com.link.browser.app\" data-app-vcode=\"2021033101\" data-app-vname=\"2.3.08\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/09/3/110_1e7454c99587fc05c9c50a8bf502c964_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/8055045\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.bigplatano.app\" data-appid=\"7876133\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7876133\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2020/02/05/0/110_722db638c38b350f69c4d21ce65832cd_con_130x130.png\" alt=\"大香蕉解锁\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7876133\" title=\"大香蕉解锁\" class=\"name\">大香蕉解锁</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">7530人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"24.13MB\">24.13MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">华人解除地域限制</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.bigplatano.app\">系统工具</a>\n" +
                "  <a data-app-id=\"7876133\" data-app-vid=\"600858563\" data-app-name=\"大香蕉解锁\" data-app-pname=\"com.bigplatano.app\" data-app-vcode=\"2\" data-app-vname=\"2019.09.27.1230\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2020/02/05/0/110_722db638c38b350f69c4d21ce65832cd_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7876133\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.jie.speed\" data-appid=\"7742779\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7742779\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/03/24/0/2_8c22126e1662569afdaff00685a72ee6_con_130x130.png\" alt=\"网络测速大师\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7742779\" title=\"网络测速大师\" class=\"name\">网络测速大师</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">6780人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"13.69MB\">13.69MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">专业网络测速工具</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.jie.speed\">系统工具</a>\n" +
                "  <a data-app-id=\"7742779\" data-app-vid=\"400989145\" data-app-name=\"网络测速大师\" data-app-pname=\"com.jie.speed\" data-app-vcode=\"98\" data-app-vname=\"3.8.8\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/03/24/0/2_8c22126e1662569afdaff00685a72ee6_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7742779\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.asus.aihome\" data-appid=\"6862573\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6862573\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/02/20/10/110_1f3593e4938c9aecfac4bef551d7a25f_con_130x130.png\" alt=\"华硕路由器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6862573\" title=\"华硕路由器\" class=\"name\">华硕路由器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">6570人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"84.57MB\">84.57MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">管理家庭网络应用</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.asus.aihome\">系统工具</a>\n" +
                "  <a data-app-id=\"6862573\" data-app-vid=\"601023337\" data-app-name=\"华硕路由器\" data-app-pname=\"com.asus.aihome\" data-app-vcode=\"280\" data-app-vname=\"2.0.0.6.16\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/02/20/10/110_1f3593e4938c9aecfac4bef551d7a25f_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6862573\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.redteamobile.domestic.redteago\" data-appid=\"8098140\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/8098140\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/02/09/3/110_8a53b36c13f0426a9d26f3ab9911937e_con_130x130.png\" alt=\"多多流量宝\" class=\"icon lazy\" width=\"68\" height=\"68\"/>\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/8098140\" title=\"多多流量宝\" class=\"name\">多多流量宝</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">6135人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"34.54MB\">34.54MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">比WIFI还靠谱</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.redteamobile.domestic.redteago\">系统工具</a>\n" +
                "  <a data-app-id=\"8098140\" data-app-vid=\"500668549\" data-app-name=\"多多流量宝\" data-app-pname=\"com.redteamobile.domestic.redteago\" data-app-vcode=\"260\" data-app-vname=\"3.6.0\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/02/09/3/110_8a53b36c13f0426a9d26f3ab9911937e_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/8098140\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.appfactory.wifimanager\" data-appid=\"7846800\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7846800\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/12/0/123_4bf5cf11e15924362d8287de81214b00_con_130x130.png\" alt=\"WIFI密码查看器\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7846800\" title=\"WIFI密码查看器\" class=\"name\">WIFI密码查看器</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">5475人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"14MB\">14MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">查看WIFI密码</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.appfactory.wifimanager\">系统工具</a>\n" +
                "  <a data-app-id=\"7846800\" data-app-vid=\"100656918\" data-app-name=\"WIFI密码查看器\" data-app-pname=\"com.appfactory.wifimanager\" data-app-vcode=\"34\" data-app-vname=\"3.4.0\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/12/0/123_4bf5cf11e15924362d8287de81214b00_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7846800\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.youxin.servicehall\" data-appid=\"6697076\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6697076\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/02/20/3/2_8e25c404ffaa0c40406c308cb6c1ff66_con_130x130.png\" alt=\"优信无限\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6697076\" title=\"优信无限\" class=\"name\">优信无限</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">5355人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"16.26MB\">16.26MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">工厂应用</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.youxin.servicehall\">系统工具</a>\n" +
                "  <a data-app-id=\"6697076\" data-app-vid=\"500290816\" data-app-name=\"优信无限\" data-app-pname=\"com.youxin.servicehall\" data-app-vcode=\"241\" data-app-vname=\"3.0.0\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/02/20/3/2_8e25c404ffaa0c40406c308cb6c1ff66_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6697076\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.yunlian.meditationmode\" data-appid=\"8064482\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/8064482\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/14/5/2_87edc3d8dfe1641ade4029cee17aae08_con_130x130.png\" alt=\"禅定空间\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/8064482\" title=\"禅定空间\" class=\"name\">禅定空间</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">5070人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"5.98MB\">5.98MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">专注学习自律养成</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.yunlian.meditationmode\">系统工具</a>\n" +
                "  <a data-app-id=\"8064482\" data-app-vid=\"300672145\" data-app-name=\"禅定空间\" data-app-pname=\"com.yunlian.meditationmode\" data-app-vcode=\"20210414\" data-app-vname=\"2.6.1\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/14/5/2_87edc3d8dfe1641ade4029cee17aae08_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/8064482\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.akazam.android.wlandialer\" data-appid=\"355267\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/355267\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2016/09/20/1/102_511b1bae82a97c479de05021496f425f_con_130x130.png\" alt=\"天翼WiFi\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/355267\" title=\"天翼WiFi\" class=\"name\">天翼WiFi</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">4545人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"8.64MB\">8.64MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">为用户提供WiFi热点接入的免费应用</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.akazam.android.wlandialer\">系统工具</a>\n" +
                "  <a data-app-id=\"355267\" data-app-vid=\"400727880\" data-app-name=\"天翼WiFi\" data-app-pname=\"com.akazam.android.wlandialer\" data-app-vcode=\"97\" data-app-vname=\"4.2.7\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2016/09/20/1/102_511b1bae82a97c479de05021496f425f_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/355267\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.shufeng.podstool\" data-appid=\"8066422\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/8066422\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/13/9/110_9ee3d089affce4975936e596ed3ce1d9_con_130x130.png\" alt=\"PodsTool\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/8066422\" title=\"PodsTool\" class=\"name\">PodsTool</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">4410人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"8.52MB\">8.52MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">AirPods</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.shufeng.podstool\">系统工具</a>\n" +
                "  <a data-app-id=\"8066422\" data-app-vid=\"700648839\" data-app-name=\"PodsTool\" data-app-pname=\"com.shufeng.podstool\" data-app-vcode=\"50\" data-app-vname=\"2.17.3\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/13/9/110_9ee3d089affce4975936e596ed3ce1d9_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/8066422\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.qilesoft.speedtestnet\" data-appid=\"6742881\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6742881\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/13/4/110_ae59fbd2d5807adcaf94adbf87c5ba1b_con_130x130.png\" alt=\"家庭宽带测速\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6742881\" title=\"家庭宽带测速\" class=\"name\">家庭宽带测速</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">3705人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"11.74MB\">11.74MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">随时掌握宽带速度</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.qilesoft.speedtestnet\">系统工具</a>\n" +
                "  <a data-app-id=\"6742881\" data-app-vid=\"200976235\" data-app-name=\"家庭宽带测速\" data-app-pname=\"com.qilesoft.speedtestnet\" data-app-vcode=\"49\" data-app-vname=\"4.9\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/13/4/110_ae59fbd2d5807adcaf94adbf87c5ba1b_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6742881\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.linksure.wifimaster\" data-appid=\"7472257\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7472257\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/04/09/6/110_52d500c1f369227eed671f6450da80d1_con_130x130.png\" alt=\"WiFi万能钥匙主人版\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7472257\" title=\"WiFi万能钥匙主人版\" class=\"name\">WiFi万能钥匙主人版</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">3510人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"5.18MB\">5.18MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">管理门店和热点</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.linksure.wifimaster\">系统工具</a>\n" +
                "  <a data-app-id=\"7472257\" data-app-vid=\"200975699\" data-app-name=\"WiFi万能钥匙主人版\" data-app-pname=\"com.linksure.wifimaster\" data-app-vcode=\"210214\" data-app-vname=\"2.6.12\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/04/09/6/110_52d500c1f369227eed671f6450da80d1_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7472257\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.qi.earthnutproxy\" data-appid=\"8006510\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/8006510\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/03/25/11/110_08eb656f8f42be895a15be3b370139ab_con_130x130.png\" alt=\"花生代理\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/8006510\" title=\"花生代理\" class=\"name\">花生代理</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <span class=\"install-count\">3300人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"9.23MB\">9.23MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">一键更换ip工具</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.qi.earthnutproxy\">系统工具</a>\n" +
                "  <a data-app-id=\"8006510\" data-app-vid=\"700645918\" data-app-name=\"花生代理\" data-app-pname=\"com.qi.earthnutproxy\" data-app-vcode=\"1514\" data-app-vname=\"1.5.1.4\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/03/25/11/110_08eb656f8f42be895a15be3b370139ab_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/8006510\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"me.hekr.lanshe\" data-appid=\"7892936\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/7892936\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2020/12/08/8/110_792e9a96c49450f4ea18d14e3310d50d_con_130x130.png\" alt=\"兰舍\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/7892936\" title=\"兰舍\" class=\"name\">兰舍</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">3060人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"43.31MB\">43.31MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">为您提供健康空气</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_me.hekr.lanshe\">系统工具</a>\n" +
                "  <a data-app-id=\"7892936\" data-app-vid=\"100635322\" data-app-name=\"兰舍\" data-app-pname=\"me.hekr.lanshe\" data-app-vcode=\"4\" data-app-vname=\"1.3\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2020/12/08/8/110_792e9a96c49450f4ea18d14e3310d50d_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/7892936\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.morega.wifipassword\" data-appid=\"6622987\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6622987\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/03/04/5/110_83dde5df8e4d3479cab494bf98c105ec_con_130x130.png\" alt=\"WiFi密码助手\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6622987\" title=\"WiFi密码助手\" class=\"name\">WiFi密码助手</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">2700人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"14.3MB\">14.3MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">WIFI密码管家</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.morega.wifipassword\">系统工具</a>\n" +
                "  <a data-app-id=\"6622987\" data-app-vid=\"400983607\" data-app-name=\"WiFi密码助手\" data-app-pname=\"com.morega.wifipassword\" data-app-vcode=\"20210303\" data-app-vname=\"5.0.0\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/03/04/5/110_83dde5df8e4d3479cab494bf98c105ec_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6622987\">查看</a>\n" +
                "</li>\n" +
                "<li data-pn=\"com.cisco.connect.cloud\" data-appid=\"6522421\" class=\"card\" data-suffix=\"\">\n" +
                "  <div class=\"icon-wrap\">\n" +
                "    <a href=\"https://www.wandoujia.com/apps/6522421\">\n" +
                "      <img src=\"//img.ucdl.pp.uc.cn/upload_files/wdj_web/public/img/grey-128x128.png\" data-original=\"https://android-artworks.25pp.com/fs08/2021/01/07/3/110_a27856d9e2b9f53b35fa50ee59f0ba5b_con_130x130.png\" alt=\"Linksys\" class=\"icon lazy\" width=\"68\" height=\"68\">\n" +
                "    </a>\n" +
                "  </div>\n" +
                "  <div class=\"app-desc\">\n" +
                "    <h2 class=\"app-title-h2\">\n" +
                "      <a href=\"https://www.wandoujia.com/apps/6522421\" title=\"Linksys\" class=\"name\">Linksys</a>\n" +
                "    </h2>\n" +
                "    <div class=\"meta\">\n" +
                "      <a rel=\"nofollow\" class=\"tag gooddev\" href=\"https://www.wandoujia.com/manual_testing?from=www\" target=\"_blank\" title=\"编辑亲测基本可用，无明显恶意行为。\">\n" +
                "      </a>\n" +
                "      <span class=\"install-count\">2655人安装</span>\n" +
                "      <span class=\"dot\">・</span>\n" +
                "      <span title=\"39.18MB\">39.18MB</span>\n" +
                "    </div>\n" +
                "    <div class=\"comment\">管理设置路由器</div>\n" +
                "  </div>\n" +
                "  <a class=\"tag-link\" href=\"https://www.wandoujia.com/category/5018?pos=w/cardtag/appcategory_com.cisco.connect.cloud\">系统工具</a>\n" +
                "  <a data-app-id=\"6522421\" data-app-vid=\"601012677\" data-app-name=\"Linksys\" data-app-pname=\"com.cisco.connect.cloud\" data-app-vcode=\"2105892\" data-app-vname=\"2.14.0\" data-app-categoryid=\"5018\" data-app-subcategoryid=\"\" data-app-icon=\"https://android-artworks.25pp.com/fs08/2021/01/07/3/110_a27856d9e2b9f53b35fa50ee59f0ba5b_con_130x130.png\" data-app-rtype=\"0\" class=\"detail-check-btn\" href=\"https://www.wandoujia.com/apps/6522421\">查看</a>\n" +
                "</li>";
        Document document = Jsoup.parse(content);
        Elements elements =
                document.getElementsByClass("card");
//        document.getElementsByAttribute("li");
        for (Element element : elements) {
            System.out.println(element.attr("data-pn"));
            Elements a = element.select("a[class='name']");
            a.text();
            a.attr("href");
            element.select("span").get(2).text();
            element.select("a[class='tag-link']").text();
            System.out.println(element.select("a[class='detail-check-btn']").attr("data-app-vname"));
        }
    }
}
