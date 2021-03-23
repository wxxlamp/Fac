package cn.wxxlamp.fac.model;

/**
 * @author wxxlamp
 * @date 2021/03/23~19:30
 */
public class FinancialAppDesc {

    String appName;

    String apkName;

    String size;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FinancialAppDesc{" +
                "appName='" + appName + '\'' +
                ", apkName='" + apkName + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
