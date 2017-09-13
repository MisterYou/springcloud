package com.rx.controller;

import com.rx.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by youjin on 2017/9/11.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value="/hi")

    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
