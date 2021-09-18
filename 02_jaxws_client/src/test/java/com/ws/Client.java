package com.ws;

import com.ws.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
       //服务接口访问地址 :http://localhost:8000/ws/hello

        //创建cxl代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //设置远程访问地址
        factory.setAddress("http://localhost:8000/ws/hello");

        //设置接口类型
        factory.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        //代理对象
        System.out.println(helloService.getClass());

        //远程访问服务端方法
        String content = helloService.sayHello("zhangsan");

        System.out.println(content);

    }
}
