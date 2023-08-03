package com.zybooks.cop4656finalgroupproject.repo;

import android.content.Context;

import com.zybooks.cop4656finalgroupproject.model.StopWatch;
import com.zybooks.cop4656finalgroupproject.model.SubTask;
import com.zybooks.cop4656finalgroupproject.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskRepository {
    private static TaskRepository TaskRepo;
    private final List<Task> TaskList;
    private final HashMap<Long, List<SubTask>> SubTaskMap;

    public static TaskRepository getInstance(Context context){
        if(TaskRepo == null){
            TaskRepo = new TaskRepository(context);
        }
        return TaskRepo;
    }

    //TODO: Add support for TaskDatabase (Look at ZyBooks 6.5 StudyDatabase)

    //TODO: Implement TaskDAOs and SubTaskDAOs
    private TaskRepository(Context context){
        TaskList = new ArrayList<>();
        SubTaskMap = new HashMap<>();
    }

    public void addTask(Task task){
        TaskList.add(task);
        List<SubTask> SubTaskList = new ArrayList<>();
        SubTaskMap.put((long) task.getId(), SubTaskList);
    }

    public Task getTask(int taskId){
        for (Task task: TaskList){
            if(task.getId() == taskId){
                return task;
            }
        }

        return null;
    }

    public List<Task> getTasks() {
        return TaskList;
    }

    public void addSubTask(SubTask subTask){
        List<SubTask> subTaskList = SubTaskMap.get(subTask.getTaskId());
        if(subTaskList != null){
            subTaskList.add(subTask);
        }
    }

    public List<SubTask> getSubTasks(int taskId){
        return SubTaskMap.get(taskId);
    }
}
