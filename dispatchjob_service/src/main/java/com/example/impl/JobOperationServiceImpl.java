package com.example.impl;

import com.example.api.JobOperationService;
import com.example.enums.MessageEnum;
import com.example.manager.CommonJobManager;
import com.example.request.JobOperateRequestBo;
import com.example.response.CommonResponseBo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JobOperationServiceImpl implements JobOperationService {

    @Resource
    private CommonJobManager commonJobManager;


    @Override
    public CommonResponseBo startJob(JobOperateRequestBo jobOperateRequestBo){
        commonJobManager.startJob(jobOperateRequestBo.getBeanName());
        return null;
    }

    @Override
    public CommonResponseBo stopJob(JobOperateRequestBo jobOperateRequestBo){
        commonJobManager.stopJob(jobOperateRequestBo.getBeanName());
        return null;
    }


    @Override
    public CommonResponseBo runJob(JobOperateRequestBo jobOperateRequestBo){
        commonJobManager.runJob(jobOperateRequestBo.getBeanName());
        return null;
    }
}
