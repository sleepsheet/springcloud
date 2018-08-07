package com.springcloud.feign.fallback;

import com.springcloud.feign.service.RemoteService;
import org.springframework.stereotype.Component;

/**
 * Created by hyh at 2018/08/07 下午 12:17
 */
@Component
public class RemoteServiceHystric implements RemoteService {
    @Override
    public String sayHifromEurekaClient(String name) {
        return "Sorry, " + name + ", Connect is refuse";
    }
}
