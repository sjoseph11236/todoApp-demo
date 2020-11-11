package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Models.TodoList;
import org.json.simple.JSONObject;

import java.util.Optional;

public interface TaskService {

    // get all

    Iterable<Task> getAllTasks();

    // get one by id

    Optional<Task> getTaskById();

    // delete all

    JSONObject deleteAllTasks();

    // delete by id

    JSONObject deleteTaskById();

    // update by id

    JSONObject updateTaskById();

    // post Task

    JSONObject postTask();

}
