package cn.wxxlamp.fac.model;

/**
 * POJO，用于持久化
 * @author wxxlamp
 * @date 2021/03/29~11:34
 */
public class AppDesc {

    /**
     * 数据库Id
     */
    private Integer id;

    /**
     * 实用市场内的id
     * need
     */
    private String appId;

    /**
     * 名字
     * need
     */
    private String name;

    /**
     * 大分类
     * 如果没有，则和小分类相同
     */
    private String kindName;

    /**
     * 小分类
     * need
     */
    private String tagName;

    /**
     * 大小
     */
    private String size;

    /**
     * 包名
     * need
     */
    private String packageName;

    /**
     * 版本号
     */
    private String version;

    /**
     * 下载地址
     * need
     */
    private String url;

    /**
     * 应用市场
     */
    private String appStore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String  getAppId() {
        return appId;
    }

    public void setAppId(String  appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    @Override
    public String toString() {
        return "AppDesc{" +
                "id=" + id +
                ", appId=" + appId +
                ", name='" + name + '\'' +
                ", kindName='" + kindName + '\'' +
                ", tagName='" + tagName + '\'' +
                ", size='" + size + '\'' +
                ", packageName='" + packageName + '\'' +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", appStore='" + appStore + '\'' +
                '}';
    }

    /**
     * appId和appStore一定相同，所以不用equals
     * @param obj 被比较对象，一定是AppDesc
     * @return true/false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppDesc) {
            AppDesc another = (AppDesc) obj;
            return another.getVersion().equals(this.getVersion())
                    && another.getPackageName().equals(this.getPackageName())
                    && another.getSize().equals(this.getSize())
                    && another.getTagName().equals(this.getTagName())
                    && (another.getUrl() == null || "HUAWEI".equals(another.getAppStore()) || another.getUrl().equals(this.getUrl()))
                    && (another.getKindName() == null || another.getKindName().equals(this.getKindName()))
                    && another.getName().equals(this.getName());
        }
        return false;
    }
}
