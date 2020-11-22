package com.collab.todoAppDemo.mock;

import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Services.TodoListService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceMockTest {

    @Mock
    TodoListService todoListService;

    TodoList todoList;

    @BeforeEach
    public void setUp(){
        todoList = new TodoList();
    }

    @Test
    public void test(){
        System.out.println(todoList.getId());
    }

}
