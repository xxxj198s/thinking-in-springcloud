package com.lanhuigu.ribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: yihonglei
 * @date: 2019-06-20 15:52
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello() {

        return "hello，world!";
    }
}
