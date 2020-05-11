package com.demo;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.apache.servicecomb.transport.rest.servlet.RestServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author jyb
 * @Date 2020/5/9 15:42
 */
/* @EnableServiceComb会开启org.apache.servicecomb.transport.rest.servlet.RestServlet，
   排除DispatcherServlet,也可不排除
 */
// @SpringBootApplication(exclude=DispatcherServletAutoConfiguration.class)
@SpringBootApplication
@EnableServiceComb
public class DemoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class,args);
    }
}
