package com.lanhuigu.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @auther: yihonglei
 * @date: 2019-07-11 16:59
 */
@SpringBootApplication
@EnableTurbine
public class EurekaTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaTurbineApplication.class);
    }
}
