package com.collab.todoAppDemo;



import com.collab.todoAppDemo.Models.Task;
import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Repositories.TaskRepo;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
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
    public void run(String... args) throws Exception {

        if(taskRepo.count() == 0 && todoListRepo.count() == 0) {
            TodoList todoList = new TodoList("General Tasks");

            todoListRepo.save(todoList);

            Optional<TodoList> optionalTodoList = todoListRepo.findByTitle("General Tasks");

            TodoList todoList1 = optionalTodoList.get();

            Task task = new Task( "Clean Room",todoList1 );

            taskRepo.save(task);
        }

        System.out.println("database seeded with total task of: " + taskRepo.count() + " and total todo lists of: " + todoListRepo.count());
    }
}