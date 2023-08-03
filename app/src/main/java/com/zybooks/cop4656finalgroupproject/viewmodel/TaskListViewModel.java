package com.zybooks.cop4656finalgroupproject.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.zybooks.cop4656finalgroupproject.model.Task;
import com.zybooks.cop4656finalgroupproject.repo.TaskRepository;
import java.util.List;

public class TaskListViewModel extends AndroidViewModel {
    private final TaskRepository TaskRepo;

    public TaskListViewModel(Application application){
        super(application);
        TaskRepo = TaskRepository.getInstance(application.getApplicationContext());
    }

    public LiveData<List<Task>> getTasks() {
        return TaskRepo.getTasks();
    }

    public void addTask(Task task) {
        TaskRepo.addTask(task);
    }

    public void deleteTask(Task task) {
        TaskRepo.deleteTask(task);
    }
}
