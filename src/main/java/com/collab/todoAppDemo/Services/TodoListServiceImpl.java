package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoListServiceImpl implements TodoListService {


    TodoListRepo todoRepo;
// https://reflectoring.io/constructor-injection/
    public TodoListServiceImpl(TodoListRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    @Override
    public Iterable<TodoList> getAllToDoLists() {
        return null;
    }

    @Override
    public Optional<TodoList> getToDoListById() {
        return Optional.empty();
    }

    @Override
    public JSONObject deleteAllToDoLists() {
        return null;
    }

    @Override
    public JSONObject deleteToDoListById() {
        return null;
    }

    @Override
    public JSONObject updateToDoListById() {
        return null;
    }

    @Override
    public JSONObject postToDoList() {
        return null;
    }
}
