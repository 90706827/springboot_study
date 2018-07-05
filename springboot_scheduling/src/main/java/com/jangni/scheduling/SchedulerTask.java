package com.jangni.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: springboot_study
 * @description: 定时任务
 * @author: Mr.Jangni
 * @create: 2018-07-05 19:52
 **/
@Component
public class SchedulerTask {

    private long count = 0;
    Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    @Scheduled(fixedRate = 1000)
    public void Task() {
        logger.info(String.valueOf(count));
        count++;
    }
}
