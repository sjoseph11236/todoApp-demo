package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl {


    TodoRepo todoRepo;
// https://reflectoring.io/constructor-injection/
    public TodoServiceImpl(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }
}
