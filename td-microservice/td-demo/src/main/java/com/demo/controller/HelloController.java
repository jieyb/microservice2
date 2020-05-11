package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author jyb
 * @Date 2020/5/11 11:24
 */
@RestController
public class HelloController {

    @PostMapping(value = "/hello")
    public String hello() {
        System.out.println("helloContrller");
        return "helloContrller";
    }

}
