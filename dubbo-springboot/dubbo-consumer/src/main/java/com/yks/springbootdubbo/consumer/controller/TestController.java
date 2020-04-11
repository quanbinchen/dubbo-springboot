package com.yks.springbootdubbo.consumer.controller;

import com.yks.springbootdubbo.producer.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    //调用服务
    @Reference
    private TestService testServiceImpl;

    @RequestMapping("/ins")
    public String ins(){
        testServiceImpl.ins();
        return "ins";
    }

    @RequestMapping("/del")
    public String del(){
        testServiceImpl.del();
        return "del";
    }

    @RequestMapping("/upd")
    public String upd(){
        testServiceImpl.upd();
        return "upd";
    }

    @RequestMapping("/sel")
    public String sel(){
        testServiceImpl.sel();
        return "sel";
    }


}
