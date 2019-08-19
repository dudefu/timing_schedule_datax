package com.xinyi.timing_schedule_datax.dao;

import com.xinyi.timing_schedule_datax.entity.TaskDescription;

import java.util.List;

public interface TaskDescriptionDao {

    /**
     * 新增任务
     * @param taskDescription
     * @return
     */
    int save (TaskDescription taskDescription);

    /**
     * 更新任务
     * @param taskDescription
     * @return
     */
    int update (TaskDescription taskDescription);

    /**
     * 根据id删除任务
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 根据id查询任务
     * @param id
     * @return
     */
    TaskDescription selectById (int id);

    /**
     * 查询所有任务
     * @return
     */
    List<TaskDescription> selectAll ();
}
