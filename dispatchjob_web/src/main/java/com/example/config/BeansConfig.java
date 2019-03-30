package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;


@Configuration
public class BeansConfig {


    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {

        return new ThreadPoolTaskScheduler();
    }



}
