package com.xinyi.timing_schedule_datax.entity;

/**
 * 请求任务参数对象
 */
public class TaskDescription {

    private int taskId ;
    private String sourceId ;
    private String t_mode ;
    private String incrementColumn ;
    private String tableName ;
    private String t_columns ;
    private String targetTableName ;
    private String dispatch ;
    private String remarks ;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getMode() {
        return t_mode;
    }

    public void setMode(String mode) {
        this.t_mode = mode;
    }

    public String getIncrementColumn() {
        return incrementColumn;
    }

    public void setIncrementColumn(String incrementColumn) {
        this.incrementColumn = incrementColumn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumns() {
        return t_columns;
    }

    public void setColumns(String columns) {
        this.t_columns = columns;
    }

    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "TaskDescription{" +
                "taskId=" + taskId +
                ", sourceId='" + sourceId + '\'' +
                ", mode='" + t_mode + '\'' +
                ", incrementColumn='" + incrementColumn + '\'' +
                ", tableName='" + tableName + '\'' +
                ", columns='" + t_columns + '\'' +
                ", targetTableName='" + targetTableName + '\'' +
                ", dispatch='" + dispatch + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
