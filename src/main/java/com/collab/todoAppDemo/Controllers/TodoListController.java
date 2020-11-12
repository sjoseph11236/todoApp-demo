package com.collab.todoAppDemo.Controllers;

import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Services.TodoListService;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/todolist")
public class TodoListController {

        TodoListService TodoListService;

    public TodoListController(TodoListService TodoListService){
        this.TodoListService = TodoListService;
    }

    @GetMapping("/get/{id}")
    public Optional<TodoList> getTodoListById(@PathVariable UUID id){
        return TodoListService.getToDoListById(id);
    }

    @GetMapping("/get/all")
    public Iterable<TodoList> getAllTodoLists(){
        return TodoListService.getAllToDoLists();
    }

    @PostMapping("/post")
    public JSONObject postTodoList(@RequestBody TodoList TodoList){
        return  TodoListService.postToDoList(TodoList);
    }

    @PutMapping("/put/{id}")
    public JSONObject putTodoList(@PathVariable UUID id,  @RequestBody TodoList TodoList){
        return TodoListService.updateToDoListById(id, TodoList);
    }

    @DeleteMapping("/delete/{id}")
    public JSONObject deleteTodoList(@PathVariable UUID id){
        return TodoListService.deleteToDoListById(id);
    }

    @DeleteMapping("/delete/all")
    public JSONObject deleteAllTodoLists(){
        return TodoListService.deleteAllToDoLists();
    }
}
