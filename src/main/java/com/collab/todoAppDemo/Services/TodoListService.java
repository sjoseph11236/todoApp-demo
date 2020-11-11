package com.collab.todoAppDemo.Services;

import com.collab.todoAppDemo.Models.TodoList;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Optional;

public interface TodoListService {

    // get all

    Iterable<TodoList> getAllToDoLists();

    // get one by id

    Optional<TodoList> getToDoListById();

    // delete all

    JsonFormat deleteAllToDoLists();

    // delete by id

    // update by id

    // post todolist

}
