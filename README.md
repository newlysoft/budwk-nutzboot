# BudWk 开源企业级Java Web开发框架

NutzBoot 版本(下文简称NB)

[![Gitee GVP](https://gitee.com/wizzer/NutzWk/badge/star.svg?theme=gvp)](https://gitee.com/wizzer/NutzWk)
[![GitHub release](https://img.shields.io/github/release/budwk/budwk-nutzboot.svg)](https://github.com/Wizzercn/NutzWk/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![PowerByNutz](https://img.shields.io/badge/PowerBy-Nutz-green.svg)](https://github.com/nutzam/nutz)

https://demo.budwk.com  V6演示地址

https://nutzwk.wizzer.cn  V5演示地址

https://budwk.com/donation  赞助者

# 前言

本框架自2012年开始用于商业项目，至今已服务于全国各地公司大大小小数千个项目，行业涉及政务、电商、物联网等，随着个人经验积累及从事行业的不同分别发布了1.x至6.x多个版本，您可以根据项目规模选择不同版本。本项目案例众多，省厅级项目、市级平台、大数据项目、电商平台、物联网平台等等。

我们有强大的后援 —— Nutz 社区支持  https://nutz.cn  及 Nutz 使用手册 https://nutzam.com/core/nutz_preface.html

### QQ交流群

*  1群: 68428921(已满)
*  2群: 24457628

# 版本说明

| 版本名称 | 版本特点 | 版本地址 | 运行方式 | 后端主要技术| 前端主要技术 | 浏览器兼容性 |
| ---------|---------| ----------| ----------| ----------|----------|----------|
| BudWk v6.x | 微服务分布式 + 前后端分离 |[v6.x](https://github.com/budwk/budwk-nutzboot/tree/v6.x)| jar,war | nutzboot + dubbo + zookeeper + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| BudWk v6.x-nacos | 微服务分布式 + 前后端分离 |[v6.x-nacos](https://github.com/budwk/budwk-nutzboot/tree/v6.x-nacos)| jar,war | nutzboot + dubbo + nacos + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| BudWk v6.x-mini | 微服务单应用 + 前后端分离 |[v6.x-mini](https://github.com/budwk/budwk-nutzboot/tree/v6.x-mini)| jar,war | nutzboot + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| NutzWk v5.x| 微服务分布式 + 前端混合模式 |[v5.x](https://github.com/Wizzercn/NutzWk/tree/v5.x)| jar,war | nutzboot + dubbo + shiro + beetl | vue + elementUI + jquery 或 jquery + bootstrap 两个版本 | Chrome,IE9+ |
| NutzWk v5.x-mini| 微服务单应用 + 前端混合模式 |[v5.x-mini](https://github.com/Wizzercn/NutzWk/tree/v5.x-mini)| jar,war | nutzboot + shiro + beetl | vue + elementUI + jquery | Chrome,IE9+ |
| NutzWk v4.x| 模块化单应用 |[v4.x](https://github.com/Wizzercn/NutzWk/tree/v4.x)| war | nutz + shiro + beetl | jquery + bootstrap | Chrome,IE7 + |
| NutzWk v3.x| 单应用 |[v3.x](https://github.com/Wizzercn/NutzWk/tree/v3.x)| war | nutz + shiro + beetl 或 velocity 两个版本 | jquery + bootstrap | Chrome,IE7 + |
| NutzWk v1.x| 单应用 |[v1.x](https://github.com/Wizzercn/NutzWk/tree/v1.x)| war | nutz + shiro + velocity | jquery + easyUI | IE6 + |

# 本版说明(BudWk v6.x)

## 运行环境

*   JDK 8 181 + 或 OpenJDK 11 +
*   Redis 4.0.8 +
*   MySql 5.7 + 或 MariaDB、Oracle、SqlServer、达梦等
*   Nacos 1.3.0 +

## 开发工具
*   IntelliJ IDEA
*   Visual Studio Code
*   Node 12.13.0 +
*   Maven 3.5.3 +
*   Git

## 目录结构
| 模块名称                                     | 介绍                                     |
| ---------------------------------------- | ---------------------------------------- |
|[wk-code-generator](wk-code-generator) |代码生成器|
|[wk-common](wk-common) |框架公共模块,工具类,枚举类,常量类等|
|[wk-module](wk-module) |POJO类,接口类|
|[wk-nb-service-sys](wk-nb-service-sys) |系统管理模块,dubbo服务端,组织架构/权限管理等|
|[wk-nb-service-cms](wk-nb-service-cms) |CMS管理模块,dubbo服务端,ig主键生成器及wkcache方法缓存演示|
|[wk-nb-service-wx](wk-nb-service-wx) |微信管理模块,dubbo服务端,微信及微信支付功能演示|
|[wk-nb-service-slog](wk-nb-service-slog) |SLog日志服务,dubbo服务端|
|[wk-nb-task](wk-nb-task) |定时任务模块,dubbo服务端,支持基于数据库的集群|
|[wk-nb-web-admin](wk-nb-web-admin) |WEB管理后台API服务,dubbo消费端,Mvc Http API|
|[wk-nb-web-api-daemon](wk-nb-api-daemon) |应用管理服务守护API,dubbo消费端,Mvc Http API|
|[wk-nb-web-api-open](wk-nb-api-open) |API Sign/JWT Token示例,dubbo消费端,Mvc Http API|

## 技术选型
### 后端技术
技术 | 名称 | 官网
----|------|----
Nutz | JavaEE应用程序框架  | [https://nutzam.com](https://nutzam.com)
NutzBoot | 微服务开发框架  | [https://github.com/nutzam/nutzboot](https://github.com/nutzam/nutzboot)
Apache Shiro | 安全框架  | [https://shiro.apache.org](https://shiro.apache.org)
Druid | 数据库连接池  | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
Nacos | 注册中心和配置中心  | [https://nacos.io/](https://nacos.io/)
Dubbo | 分布式服务框架  | [https://dubbo.apache.org](https://dubbo.apache.org)
Redis | 分布式缓存数据库  | [https://redis.io](https://redis.io)
Quartz | 作业调度框架  | [https://www.quartz-scheduler.org](https://www.quartz-scheduler.org)
Ehcache | 进程内缓存框架  | [https://www.ehcache.org](https://www.ehcache.org)
Maven | 项目构建管理  | [https://maven.apache.org](https://maven.apache.org)

### 前端技术
技术 | 名称 | 官网
----|------|----
Vue.js | MVVM框架 | [https://vuejs.org](https://vuejs.org)
Nuxt.js | Vue通用应用框架 | [https://nuxtjs.org](https://nuxtjs.org)
Element | 基于Vue的UI框架 | [https://element.eleme.io](https://element.eleme.io)
Font-awesome | 字体图标  | [https://fontawesome.com](https://fontawesome.com)

## 后端开发指南
*   确保 MySql、Redis、Zookeeper 默认端口配置并已启动好
*   MySql 创建名为 `budwk_v6` 的空数据库,在每个微服务模块启动时会自动建表,同时初始化数据
*   项目根目录执行 `mvn clean install -Dmaven.test.skip=true`
*   在单个NB模块下执行 `mvn compile nutzboot:run` 运行或 `mvn package nutzboot:shade` 生成可执行jar包
*   在项目根目录执行 `mvn -Dmaven.javadoc.skip=true -Dmaven.test.skip=true -Dnutzboot.dst=E:/dst clean package nutzboot:shade` 可将所有可运行jar包生成到指定位置
*   启动顺序是 sys --> slog --> cms[可选] --> wx[可选] --> task[可选] --> web-admin --> wk-vue-admin[前端]
*   正常启动后访问 `http://127.0.0.1:9527` 用户名 superadmin 密码 1
*   若觉得项目复杂上手较难,可以从最简单的一个NB项目学起 [wizzer.cn 源码](https://github.com/Wizzercn/Demo/tree/master/nutzboot-wizzer-cn)

## 前端开发指南
*  `nuxt + vue + elementUI` 源码暂未发布

## API文档
*   基于 Swagger 2.1.1 (OpenAPI v3)
*   web-admin 项目启动时会自动生成API文档
*   访问文档 http://127.0.0.1:9527/swagger 
*   导出文档 http://127.0.0.1:9527/swagger/swagger.json 或 http://127.0.0.1:9527/swagger/swagger.yaml
*   方法上必须加 `@GET @POST @PUT @DELETE` 注解和 `@Operation` 才会被扫描
*   路径参数/查询参数(非表单参数)定义时 `requestBody = @RequestBody(content = @Content())` 不可缺少,否则 swagger 输出的格式不正确,可能是其bug
*   POST表单参数,使用 `@ApiFormParams` 来定义,同时支持单个字段定义和类对象映射
*   原路径参数中的 `?` 请使用 `{变量名}` 代替，如 原 `@At("/test/?")` 改为 `@At("/test/{id}")`

## 项目部署

*   内置配置文件启动  `nohup java -jar wk-nb-service-sys.jar &` 带参数 `-Dnutz.profiles.active=prod` 可加载 application-prod.properties 文件
*   外置配置文件启动  `nohup java -Dnutz.boot.configure.properties.dir=/data/nutzwk/sys/ -jar wk-nb-service-sys.jar &` 此时加载文件夹所有 *.properties 配置文件
*   生产环境可以使用 [budwk-daemon-python](https://github.com/budwk/budwk-daemon-python) 进行部署,登陆后台运维中心可在线更新jar包及配置文件等

# 鸣谢

*   [@wendal](https://github.com/wendal)
*   [@rekoe](https://github.com/Rekoe)
*   [@enilu](https://github.com/enilu)
*   [@loyalove](https://github.com/loyalove)
*   [@threefish](https://github.com/threefish)

# 关于

*   提供付费的培训服务，含源码解析、设计思路、疑难解答、项目辅导等
*   联系方式 QQ：11624317  微信：wizzer
*   欢迎打赏，以资鼓励 [https://budwk.com/donation](https://budwk.com/donation)
