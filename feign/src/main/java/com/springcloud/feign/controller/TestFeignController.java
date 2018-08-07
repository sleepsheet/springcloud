package com.springcloud.feign.controller;

import com.springcloud.feign.service.RemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyh at 2018/08/07 上午 10:27
 */
@RestController
public class TestFeignController {

    private RemoteService remoteService;

    private TestFeignController(RemoteService remoteService){
        this.remoteService = remoteService;
    }

    @GetMapping(value = "/helllo")
    public String sayHello(@RequestParam(value = "name") String name){
        return remoteService.sayHifromEurekaClient(name);
    }
}
