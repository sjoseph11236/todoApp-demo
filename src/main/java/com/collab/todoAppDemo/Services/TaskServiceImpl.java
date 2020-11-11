package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Repositories.TaskRepo;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    @Override
    public Iterable<Task> getAllTasks() {
        return null;
    }

    @Override
    public Optional<Task> getTaskById() {
        return Optional.empty();
    }

    @Override
    public JSONObject deleteAllTasks() {
        return null;
    }

    @Override
    public JSONObject deleteTaskById() {
        return null;
    }

    @Override
    public JSONObject updateTaskById() {
        return null;
    }

    @Override
    public JSONObject postTask() {
        return null;
    }
}
