package com.jpeony.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * config客户端，负责从config服务端获取内容
 *
 * @author yihonglei
 * @date: 2019-07-15 17:57
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}