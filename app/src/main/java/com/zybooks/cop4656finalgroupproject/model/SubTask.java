package com.zybooks.cop4656finalgroupproject.model;

import com.zybooks.cop4656finalgroupproject.model.StopWatch;

public class SubTask {
    private int Id;
    private int TaskId;
    private String Description;
    private StopWatch SubStopWatch;

    public SubTask(int taskId)
    {
        TaskId = taskId;
    }

    public int getId() {return Id;}

    public void setId(int id) {
        Id = id;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public StopWatch getSubStopWatch() {
        return SubStopWatch;
    }

    public void setSubStopWatch(StopWatch subStopWatch) {
        SubStopWatch = subStopWatch;
    }

}
