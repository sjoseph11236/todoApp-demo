package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.TodoList;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.json.simple.JSONObject;

import java.util.Optional;

public interface TodoListService {

    // get all

    Iterable<TodoList> getAllToDoLists();

    // get one by id

    Optional<TodoList> getToDoListById();

    // delete all

    JSONObject deleteAllToDoLists();

    // delete by id

    JSONObject deleteToDoListById();

    // update by id

    JSONObject updateToDoListById();

    // post todolist

    JSONObject postToDoList();

}
