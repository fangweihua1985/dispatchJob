package com.example.manager;

import com.example.api.CommonScheduleService;
import com.example.impl.CommonScheduleTempletJob;
import com.example.request.BlJobConfigParamBo;
import com.example.utils.SpringUtil;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommonJobManager {

    @Resource
    private DefaultListableBeanFactory defaultListableBeanFactory;

    public CommonScheduleService getJobBean(String beanName){
        CommonScheduleService commonScheduleService = SpringUtil.getBean(beanName,CommonScheduleService.class);
        if(commonScheduleService == null){
           return null;
        }
        return commonScheduleService;
    }


    public CommonScheduleService getJobBeanExt(BlJobConfigParamBo blJobConfigParamBo)throws Exception{
        this.reflectionBeanRegister(blJobConfigParamBo);
        CommonScheduleService commonScheduleService = SpringUtil.getBean(blJobConfigParamBo.getBeanid(),CommonScheduleService.class);
        if(commonScheduleService == null){
            throw new Exception();
        }
        commonScheduleService.setCron(blJobConfigParamBo.getJobCorn());
        return commonScheduleService;
    }

    private void reflectionBeanRegister(BlJobConfigParamBo blJobConfigParamBo){
        GenericBeanDefinition beanDef = new GenericBeanDefinition();
        beanDef.setBeanClass(CommonScheduleTempletJob.class);
        MutablePropertyValues params = new MutablePropertyValues();
        params.addPropertyValue("jobParam",blJobConfigParamBo.getJobParam());
        params.addPropertyValue("jobUrl",blJobConfigParamBo.getJobIp());
        beanDef.setPropertyValues(params);
        defaultListableBeanFactory.registerBeanDefinition(blJobConfigParamBo.getBeanid(),beanDef);
    }


    /**
     * 启动任务
     * @return
     */
    public String startJob(String beanName){
        CommonScheduleService commonScheduleService = this.getJobBean(beanName);
        if(commonScheduleService != null){
            return commonScheduleService.startJob();
        }
        return null;
    }

    /**
     * 停止任务
     * @return
     */
    public String stopJob(String beanName){
        CommonScheduleService commonScheduleService = this.getJobBean(beanName);
        if(commonScheduleService != null){
            return commonScheduleService.stopJob();
        }
        return null;
    }

    /**
     * 执行的任务
     * @return
     */
   public  String runJob(String beanName){
       CommonScheduleService commonScheduleService = this.getJobBean(beanName);
       if(commonScheduleService != null){
           return commonScheduleService.runJob();
       }
       return null;
   }





}
