package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;


/**
 * Created by Administrator on 2019/4/18.
 */
@Service
@Slf4j
public class TaskService {
    public static Random random=new Random();

    @Async
    public void doTaskOne(String i) throws Exception {
        log.info("机器"+i+"开始生产...");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("机器"+i+"停止生产，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void  doTaskTwo(String i) throws Exception {
        log.info("机器"+i+"开始生产...");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("机器"+i+"停止生产，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void  doTaskThree(String i) throws Exception {
        log.info("机器"+i+"开始生产...");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("机器"+i+"停止生产，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void  doTaskFour(String j){
        log.info("机器"+j+"开始生产...");
        long start = System.currentTimeMillis();
        long count = 0;
        for (int i = 0 ; i < 10000000; i ++){
            count = count + i ;
        }
        long end = System.currentTimeMillis();
        log.info("机器"+j+"停止生产，耗时：" + (end - start) + "毫秒");
    }
}
