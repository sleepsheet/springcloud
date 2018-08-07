package com.springcloud.feign.service;

import com.springcloud.feign.fallback.RemoteServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hyh at 2018/08/07 上午 10:43
 */
@Component("remoteService")
@FeignClient(value = "eureka-client", fallback = RemoteServiceHystric.class)
public interface RemoteService {
    @GetMapping(value = "/hello")
    String sayHifromEurekaClient(@RequestParam(value = "name") String name);
}
