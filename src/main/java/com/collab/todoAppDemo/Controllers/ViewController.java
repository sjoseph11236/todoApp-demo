package com.collab.todoAppDemo.Controllers;

import com.collab.todoAppDemo.Services.TodoListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ViewController {

    TodoListService todoListService;

    public ViewController(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    @GetMapping("/home")
    public String getHome(Model model, Model todoListModel){
        model.addAttribute("greeting", "hello world");
        todoListModel.addAttribute("todoLists", todoListService.getAllToDoLists());
        return "index";
    }


}
