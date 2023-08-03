package com.zybooks.cop4656finalgroupproject.model;

import com.zybooks.cop4656finalgroupproject.model.StopWatch;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Task.class, parentColumns = "id",
    childColumns = "subject_id", onDelete = CASCADE))
public class SubTask {
    //TODO: Add SQLite support (ZyBooks 6.5.2)

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int Id;

    @ColumnInfo(name = "task_id")
    private int TaskId;

    @ColumnInfo(name = "subtask_name")
    private String SubTaskName;

    //It may be better to implement a long instead of a StopWatch, since I want to track how many
    //milliseconds a subtask has been worked on
    @ColumnInfo(name = "sub_stopwatch")
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
        return SubTaskName;
    }

    public void setDescription(String description) {
        SubTaskName = description;
    }

    public StopWatch getSubStopWatch() {
        return SubStopWatch;
    }

    public void setSubStopWatch(StopWatch subStopWatch) {
        SubStopWatch = subStopWatch;
    }

}
