package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.TodoList;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.json.simple.JSONObject;

import java.util.Optional;
import java.util.UUID;

public interface TodoListService {

    // get all

    Iterable<TodoList> getAllToDoLists();

    //    get on by title
    Optional<TodoList> getToDoListByTitle(String title);

    // get one by id

    Optional<TodoList> getToDoListById(UUID id);

    // delete all

    JSONObject deleteAllToDoLists();

    // delete by id

    JSONObject deleteToDoListById(UUID id);

    // update by id

    Optional<TodoList> updateToDoListById(UUID id, TodoList todoList);

    // post todolist

    JSONObject postToDoList(TodoList todoList);

}
