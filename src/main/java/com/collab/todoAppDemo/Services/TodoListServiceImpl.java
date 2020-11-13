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
    public Optional<TodoList> getToDoListByTitle(String title) {
        return todoListRepo.findByTitle(title);
    }


    @Override
    public Optional<TodoList> getToDoListById(UUID id) {
        return todoListRepo.findById(id);
    }

    @Override
    public JSONObject deleteAllToDoLists() {
        todoListRepo.deleteAll();

        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "all Todo Lists deleted");
        return responseBody;
    }

    @Override
    public JSONObject deleteToDoListById(UUID id) {
        todoListRepo.deleteById(id);

        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List deleted");
        return responseBody;
    }

    @Override
    public Optional<TodoList> updateToDoListById(UUID id, TodoList newToDoList) {
        todoListRepo.findById(id)
                .map(todoList -> {
           todoList.setTasks(newToDoList.getTasks());
           todoList.setTitle(newToDoList.getTitle());
           return todoListRepo.save(todoList);
        });


//        JSONObject responseBody = new JSONObject();
        System.out.println(todoListRepo.findById(id));
        return todoListRepo.findById(id);
    }

    @Override
    public JSONObject postToDoList(TodoList todoList) {
        todoListRepo.save(todoList);

        JSONObject responseBody = new JSONObject();
        responseBody.put("message", "Todo List updated");
        return responseBody;
    }
}
