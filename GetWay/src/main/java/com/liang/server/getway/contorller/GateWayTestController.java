package com.liang.server.getway.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liang
 * @Date: 2020/11/17 15:54
 */
@Controller
public class GateWayTestController {
    @ResponseBody
    @RequestMapping("gateWayTest")
    public String GateWayTest(){
        return "成功";
    }
}
