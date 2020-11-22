package com.collab.todoAppDemo.mock;

import com.collab.todoAppDemo.Controllers.TodoListController;
import com.collab.todoAppDemo.Repositories.TodoListRepo;
import com.collab.todoAppDemo.Services.TodoListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@WebMvcTest(TodoListController.class)
public class TestTodoListController {

    @MockBean
    private TodoListService todoListService;
    @MockBean
    private TodoListRepo todoListRepo;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getAllTodoLists() throws Exception {
        when(todoListService.getAllToDoLists())
                .thenReturn(todoListRepo.findAll());

        mvc.perform(MockMvcRequestBuilders
                .get("/api/todolist/get/all")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print());
    }
}
