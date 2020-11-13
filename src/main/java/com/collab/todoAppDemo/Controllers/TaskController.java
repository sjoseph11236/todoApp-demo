package com.collab.todoAppDemo.Controllers;

import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Services.TaskService;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
@CrossOrigin
public class TaskController {

    TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/get/{id}")
    public Optional<Task> getTaskById(@PathVariable UUID id){
        return taskService.getTaskById(id);
    }

    @GetMapping("/get/all")
    public Iterable<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping("/post")
    public JSONObject postTask(@RequestBody Task task){
        return  taskService.postTask(task);
    }

    @PutMapping("/put/{id}")
    public Optional<Task> putTask(@PathVariable UUID id, @RequestBody Task task){
        return taskService.updateTaskById(id, task);
    }

    @DeleteMapping("/delete/{id}")
    public JSONObject deleteTask(@PathVariable UUID id){
        return taskService.deleteTaskById(id);
    }

    @DeleteMapping("/delete/all")
    public JSONObject deleteAllTasks(){
        return taskService.deleteAllTasks();
    }


}
