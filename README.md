#基于SSM的Spring Boot Maven 聚合工程

#Introduce

项目使用Spring Boot 1.3.X.RELEASE

## Pojo

此模块用于存放实体类

## Dao

此模块用于存放数据访问层的实现,以供Service模块调用

数据源整合使用了Druid数据源

该模块使用了Mybatis3.3.X,并集成了Mybatis分页插件和通用Mapper插件

## Interface

此模块用于存放Service接口.

## Service

此模块用于存放Service的实现.

## Webapi

所有模块的启动类.

## Author

- Blog：http://sylvanassun.github.io/

- Email：sylvanassun_xtz@163.com

- QQ: 729238984