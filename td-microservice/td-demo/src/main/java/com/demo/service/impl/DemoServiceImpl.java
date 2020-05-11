package com.demo.service.impl;

import com.demo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Author jyb
 * @Date 2020/5/11 10:18
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void hello() {
        System.out.println("进入service的hello方法！");
    }
}
