package com.collab.todoAppDemo;



import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Repositories.TaskRepo;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    TaskRepo taskRepo;

    @Autowired
    TodoListRepo todoListRepo;

    @Override
    public void run(String... args) throws JsonProcessingException {

        if(taskRepo.count() == 0 && todoListRepo.count() == 0) {
            TodoList todoList = new TodoList("My Other Tasks");

            todoListRepo.save(todoList);

            Optional<TodoList> optionalTodoList = todoListRepo.findByTitle("My Other Tasks");

            TodoList todoList1 = optionalTodoList.get();

            Task task = new Task( "Clean Room",todoList1);
            Task task2 = new Task( "Clean Brother's Room",todoList1);

            taskRepo.save(task);
            taskRepo.save(task2);
        }

        System.out.println("database seeded with total task of: " + taskRepo.count() + " and total todo lists of: " + todoListRepo.count());
    }
}