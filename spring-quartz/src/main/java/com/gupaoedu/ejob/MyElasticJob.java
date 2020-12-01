package com.gupaoedu.ejob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @author rogan.luo
 * @Description TODO
 * @Date 2020/1/19 16:44
 */
public class MyElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        System.out.println( LocalDateTime.now().toString() + "开始执行定时任务，任务参数:" + context.getShardingParameter());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (context.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                break;
            case 1:
                // do something by sharding item 1
                break;
            case 2:
                // do something by sharding item 2
                break;
            // case n: ...
        }
    }

}
