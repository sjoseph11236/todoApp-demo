package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TodoListServiceImpl implements TodoListService {
    
    TodoListRepo todoListRepo;
// https://reflectoring.io/constructor-injection/
    public TodoListServiceImpl(TodoListRepo todoListRepo){
        this.todoListRepo = todoListRepo;
    }

    @Override
    public Iterable<TodoList> getAllToDoLists() {
        return todoListRepo.findAll();
    }

    @Override
    public Optional<TodoList> getToDoListById(UUID id) {
        return todoListRepo.findById(id);
    }

    @Override
    public JSONObject deleteAllToDoLists() {



        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List updated");
        return responseBody;
    }

    @Override
    public JSONObject deleteToDoListById(UUID id) {
        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List updated");
        return responseBody;
    }

    @Override
    public JSONObject updateToDoListById(UUID id) {
        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List updated");
        return responseBody;
    }

    @Override
    public JSONObject postToDoList(TodoList todoList) {
        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List updated");
        return responseBody;
    }
}
