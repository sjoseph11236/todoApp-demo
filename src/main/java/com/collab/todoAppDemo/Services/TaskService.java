package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Models.TodoList;
import org.json.simple.JSONObject;

import java.util.Optional;
import java.util.UUID;

public interface TaskService {

    // get all

    Iterable<Task> getAllTasks();

    // get one by id

    Optional<Task> getTaskById(UUID id);

    // delete all

    JSONObject deleteAllTasks();

    // delete by id

    JSONObject deleteTaskById(UUID id);

    // update by id

    Optional<Task> updateTaskById(UUID id, Task task);

    // post Task

    JSONObject postTask(Task task);

}
