package com.example.impl;

import com.example.api.BlJobConfigService;
import com.example.enums.MessageEnum;
import com.example.manager.CommonJobManager;
import com.example.request.BlJobConfigParamBo;
import com.example.response.CommonResponseBo;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class BlJobConfigServiceImpl implements BlJobConfigService {

    @Resource
    private CommonJobManager commonJobManager;


    @Override
    public CommonResponseBo createJobConfig(BlJobConfigParamBo blJobConfigParamBo){
        //检查时间表达式是否合法
        CronTrigger trigger = new CronTrigger(blJobConfigParamBo.getJobCorn());
        try {
            commonJobManager.getJobBeanExt(blJobConfigParamBo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回数据
        CommonResponseBo responseBo = new CommonResponseBo(MessageEnum.RESULT_SUCCESS.getCode(),MessageEnum.RESULT_SUCCESS.getMessage());
        return responseBo;
    }

    @Override
    public CommonResponseBo editeJobConfig(BlJobConfigParamBo blJobConfigParamBo) {
        return null;
    }

    @Override
    public CommonResponseBo deleteJobConfig(BlJobConfigParamBo blJobConfigParamBo) {
        return null;
    }


}
