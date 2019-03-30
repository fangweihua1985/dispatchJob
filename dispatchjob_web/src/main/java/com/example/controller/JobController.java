package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.api.JobOperationService;
import com.example.request.JobOperateRequestBo;
import com.example.response.CommonResponseBo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bl/job/api/")
public class JobController {
    @Resource
    private JobOperationService jobOperationService;

    /**
     * 开启定时任务
     * @param jobOperateRequestBo
     * @return
     */
    @RequestMapping(value = "/startJob", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String startJob(@RequestBody JobOperateRequestBo jobOperateRequestBo){
        CommonResponseBo responseBo = null;
        responseBo = jobOperationService.startJob(jobOperateRequestBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);
    }


    /**
     * 停止定时任务
     * @param jobOperateRequestBo
     * @return
     */
    @RequestMapping(value = "/stopJob", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String stopJob(@RequestBody JobOperateRequestBo jobOperateRequestBo){
        CommonResponseBo responseBo = null;
        responseBo = jobOperationService.stopJob(jobOperateRequestBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);
    }

    /**
     * 手动执行定时任务
     * @param jobOperateRequestBo
     * @return
     */
    @RequestMapping(value = "/runJob", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String runJob(@RequestBody JobOperateRequestBo jobOperateRequestBo){
        CommonResponseBo responseBo = null;
        responseBo = jobOperationService.runJob(jobOperateRequestBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);
    }

}
