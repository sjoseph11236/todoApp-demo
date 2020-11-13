package com.collab.todoAppDemo;



import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Repositories.TaskRepo;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    TaskRepo taskRepo;

    @Autowired
    TodoListRepo todoListRepo;

    @Override
    public void run(String... args) throws JsonProcessingException {

        if(taskRepo.count() == 0 && todoListRepo.count() == 0) {
            TodoList todoList = new TodoList("General Tasks");

            todoListRepo.save(todoList);

            Task task = new Task( "Clean Room", todoList);

            taskRepo.save(task);
        }

        System.out.println("database seeded with total task of: " + taskRepo.count() + " and total todo lists of: " + todoListRepo.count());
    }
}