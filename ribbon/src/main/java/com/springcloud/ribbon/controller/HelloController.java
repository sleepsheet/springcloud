package com.springcloud.ribbon.controller;

import com.springcloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyh at 2018/08/06 下午 4:19
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hello(@RequestParam(value = "name") String name){
        return helloService.getHelloService(name);
    }
}
