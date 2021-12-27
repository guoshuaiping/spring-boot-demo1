package com.gsp.springbootdemo1.controller;

import com.gsp.springbootdemo1.service.service1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {
    @RequestMapping("/hello")
    public String hello()
    {
        String t1 = service1.t1();
        return t1;
    }
}