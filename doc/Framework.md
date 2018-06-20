#整体架构说明

本项目采用Spring Cloud和Spring Boot为基础的微服务应用，建议使用IDEA打开。

以DNUI为基础，其中包含多个Module，以Jar的方式引入，使应用模块化。

通过Spring Cloud Eureka Server来注册各种Client。Client包括：
      
      1. dnui-core:
            为前端提供所有的业务接口
      2. dnui-euraka：
            Eureka服务，作为服务注册中心，对整个微服务架构起着最核心的整合作用
      
      
本项目没有使用Eureka的高可用，具体配置参考 HA.md

