package com.collab.todoAppDemo.Repositories;


import com.collab.todoAppDemo.Models.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TodoListRepo extends CrudRepository<TodoList, UUID> {
    Optional<TodoList> findByTitle(String title);
}
