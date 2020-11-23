package com.zp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springcloud-demo
 * @description: 服务提供者启动类
 * @author: Mr.ZP
 * @create: 2020-11-09 20:51
 **/
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
