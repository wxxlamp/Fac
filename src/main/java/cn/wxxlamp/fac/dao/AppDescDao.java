package cn.wxxlamp.fac.dao;

import cn.wxxlamp.fac.model.AppDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wxxlamp
 * @date 2021/03/29~19:11
 */
public interface AppDescDao {

    /**
     * 通过appId和appStore获得该数据
     * @param appId appId
     * @param appStore appStore
     * @return {@link AppDesc}
     */
    AppDesc selectAppDescByAppIdAndAppStore(@Param("appId") String appId, @Param("appStore") String appStore);

    /**
     * 查找不同的tag_name
     * @return 集合
     */
    List<String> selectDistinctTagNameFromAppDesc();

    List<String> selectDistinctNameFromAppDesc();

    List<String> selectDistinctPackageNameFromAppDesc();

    List<AppDesc> selectAppDescByPackageName(@Param("packageName") String packageName);

    /**
     * 通过id更新
     * @param appDesc appDesc
     */
    void updateAppDescById(AppDesc appDesc);

    /**
     * 自增
     * 插入AppDescription
     * @param appDesc appDesc
     */
    void insertAppDesc(AppDesc appDesc);
}
