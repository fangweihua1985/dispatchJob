package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.api.BlJobConfigService;
import com.example.request.BlJobConfigParamBo;
import com.example.response.CommonResponseBo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/bl/job/api/")
public class BlJobConfigController {

    @Resource
    private BlJobConfigService blJobConfigService;



    /**
     * 创建定时任务
     * @param blJobConfigParamBo
     * @return
     */
    @RequestMapping(value = "/createJobConfig", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String createJobConfig(@RequestBody BlJobConfigParamBo blJobConfigParamBo) throws  Exception{
        CommonResponseBo responseBo = null;
        responseBo = blJobConfigService.createJobConfig(blJobConfigParamBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);

    }

    /**
     * 编辑定时任务
     * @param blJobConfigParamBo
     * @return
     */
    @RequestMapping(value = "/editeJobConfig", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String editeJobConfig(@RequestBody @Valid  BlJobConfigParamBo blJobConfigParamBo) throws  Exception{
        CommonResponseBo responseBo = null;
        responseBo = blJobConfigService.editeJobConfig(blJobConfigParamBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);
    }

    /**
     * 删除定时任务
     * @param blJobConfigParamBo
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/deleteJobConfig", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String deleteJobConfig(@RequestBody BlJobConfigParamBo blJobConfigParamBo) throws  Exception{
        CommonResponseBo responseBo = null;
        //删除配置
        responseBo = blJobConfigService.deleteJobConfig(blJobConfigParamBo);
        return JSONObject.toJSONString(responseBo, SerializerFeature.WriteMapNullValue);
    }



}
