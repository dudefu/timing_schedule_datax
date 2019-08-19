package com.xinyi.timing_schedule_datax.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;



/**
 * 根据请求表，生成JobJson
 */
public class CreateJobJson {

    public static void main(String[] args) {
        JSONObject createJobJson = createJobJson();
        System.out.println(createJobJson);
    }

    // 创建JSONObject对象
    public static JSONObject createJobJson() {
        JSONObject result = new JSONObject();
        /**
         * content
         */
        JSONArray content = new JSONArray();
        /**
         * reader
         */
        JSONObject reader = new JSONObject();
        JSONObject readerContent = new JSONObject();
        readerContent.put("name","oraclereader");
        JSONObject readerParameter = new JSONObject();
        readerParameter.put("username","root");
        readerParameter.put("password","root");
        JSONArray readerColumn = new JSONArray();
        readerColumn.add(0,"*");
        readerParameter.put("column",readerColumn);
        JSONArray readerConnection = new JSONArray();
        JSONObject readerConnectionContent = new JSONObject();
        JSONArray readerTableContent = new JSONArray();
        readerTableContent.add(0,"TEST_DATA_01");
        JSONArray readerJdbcUrlContent = new JSONArray();
        readerJdbcUrlContent.add(0,"jdbc:oracle:thin:@183.62.140.8:15221:nsqw");
        readerConnectionContent.put("table",readerTableContent);
        readerConnectionContent.put("jdbcUrl",readerJdbcUrlContent);
        readerConnection.add(0,readerConnectionContent);
        readerParameter.put("connection",readerConnection);
        readerContent.put("parameter",readerParameter);
        reader.put("reader",readerContent);
        /**
         * writer
         */
        JSONObject writer = new JSONObject();
        JSONObject writerContent = new JSONObject();
        writerContent.put("name","gpdbwriter");
        JSONObject writerParameter = new JSONObject();
        writerParameter.put("username","root");
        writerParameter.put("password","root");
        JSONArray writerColumn = new JSONArray();
        writerColumn.add(0,"*");
        writerParameter.put("column",writerColumn);
        JSONArray writerConnection = new JSONArray();
        JSONObject writerConnectionContent = new JSONObject();
        JSONArray writerTableContent = new JSONArray();
        writerTableContent.add(0,"TEST_DATA_01");
        writerConnectionContent.put("table",writerTableContent);
        writerConnectionContent.put("jdbcUrl","jdbc:oracle:thin:@183.62.140.8:15221:nsqw");
        writerConnection.add(0,writerConnectionContent);
        writerParameter.put("connection",writerConnection);
        writerContent.put("parameter",writerParameter);
        writer.put("writer",writerContent);

        content.add(0, reader);
        content.add(1, writer);
        /**
         * setting
         */
        JSONObject setting = new JSONObject();
        JSONObject speedContent = new JSONObject();
        speedContent.put("channel",1);
        setting.put("speed", speedContent);

        /**
         * 最终结果：返回一个JSONArray对象
          */
        JSONObject jobObj = new JSONObject();
        jobObj.put("content", content);
        jobObj.put("setting", setting);
        result.put("job", jobObj);

        return result;
    }

}
