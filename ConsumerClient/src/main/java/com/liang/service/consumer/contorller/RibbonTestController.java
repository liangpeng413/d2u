package com.liang.service.consumer.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: liang
 * @Date: 2020/11/18 10:05
 */
@Controller
public class RibbonTestController {
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private RestTemplate noRestTemplate;

    @ResponseBody
    @RequestMapping("ribbonTest")
    public String RibbonTest(HttpServletRequest request){
        String forObject = this.restTemplate.getForObject("http://provider-client/get/" + request.getServerPort(), String.class);
        System.out.println(forObject);
        return "port:"+request.getServerPort();
    }
    @ResponseBody
    @RequestMapping("noRibbonTest")
    public String noRibbonTest(HttpServletRequest request){
//        异常,找不到provider-client
//        String forObject = this.noRestTemplate.getForObject("http://provider-client/get/" + request.getServerPort(), String.class);
//        异常不能使用localhost
//        String forObject = this.noRestTemplate.getForObject("http://localhost:10218/get/" + request.getServerPort(), String.class);

        //正确方式--未开ribbon负载均衡
        String forObject = this.noRestTemplate.getForObject("http://10.207.16.58:10218/get/" + request.getServerPort(), String.class);
        System.out.println(forObject);
        return "port:"+request.getServerPort();
    }
}
