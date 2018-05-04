package com.test.springbootredis.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.nio.file.SimpleFileVisitor;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    private static  final SimpleDateFormat date=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron =" 4/1 * * * * ? " )
    public void reportCurrentTime(){
        System.out.println("现在时间"+date.format(new Date()));
    }
}
