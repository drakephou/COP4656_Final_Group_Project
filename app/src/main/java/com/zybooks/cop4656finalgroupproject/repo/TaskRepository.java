package com.zybooks.cop4656finalgroupproject.repo;

import androidx.lifecycle.LiveData;
import android.content.Context;
import androidx.room.Room;
import com.zybooks.cop4656finalgroupproject.model.SubTask;
import com.zybooks.cop4656finalgroupproject.model.Task;
import java.util.List;

public class TaskRepository {
    private static TaskRepository TaskRepo;
    private final TaskDao mTaskDao;
    private final SubTaskDao mSubTaskDao;

    public static TaskRepository getInstance(Context context){
        if(TaskRepo == null){
            TaskRepo = new TaskRepository(context);
        }
        return TaskRepo;
    }

    //TODO: Add support for TaskDatabase (Look at ZyBooks 6.5 StudyDatabase)

    //TODO: Implement TaskDAOs and SubTaskDAOs
    private TaskRepository(Context context){
        TaskDatabase database = Room.databaseBuilder(context, TaskDatabase.class, "task.db")
                .allowMainThreadQueries()
                .build();

        mTaskDao = database.subjectDao();
        mSubTaskDao = database.subTaskDao();

        /*
        TaskList = new ArrayList<>();
        SubTaskMap = new HashMap<>();
         */
    }

    public void addTask(Task task){
        int taskId = mTaskDao.addTask(task);
        task.setId(taskId);
    }

    public LiveData<Task> getTask(int taskId){
        return mTaskDao.getTask(taskId);
    }

    public LiveData<List<Task>> getTasks() {
        return mTaskDao.getTasks();
    }

    public void deleteTask(Task task){
        mTaskDao.deleteTask(task);
    }

    public SubTask getSubTask(int subTaskId){
        return mSubTaskDao.getSubTask(subTaskId);
    }

    public List<SubTask> getSubTasks(int taskId){
        return mSubTaskDao.getSubTasks(taskId);
    }

    public void addSubTask(SubTask subTask){
        int subTaskId = (int) mSubTaskDao.addSubTask(subTask);
        subTask.setId(subTaskId);
    }

    public void updateSubTask(SubTask subTask){
        mSubTaskDao.updateSubTask(subTask);
    }

    public void deleteSubTask(SubTask subTask){
        mSubTaskDao.deleteSubTask(subTask);
    }
}
