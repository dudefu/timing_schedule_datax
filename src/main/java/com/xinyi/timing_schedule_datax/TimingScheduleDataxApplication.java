package com.xinyi.timing_schedule_datax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xinyi.timing_schedule_datax.dao.TaskDescriptionDao")
public class TimingScheduleDataxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimingScheduleDataxApplication.class, args);
    }

}
