package com.liang.server.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: liang
 * @Date: 2020/11/18 10:39
 */
@Controller
public class RibbonTest {
    @RequestMapping("/get/{port}")
    @ResponseBody
    public String getPort(@PathVariable("port") String port, HttpServletRequest request){
        return "调用方reqPort:"+port+"resPort:"+request.getServerPort();
    }
}
