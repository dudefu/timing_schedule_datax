package com.xinyi.timing_schedule_datax.constant;

import com.xinyi.timing_schedule_datax.utils.PropertiesUtils;

import java.util.Properties;

public class Contant {

    public final static String PROPERTY_FILE_NAME = "application.yml";
    public final static Properties props = PropertiesUtils.getProperties();

    public final static Long oneDay = Long.valueOf(props.getProperty("oneDay"));		    //每一天批量执行一次
    public final static Long initDelay = Long.valueOf(props.getProperty("initDelay"));	//延迟0分钟开始执行
    public final static String jsonPath = props.getProperty("jsonPath");                 //json文件夹地址
    public final static String dataxPath = props.getProperty("dataxPath");	            //datax的python文件地址
}
