package com.example.scconsumer.FeignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fegin 接口
 *  name 请求的服务名称
 *  fallback 请求失败，进入断路器类
 *  configuration fegin配置
 */
@FeignClient(name = "sc-provider",fallback = FeignClientFallback.class,configuration = FeginConfigs.class)
public interface FeignClients {
    //被请求的微服务地址
    @RequestMapping(value = "/provider/{msg}")
    String sayHello(@PathVariable("msg") String msg);
}
