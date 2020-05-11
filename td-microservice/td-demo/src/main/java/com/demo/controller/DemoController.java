package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.DemoService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * 跟传统mvc开发方式的区别，使用RestSchema替换RestController
 * Schema是java chassis的服务契约，是服务运行时的基础，服务治理、编解码等都基于契约进行
 * @Author jyb
 * @Date 2020/5/9 16:49
 */
@RestSchema(schemaId = "td-demo")
@RequestMapping(value = "/")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @GetMapping(value = "/hello")
    public String test(String name,String password) {
        System.out.println("hello");
        return "hello";
    }

    @ResponseBody
    @GetMapping(value = "/test2")
    public User test2(@RequestBody User user) {
        System.out.println("demo");
        user.setId(111);
        user.setName("aaaa");
        return user;
    }

    @GetMapping(value = "/test3")
    public Integer test3(Integer age) {
        demoService.hello();
        System.out.println("test3");
        return 11;
    }

    @GetMapping(value = "/test4")
    public void test4(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("user"));
        StringBuffer requestURL = request.getRequestURL();
        String servletPath = request.getServletPath();
        System.out.println("url= " + requestURL);
        System.out.println("path= " + servletPath);
        System.out.println("test4");
    }

}
