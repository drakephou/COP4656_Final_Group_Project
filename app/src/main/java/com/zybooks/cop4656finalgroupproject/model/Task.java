package com.zybooks.cop4656finalgroupproject.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Task {

    //TODO: Add SQLite support (ZyBooks 6.5.2)

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int Id;

    @NonNull
    @ColumnInfo(name = "task_name")
    private String TaskName;

    public Task(String name)
    {
        TaskName = name;
    }

    public int getId() {return Id;}

    public void setId(int id){Id = id;}

    public String getName(){return TaskName;}

    public void setName(String name){TaskName = name;}
}
