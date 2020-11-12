package com.collab.todoAppDemo.Repositories;

import com.collab.todoAppDemo.Models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepo extends CrudRepository<Task, UUID> {}
