package com.liang.service.consumer.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: liang
 * @Date: 2020/11/16 18:36
 */
@FeignClient(value = "provider-client")
public interface SayHelloCaller {

    @RequestMapping("hello")
    public String sayHello();
}
