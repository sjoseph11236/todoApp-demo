package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Repositories.TodoListRepo;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl {


    TodoListRepo todoRepo;
// https://reflectoring.io/constructor-injection/
    public TodoListServiceImpl(TodoListRepo todoRepo){
        this.todoRepo = todoRepo;
    }
}
