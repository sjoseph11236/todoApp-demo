package com.collab.todoAppDemo.mock;

import com.collab.todoAppDemo.Models.TodoList;
import com.collab.todoAppDemo.Services.TodoListService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.when;

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
