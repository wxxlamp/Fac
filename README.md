# Fac
> Financial app crawler

基于[Gecco](https://github.com/xtuhcy/gecco) 开发的一款针对于市面上各大应用商店的金融类APP爬取程序

### 爬取应用商店
1. [豌豆荚](https://www.wandoujia.com/category/5023)
2. [应用宝](https://android.myapp.com/myapp/search.htm?kw=%E9%87%91%E8%9E%8D)
3. [酷安](https://www.coolapk.com/apk/finance)

### 关于Gecco的若干问题
可能是我对该框架的使用不到位
1. 在请求前应该加上前置处理 _ downloader可以满足
2. pipeline之后缺少一次聚合处理

### GG
领导修改了需求，目前要做的是修改爬取所有应用