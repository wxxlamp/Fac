# Fac
> Financial app crawler

基于[Gecco](https://github.com/xtuhcy/gecco) 开发的一款针对于市面上各大应用商店的金融类APP爬取程序

### 爬取应用商店
1. [豌豆荚](https://www.wandoujia.com/category/5023): 目前有滑动码验证，不好弄
2. [应用宝](https://android.myapp.com/myapp/search.htm?kw=%E9%87%91%E8%9E%8D)
3. [酷安](https://www.coolapk.com/apk/finance)

### 关于Gecco的若干问题
可能是我对该框架的使用不到位
1. 在请求前应该加上前置处理
2. HtmlBean的形式在应用上作用不是太大，我还需要去转换它，Json格式更是和HTML不兼容
3. 报错信息一点都不友好，连堆栈都没给，我怎么排查异常