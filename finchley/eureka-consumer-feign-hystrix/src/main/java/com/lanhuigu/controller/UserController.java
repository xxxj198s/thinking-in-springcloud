package com.lanhuigu.controller;

import com.lanhuigu.order.OrderApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController这个注解等价于spring mvc用法中的@Controller+@ResponseBody
 *
 * @auther: yihonglei
 * @date: 2019-06-17 22:30
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private OrderApi orderApi;

    @RequestMapping(value = "/queryUserInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public String queryUserInfo() {
        String orderInfo = orderApi.queryOrdersByUserId();

        return orderInfo;
    }
}