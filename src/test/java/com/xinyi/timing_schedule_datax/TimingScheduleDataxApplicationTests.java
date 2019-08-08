package com.xinyi.timing_schedule_datax;

import com.xinyi.timing_schedule_datax.constant.Contant;
import com.xinyi.timing_schedule_datax.service.TimingSchedule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class TimingScheduleDataxApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testContant(){
        System.out.println(Contant.oneDay);
        System.out.println(Contant.initDelay);
        System.out.println(Contant.jsonPath);
        System.out.println(Contant.dataxPath);
    }

    @Test
    public void testExecuteDatax(){
        TimingSchedule.executeDatax();
    }


}
