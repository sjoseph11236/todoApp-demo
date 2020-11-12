package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Repositories.TaskRepo;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }

    @Override
    public Iterable<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    @Override
    public Optional<Task> getTaskById(UUID id) {
        return taskRepo.findById(id);
    }

    @Override
    public JSONObject deleteAllTasks() {
        taskRepo.deleteAll();
        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "all Tasks deleted");
        return responseBody;
    }

    @Override
    public JSONObject deleteTaskById(UUID id) {
        taskRepo.deleteById(id);
        JSONObject responseBody = new JSONObject();
            responseBody.put("message", "Task deleted");
        return responseBody;
    }

    @Override
    public JSONObject updateTaskById(UUID id, Task newTask) {
        Optional<Task> optionalTask = taskRepo.findById(id);

        optionalTask.map(task -> {
            task.setComplete(newTask.getComplete());
            task.setDescription(newTask.getDescription());
            task.setTodoList(newTask.getTodoList());
            return task;
        });


        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Task updated");
        return responseBody;
    }

    @Override
    public JSONObject postTask(Task task) {
        
        taskRepo.save(task);
        
        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Task posted");
        return responseBody;
    }
}
