package com.example.scconsumer.controller;

import com.example.scconsumer.FeignInterface.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Fegin hystrix
 */
@RequestMapping(value = "consumer")
@RestController
public class FeginController {

    @Autowired
    private FeignClients feignClient;

    @GetMapping("/feign/{wd}")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String parm) {
        String result = feignClient.sayHello(parm);
        return Mono.just(result);
    }

}
