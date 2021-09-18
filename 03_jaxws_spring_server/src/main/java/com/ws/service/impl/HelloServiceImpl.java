package com.ws.service.impl;

import com.ws.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+"hello WebService!";
    }
}
