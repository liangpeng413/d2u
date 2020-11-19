package com.liang.service.consumer.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liang
 * @Date: 2020/11/17 15:00
 */
@Controller
@RequestMapping("customer")
public class Customer {

    @GetMapping(value = "user")
    @ResponseBody
    public String user(){
        return "halo用户";
    }
}
