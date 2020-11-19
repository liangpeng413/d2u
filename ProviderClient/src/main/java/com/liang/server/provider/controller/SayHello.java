package com.liang.server.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liang
 * @Date: 2020/11/16 18:34
 */
@Controller
public class SayHello {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

}
