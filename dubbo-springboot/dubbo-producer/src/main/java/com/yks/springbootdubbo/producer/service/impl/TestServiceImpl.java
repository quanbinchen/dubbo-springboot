package com.yks.springbootdubbo.producer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yks.springbootdubbo.producer.service.TestService;
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void ins() {
        System.out.println("---------------insert-------------------");
    }

    @Override
    public void del() {
        System.out.println("---------------delete-------------------");
    }

    @Override
    public void upd() {
        System.out.println("---------------update-------------------");
    }

    @Override
    public void sel() {
        System.out.println("---------------select-------------------");

    }
}
