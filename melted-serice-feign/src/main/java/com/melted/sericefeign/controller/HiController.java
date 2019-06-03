package com.melted.sericefeign.controller;

import com.melted.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:gtt
 * @Description
 * @Date: 2019/5/24 9:33
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
    @GetMapping(value = "/hello")
    public String sayHiHello(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOneHello( name );
    }

}
