package com.melted.servicehi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gtt on 2019/10/6.
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public Object login(HttpServletRequest request, HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Credentials", "true");

        Map map = new HashMap();
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        if(session!=null){
            if(session.getAttribute("token")!=null){
                System.out.println(session.getAttribute("token").toString());
            }

        }
        request.getSession().setAttribute("token","success");
        String token = request.getSession().getAttribute("token").toString();
        map.put("code",200);
        map.put("messaage","登陆成功");
        map.put("result","1");

        return map;
    }

    @RequestMapping("/test")
    public Object test(HttpServletRequest request, HttpServletResponse response){
        Map map = new HashMap();
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        map.put("code",200);
        map.put("messaage","登陆成功");
        map.put("result","1");
        return map;
    }
}
