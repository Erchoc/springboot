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

// TODO LIST
./mvnw 一直卡死无法使用。
maven 构建时报错 `NoPosition: javac: 无效的目标发行版: 11`。
POM文件 properties 为什么要添加编码? <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
Scala和Java混编该如何配置POM文件? 使用 scala-maven-plugin 让 maven 支持 scala 项目，使用 scala-library 支持scala语法和库，使用 maven-assembly-plugin 对混合工程进行打包。
打包失败，build 为什么要添加scala插件? 遇到3.2.1不行更新到4.4.0报错javac无效发行版但程序可以正常运行(将默认JDK版本改成JDK11)。

java源码和测试同级目录添加scala目录，并打开 Project Structure 设置该目录为 Sources 和 Tests。Scala和Java混编时，同一包名下类名不能相同，但方法名可以重复。
原接口调用 /svc/app/func 若要改成 /api/svc/app/func，只需配置 `context-path: /api` 即可。(SpringBoot2.x后该配置项位于server.servlet，原server下设置将失效)
mysql-connector > 6.0 时，需使用连接器 com.mysql.cj.jdbc.Driver。
对Data即Service层写单元测试，使用默认的springboot-starter-test @RunWith 注解无效，需手动加入junit依赖，不写版本使用了最新的4.13

@Autowired 和 @Transactional 注解作用，事务注解必须显示rollback问题
无法点击左侧开始运行方法级单元测试，
接口请求路径必须携带最后的/，如何解决？
Postman测试接口只能用form-data不能用row-json填写字段。
IDEA默认配置可能响应不太灵敏，其自动识别和推导时不时存在问题。

Scala实体定义为什么加 @BeanProperty？统一访问原则，用来自动处理getter和setter方法。
javax和spring分别的 @Transactional 事务注解有什么不同？java自己实现的事务主要是提供给EJB使用的，尽管两者都能实现事务控制，但更建议议使用SpringDataJPA的事务处理，千万不要两者混合使用。

TODO：列表接口返回长度，接口参数校验。不需要的字段别返回，引入异常处理。

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



