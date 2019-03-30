package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DispatchjobWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(DispatchjobWebApplication.class, args);
        System.out.println("dispatchJob server start ......");
    }

}
