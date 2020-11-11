package com.collab.todoAppDemo.Repositories;

import com.collab.todoAppDemo.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {}
