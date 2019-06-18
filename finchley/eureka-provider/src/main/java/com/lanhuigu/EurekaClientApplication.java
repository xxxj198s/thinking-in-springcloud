package com.lanhuigu;

/**
 * @SpringBootApplication 启动一个Spring Boot应用程序
 * @EnableDiscoveryClient 服务发现与注册，当应用启动时，将应用注册到配置的注册中心
 *
 * @auther: yihonglei
 * @date: 2019-06-17 22:48
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
