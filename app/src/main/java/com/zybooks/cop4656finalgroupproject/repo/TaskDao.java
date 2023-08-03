package com.zybooks.cop4656finalgroupproject.repo;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.zybooks.cop4656finalgroupproject.model.Task;
import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM Task WHERE id = :id")
    LiveData<Task> getTask(int id);

    @Query("SELECT * FROM Task ORDER BY task_name COLLATE NOCASE")
    LiveData<List<Task>> getTasks();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    int addTask(Task task);

    @Update
    void updateTask(Task task);

    @Delete
    void deleteTask(Task task);
}
