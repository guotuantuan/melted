package com.melted.serviceribbon.index.serviceImpl;

import com.melted.serviceribbon.index.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:gtt
 * @Description
 * @Date: 2019/5/23 15:03
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
