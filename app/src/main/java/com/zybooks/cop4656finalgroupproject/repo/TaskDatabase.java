package com.zybooks.cop4656finalgroupproject.repo;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.zybooks.cop4656finalgroupproject.model.Task;
import com.zybooks.cop4656finalgroupproject.model.SubTask;

@Database(entities = {SubTask.class, Task.class}, version = 1)
public abstract class TaskDatabase extends RoomDatabase{
    public abstract SubTaskDao subTaskDao();
    public abstract TaskDao subjectDao();
}
