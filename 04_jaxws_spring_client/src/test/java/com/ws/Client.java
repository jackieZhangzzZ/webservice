package com.ws;

import com.ws.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {
    @Resource
    private HelloService helloService;
    @Test
    public void remote(){
        //查看接口的代理对象类型
        System.out.println(helloService.getClass());

        //远程访问服务端的方法
        System.out.println(helloService.sayHello("张三"));

    }
}
