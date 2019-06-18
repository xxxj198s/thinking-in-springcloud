package com.lanhuigu.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController这个注解等价于spring mvc用法中的@Controller+@ResponseBody
 *
 * @auther: yihonglei
 * @date: 2019-06-17 22:30
 */
@RestController
public class HelloController {
    private final Logger logger= Logger.getLogger(getClass());

    // 客户端服务发现，接口
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello() {
        List<ServiceInstance> list = discoveryClient.getInstances("hello-service");
        list.forEach(instance -> {
            logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        });

        return "Hello World";
    }
}
