package com.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hyh at 2018/08/06 下午 4:15
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate template;

    public String getHelloService(String name){
        return template.getForObject("http://EUREKA-CLIENT/hello?name=" + name, String.class);
    }
}
