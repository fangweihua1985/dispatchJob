package com.example.api;


import com.example.request.BlJobConfigParamBo;
import com.example.response.CommonResponseBo;

public interface BlJobConfigService {

    /**
     * 创建定时任务
     * @param blJobConfigParamBo
     * @return
     * @throws Exception
     */
    CommonResponseBo createJobConfig(BlJobConfigParamBo blJobConfigParamBo);

    /**
     * 编辑定时任务
     * @param blJobConfigParamBo
     * @return
     * @throws Exception
     */
    CommonResponseBo editeJobConfig(BlJobConfigParamBo blJobConfigParamBo);


    /**
     * 删除定时任务
     * @param blJobConfigParamBo
     * @return
     * @throws Exception
     */
    CommonResponseBo deleteJobConfig(BlJobConfigParamBo blJobConfigParamBo);


}
