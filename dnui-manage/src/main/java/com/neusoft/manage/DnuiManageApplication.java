package com.neusoft.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DnuiManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnuiManageApplication.class, args);
    }
}
