package com.lanhuigu.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 用户服务
 *
 * @auther: yihonglei
 * @date: 2019-06-21 15:32
 */
@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用订单服务，查询用户订单信息
     */
    @HystrixCommand(fallbackMethod = "queryOrderInfoFallback")
    public String queryOrderInfo() {
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity("http://EUREKA-PROVIDER-ORDER/order/queryOrderInfo", String.class);

        return responseEntity.getBody();
    }

    /**
     * 容错方法
     */
    public String queryOrderInfoFallback() {
        return "error-hystrix-test";
    }
}
