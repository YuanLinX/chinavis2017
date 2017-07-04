# ChinaVis2017 Challenge 1
伪基站时空特征 可视化分析系统
## 简介
>该系统是针对2017年中国可视化与可视分析大会的数据可视分析挑战赛的第一道题目而开发，
主要是从伪基站的时间和空间、垃圾短信的分类三个维度来综合分析，
揭示伪站的行为模式，协助有关部门打击伪基站。

> 线上预览: [地址](http://59.110.139.197:8080/chinavis/#!/ "伪基站时空特征")
## 技术栈
>前端 Gulp + Angularjs + Amap + Echarts

>后端 Maven + Struts2 + Hibernate
## 目录结构
    chinavis2017/
        ├── doc/
        ├── target/
        ├── src/
        │   ├── main/
        │   │   ├── java/
        │   │   │   ├── action/
        │   │   │   ├── model/
        │   │   │   └── tool/
        │   │   ├── resources/
        │   │   │   ├── hibernate.cfg.xml
        │   │   │   ├── hibernate.reveng.xml
        │   │   │   ├── log4j2.xml
        │   │   │   ├── struts.xml
        │   │   │   └── hbm/
        │   │   └── webapp/                             前端开发目录
        │   │       ├── dist/                           代码产出目录
        │   │       │   ├── WEB-INF/
        │   │       │   └── etc
        │   │       ├── src/                            开发目录
        │   │       │   ├── service/                    封装的service
        │   │       │   │    ├── base.xhr.js            接口
        │   │       │   │    └── color.constant.js      常量
        │   │       │   ├── lib/                        js库
        │   │       │   ├── image/                      图片
        │   │       │   ├── data/                       数据
        │   │       │   ├── Analysis/                   分析模块
        │   │       │   │    ├── analysis.html          对应静态页面
        │   │       │   │    ├── analysis.less          对应样式表
        │   │       │   │    ├── controller.js          对应controller
        │   │       │   │    ├── area.directive.js      对应directive
        │   │       │   ├── Situation/                  态势模块
        │   │       │   │    ├── situation.html         对应静态页面
        │   │       │   │    ├── situation.less         对应样式表
        │   │       │   │    └── controller.js          对应controller
        │   │       │   └── etc 
        │   │       ├── node_modules/                   自动生成，包含开发依赖
        │   │       ├── gulpfile.js                     gulp配置文件
        │   │       └── package.json
        │   └── test/
        └── etc
## 系统截图
![Preview_0](https://github.com/oceanstation/chinavis2017/blob/master/web/src/data/Preview_0.png)

![Preview_1](https://github.com/oceanstation/chinavis2017/blob/master/web/src/data/Preview_1.png)