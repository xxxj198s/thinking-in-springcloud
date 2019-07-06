package com.lanhuigu.order;

import org.springframework.stereotype.Component;

/**
 * Order订单，服务降级接口
 *
 * @auther: yihonglei
 * @date: 2019-07-06 21:51
 */
@Component
public class OrderApiFallBack implements OrderApi {
    @Override
    public String queryOrdersByUserId() {
        return "触发服务降级接口";
    }
}