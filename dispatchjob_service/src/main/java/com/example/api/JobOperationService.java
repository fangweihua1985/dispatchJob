package com.example.api;


import com.example.request.JobOperateRequestBo;
import com.example.response.CommonResponseBo;

public interface JobOperationService {

    /**
     * 启动任务
     * @param jobOperateRequestBo
     * @return
     * @throws Exception
     */
    CommonResponseBo startJob(JobOperateRequestBo jobOperateRequestBo);

    /**
     * 停止任务
     * @param jobOperateRequestBo
     * @return
     * @throws Exception
     */
    CommonResponseBo stopJob(JobOperateRequestBo jobOperateRequestBo);


    /**
     * 手动执行任务
     * @param jobOperateRequestBo
     * @return
     * @throws Exception
     */
    CommonResponseBo runJob(JobOperateRequestBo jobOperateRequestBo);


}
