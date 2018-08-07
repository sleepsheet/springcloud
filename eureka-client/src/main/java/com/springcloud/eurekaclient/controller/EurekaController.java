package com.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyh at 2018/08/06 上午 11:55
 */
@RestController
public class EurekaController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello")
    public String helloMethod(@RequestParam(value = "name") String name){
        return "Hello " + name + "I'm from " + port;
    }
}
