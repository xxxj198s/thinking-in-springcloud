package com.lanhuigu.controller;

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
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/queryOrderInfo", method = {RequestMethod.GET, RequestMethod.POST})
    public String queryOrderInfo() {

        return "order-8001";
    }
}
