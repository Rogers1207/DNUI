##Eureka的高可用

为了满足在某个服务器宕机的情况下，服务任然可以正常运行，所以需要配置高可用。（本项目
没有使用高可用,生产环境可能需要部署，开发环境没必要）。



#####配置Eureka高可用：

1. 开启三个dnui-eureka 服务，三个服务两两注册。

          A(port:8761): defaultZone: http://localhost:8762/eureka/,http://localhost:8763/eureka/
          B(port:8762): defaultZone: http://localhost:8763/eureka/,http://localhost:8761/eureka/
          C(port:8763): defaultZone: http://localhost:8761/eureka/,http://localhost:8762/eureka/
          
2. Client注册3个服务：

           defaultZone: http://localhost:8761/eureka/,
                        http://localhost:8762/eureka/,
                        http://localhost:8763/eureka/
