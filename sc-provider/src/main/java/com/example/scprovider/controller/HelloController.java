package com.example.scprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("provider")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Mono<String> sayHello(){
        System.out.println("come on hello" );
        return Mono.just("sc-provider receive : hello");
    }
}
