package com.collab.todoAppDemo.Repositories;

import com.collab.todoAppDemo.Models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepo extends CrudRepository<Task, Long> {}
