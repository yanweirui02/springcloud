package com.kd.serviceribbon.ribbon.controller;

import com.kd.serviceribbon.ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wryan
 * @version 1.0
 * @create 2018-12-13 11:01
 **/
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
