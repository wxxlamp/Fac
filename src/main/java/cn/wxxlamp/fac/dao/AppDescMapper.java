package cn.wxxlamp.fac.dao;

import cn.wxxlamp.fac.config.MybatisConfiguration;
import cn.wxxlamp.fac.model.AppDesc;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/30~17:44
 */
public class AppDescMapper {

    private static final ThreadLocal<AppDescDao> APP_DESC_DAO = new ThreadLocal<>();

    public static void mapper(AppDesc appDesc) {
        if (appDesc == null) {
            return;
        }
        if (APP_DESC_DAO.get() == null) {
            APP_DESC_DAO.set(MybatisConfiguration.getDao(AppDescDao.class));
        }
        AppDescDao appDescDao = APP_DESC_DAO.get();
        List<AppDesc> appDescList = appDescDao.selectAppDescByPackageName(appDesc.getPackageName());
        if (appDescList == null || appDescList.size() == 0) {
            appDescDao.insertAppDesc(appDesc);
        }
    }
}
