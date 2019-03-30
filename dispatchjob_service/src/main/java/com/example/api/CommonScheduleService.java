package com.example.api;

public interface CommonScheduleService {


    /**
     * 设置时间表达式
     * @param cron
     */
    void setCron(String cron);

    /**
     * 设置任务调度参数
     * */
    default void setJobParam(String jobParam){}

    /**
     * 设置任务调度地址
     * @param jobUrl
     */
    default void setJobUrl(String jobUrl){}


    /**
     * 启动任务
     * @return
     */
    String startJob();

    /**
     * 停止任务
     * @return
     */
      String stopJob();

    /**
     * 重启任务
     * @return
     */
  default String  restartJob(){
      stopJob();// 先停止，在开启.
      startJob();
      return "";
  }

    /**
     * 修改并启动任务
     * @param cron
     * @return
     */
  default String changeJob(String cron){
      stopJob();// 先停止，在开启.
      setCron(cron);//修改时间表达式
      startJob();
      return "";

  }

    /**
     * 执行的任务
     * @return
     */
    default String runJob(){
        job().run();
        return "";
    }

    /**
     * 定义任务
     * @return
     */
    Runnable job();

}
