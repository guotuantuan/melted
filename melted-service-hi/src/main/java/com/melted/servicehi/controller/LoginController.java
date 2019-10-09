package com.melted.servicehi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gtt on 2019/10/6.
 */
@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    HttpServletRequest request;
    @RequestMapping("/login")
    public Object login(){
        Map map = new HashMap();
        request.getSession().setAttribute("token","success");
        String token = request.getSession().getAttribute("token").toString();
        map.put("code",200);
        map.put("messaage","登陆成功");
        map.put("result","1");
        return map;
    }
    @RequestMapping("/test")
    public Object test(){
        Map map = new HashMap();

        map.put("code",200);
        map.put("messaage","登陆成功");
        map.put("result","1");
        return map;
    }
}
