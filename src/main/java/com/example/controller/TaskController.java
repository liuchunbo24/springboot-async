package com.example.controller;

import com.example.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;

/**
 * Created by Administrator on 2019/4/18.
 */
@Controller
@Slf4j
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ResponseBody
    @RequestMapping("/test")
    public String testAsync() throws Exception {
        log.info("工作人员走进厂房，准备开始一天的工作。。" );
        long start = System.currentTimeMillis();

        taskService.doTaskOne("A");
        taskService.doTaskTwo("B");
        taskService.doTaskThree("C");
        taskService.doTaskFour("D");

        long end = System.currentTimeMillis();

        log.info("工作人员离开厂房，耗时" + (end - start) + "毫秒" );
        return "执行成功！！！";
    }
}
