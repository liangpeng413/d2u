package com.liang.service.consumer.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liang
 * @Date: 2020/11/18 15:27
 */
@Controller
@RefreshScope
public class ConfigTest {
//    @Value("${abcd}")
//    private String url;
//
//    @RequestMapping("configTest")
//    @ResponseBody
//    public String getConfig(){
//        return this.url;
//    }
}
