package com.melted.serviceribbon.index.controller;

import com.melted.serviceribbon.index.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:gtt
 * @Description
 * @Date: 2019/5/23 15:05
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        System.out.println(1);
        return helloService.hiService( name );
    }
}

