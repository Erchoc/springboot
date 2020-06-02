# Scala+Spar大数据实战


### 项目概述

论统一元数据管理在大数据平台中的重要性(SparkSQL、Hive)

```
Java: SpringBoot、SpringDataJPA、Java
Scala: SprintBoot、SpaingDataJPA、Java、Scala

元数据管理:
  采集
  维护
  稽查
  分析

本项目实战:
  数据库管理:
    id: 库编号
    name: 库名称
    location: 库路径(S3/HDFS/OSS)
    默认库路径:/user/hive/warehouse
    创建库路径: /user/hive/warehouse/xxoo.db
  数据表管理:
    id: 表编号
    name: 表名称
    type: 内部表、外部表
    dbid: 所属数据库
    默认存储路径为db对应的location/tablename

搭建开发环境(联网):
  
1. Create New Project
2. Spring Initializr JDK11
3. Project MetaData
  Group: cn.tinytank
  Artifact: mmp
  Type: Maven Project
  Language: Java
  Packaging: Jar
  JavaVerson: 11
  Version: 0.0.1
  Name: mmp
  Description: Metedata Managerment Platform
  Package: cn.tinytank.mmp
4. Dependencies
  SpringBoot: 2.3.0
  Web => Spting Web
5. 项目名称和本地目录默认即可

创建项目后没自动下载依赖生成maven项目结构，重新打开项目并点击右下角 Add as Maven Project 即可。
Maven 下载依赖太慢，自动配置阿里云代理。删除 mvnw、mvnw.cmd、HELP.md，添加 README 作为项目描述。
团队项目中 IDEA 自动安装依赖容易导致冲突，但本地删除 iml 文件会导致 IDEA 无法识别 Maven 项目，请确保 .gitignore 忽略提交iml文件。
关闭前缀统一的包名子目录，右键左上角的 Project，将 Compact Middle Packages 并去掉 Flatten Packages 勾选即可。
为了让所有人使用统一的maven，使用 .mvn 和 mvnw 命令并确保该文件被提交到 git remote repository(mvn -N io.takari:maven:wrapper -Dmaven=3.6.3)
mvn install -e 报错无效的目标发行版，原因是我本机默认 Shell 使用JDK8，项目配置JDK11，执行别名 jdk11 切换 JAVA_PATH 后重新运行即可。
./mvnw 无法使用，一直卡死。// TODO 
```


### 项目需求

1. 敏捷开发模式下对半月发版和每月发版需明确需求数量不能过多，大范围需求改动可能涉及技术方案重构。
2. 
3.

### 需求分析和技术方案

1. 分析实现该需求需要哪些条件，数据来源和交互方式、更新策略、大数据量禁止使用Http接口调用等等。
2. 对于暂时无法实现的需求，可以让产品考虑是否使用伪数据或降低数据精确程度，甚至功能需求下期开发。
3.

### 环境搭建和功能开发

1. 复杂开发环境搭建耗时不超过1天
2. 功能开发技巧如降低时间复杂度、分批请求、分层明确、异步加速、缓存一致性等等
3.


### 单元测试和接口测试

1. 测试用例编写指标: 函数覆盖率90%, 分支覆盖率80%, 语句覆盖率70% 用例通过率100%
2. 接口功能测试通过, 批量接口应给出性能上限(每个任务一批200个参数，保证响应时间低于1s，支持并发请求50个任务)
3.


### 可扩展性和优化方向

1. 
2. 
3. 



