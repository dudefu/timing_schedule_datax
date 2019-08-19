package com.xinyi.timing_schedule_datax.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xinyi.timing_schedule_datax.entity.TaskDescription;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接收请求参数，将参数插入请求表中
 */
@RestController
@RequestMapping("/taskDescription")
public class InsertRequestDataInTable {

    @PostMapping(value = "/createTaskDescription",produces = "application/json;charset=UTF-8")
    public String InsertRequestDataInTable(@RequestBody String request) {
        JSONObject jsonObject = JSONObject.parseObject(request);
        TaskDescription taskDescription = JSON.toJavaObject(jsonObject,TaskDescription.class);
        System.out.println(taskDescription.toString());
//        TaskDescriptionMapperImpl taskDescriptionMapperImpl = new TaskDescriptionMapperImpl();
//        int sucess = taskDescriptionMapperImpl.save(taskDescription);
//        return String.valueOf(sucess);
        return null ;
    }
}
