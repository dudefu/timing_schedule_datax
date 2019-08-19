package com.xinyi.timing_schedule_datax.dao;

import com.xinyi.timing_schedule_datax.entity.TaskDescription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDescriptionMapperTest {

    @Autowired
    private TaskDescriptionDao taskDescriptionDao ;

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void selectById() {
    }

    @Test
    public void selectAll() {
        List<TaskDescription> taskDescriptions = taskDescriptionDao.selectAll();
        System.out.println(taskDescriptions);
        assertEquals(2,taskDescriptions.size());
    }
}