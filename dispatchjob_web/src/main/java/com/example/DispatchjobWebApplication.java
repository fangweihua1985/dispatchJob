package com.example;

import com.example.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DispatchjobWebApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DispatchjobWebApplication.class, args);
        SpringUtil.setApplicationContext(ctx);
        System.out.println("dispatchJob server start ......");
    }

}
