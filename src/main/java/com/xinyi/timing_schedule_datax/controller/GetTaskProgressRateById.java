package com.xinyi.timing_schedule_datax.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 	导入数据任务进度查询接口
 */
@RestController
@RequestMapping("/task")
public class GetTaskProgressRateById {

    @PostMapping(value = "/getTaskProgressRateById",produces = "application/json;charset=UTF-8")
    public String getTaskProgressRateById(@RequestBody String request) {
        System.out.println(request.toString());
        return "RequestData";
    }
}
