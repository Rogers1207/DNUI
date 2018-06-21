package com.neusoft.core;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class DnuiCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnuiCoreApplication.class, args);
    }
}
