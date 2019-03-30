package com.example.impl;


import com.example.api.CommonScheduleService;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ScheduledFuture;

/**
 * 动态代理定时任务模板类
 * */

@Component
public class CommonScheduleTempletJob implements CommonScheduleService {

    @Resource
    private ThreadPoolTaskScheduler threadPoolTaskScheduler ;

    private ScheduledFuture<?> future;

    private String beanName;

    private String jobParam;

    private String jobUrl;

    //每小时执行一次
    private  String cron = "0 0/10 0 * * ?";

    @Override
    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public void setJobParam(String jobParam){
        this.jobParam = jobParam;
    }

    @Override
    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    @Override
    public String startJob() {
        if(future != null){
            future.cancel(true);
        }
        future = threadPoolTaskScheduler.schedule(job(), new CronTrigger(cron));
        return null;
    }

    @Override
    public String stopJob() {
        if (future != null) {
            future.cancel(true);
        }
        return null;
    }

    @Override
    public Runnable job() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务");
            }
        };
    }

}
