package com.zp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-demo
 * @description: 启动类
 * @author: Mr.ZP
 * @create: 2020-11-17 19:40
 **/
@SpringBootApplication
public class RestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class,args);
    }

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }

}
