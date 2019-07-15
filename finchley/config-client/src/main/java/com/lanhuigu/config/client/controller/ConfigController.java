package com.lanhuigu.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 从配置中心获取配置。
 * config-client-->config-server-->git
 *
 * @author yihonglei
 * @date 2019-07-15 17:58
 */
@RestController
public class ConfigController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private Integer serverPort;

    @RequestMapping("/getConfigRemote")
    public Map<String, Object> getConfig4Remote() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("applicationName", applicationName);
        retMap.put("port", serverPort);
        return retMap;
    }
}
