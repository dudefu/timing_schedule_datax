package com.xinyi.timing_schedule_datax.constant;

import com.xinyi.timing_schedule_datax.utils.PropertiesUtils;

import java.util.Properties;

public class Constant {

    public final static String PROPERTY_FILE_NAME = "application.properties";
    public final static Properties props = PropertiesUtils.getProperties();

    //定时调度参数配置
    public final static Long oneDay = Long.valueOf(props.getProperty("oneDay"));		    //每一天批量执行一次
    public final static Long initDelay = Long.valueOf(props.getProperty("initDelay"));	//延迟0分钟开始执行
    public final static String jsonPath = props.getProperty("jsonPath");                 //json文件夹地址
    public final static String dataxPath = props.getProperty("dataxPath");	            //datax的python文件地址

    //Oracle连接参数配置
    public final static String Oracle_CLASS_NAME = props.getProperty("msrv.primary.datasource.driverClassName");
    public final static String Oracle_URL = props.getProperty("msrv.primary.datasource.url");
    public final static String Oracle_USERNAME = props.getProperty("msrv.primary.datasource.username");
    public final static String Oracle_PASSWORD = props.getProperty("msrv.primary.datasource.password");

    //mysql连接参数
    public final static String MYSQL_CLASS_NAME = props.getProperty("mysql.class.name");
    public final static String MYSQL_URL = props.getProperty("mysql.url");
    public final static String MYSQL_USERNAME = props.getProperty("mysql.username");
    public final static String MYSQL_PASSWORD = props.getProperty("mysql.password");

    //greenplum连接参数
    public final static String GP_CLASS_NAME = props.getProperty("gp.class.name");
    public final static String GP_URL = props.getProperty("gp.url");
    public final static String GP_USERNAME = props.getProperty("gp.username");
    public final static String GP_PASSWORD = props.getProperty("gp.password");

    //datax读取插件reader
    public final static String MYSQLREADER_NAME = props.getProperty("mysqlreader.name");
    public final static String ORACLEREADER_NAME = props.getProperty("oraclereader.name");
    public final static String POSTGRESQLREADER_NAME = props.getProperty("postgresqlreader.name");
    public final static String SQLSERVERREADER_NAME = props.getProperty("sqlserverreader.name");

    //datax读取插件writer
    public final static String MYSQLWRITER_NAME = props.getProperty("mysqlwriter.name");
    public final static String ORACLEWRITER_NAME = props.getProperty("oraclewriter.name");
    public final static String GPWRITER_NAME = props.getProperty("gpwriter.name");
    public final static String SQLSERVERWRITER_NAME = props.getProperty("sqlserverwriter.name");

}
