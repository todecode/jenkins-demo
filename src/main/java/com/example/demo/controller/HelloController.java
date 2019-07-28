package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Mr.Chen
 * @Date 上午 10:05
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        return "welcome to jenkins ";
    }

    public void test001(){
        System.out.println(111);
    }
}
