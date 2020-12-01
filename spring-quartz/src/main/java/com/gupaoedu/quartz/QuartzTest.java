package com.gupaoedu.quartz;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  单元测试类
 */
public class QuartzTest {

    private static Scheduler scheduler;

    public static void main(String[] args) throws SchedulerException {
        // 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_quartz.xml");
    }

}
