package com.example.request;


public class BlJobConfigParamBo  {

    /** 任务名称 */
    private String jobName;

    /** 任务标识 */
    private String beanid;

    /** 执行表达式 */
    private String jobCorn;

    /** 调用地址，执行机器ip */
    private String jobIp;

    /** 任务参数 */
    private String jobParam;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getBeanid() {
        return beanid;
    }

    public void setBeanid(String beanid) {
        this.beanid = beanid;
    }

    public String getJobCorn() {
        return jobCorn;
    }

    public void setJobCorn(String jobCorn) {
        this.jobCorn = jobCorn;
    }

    public String getJobIp() {
        return jobIp;
    }

    public void setJobIp(String jobIp) {
        this.jobIp = jobIp;
    }

    public String getJobParam() {
        return jobParam;
    }

    public void setJobParam(String jobParam) {
        this.jobParam = jobParam;
    }
}
