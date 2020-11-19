package com.liang.service.consumer.contorller;

import com.liang.service.consumer.feignClient.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liang
 * @Date: 2020/11/17 10:02
 */
@Controller
public class Person {
    @Autowired
    private SayHelloCaller sayHelloCaller;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return sayHelloCaller.sayHello();
    }
}
