package com.zybooks.cop4656finalgroupproject.repo;

import androidx.room.*;
import com.zybooks.cop4656finalgroupproject.model.SubTask;
import java.util.List;

@Dao
public interface SubTaskDao {
    @Query("SELECT * FROM SubTask WHERE id = :id")
    SubTask getSubTask(int id);

    @Query("SELECT * FROM SubTask Where task_id = :taskId ORDER by id")
    List<SubTask> getSubTasks(int taskId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addSubTask(SubTask subTask);

    @Update
    void updateSubTask(SubTask subTask);

    @Delete
    void deleteSubTask(SubTask subTask);
}
