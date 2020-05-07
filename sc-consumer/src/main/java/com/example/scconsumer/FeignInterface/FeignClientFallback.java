package com.example.scconsumer.FeignInterface;

import org.springframework.stereotype.Component;

/**
 * 请求服务失败处理
 */
@Component
public class FeignClientFallback implements FeignClients{
    @Override
    public String sayHello(String msg) {
        return "hystrix - fallback";
    }
}
