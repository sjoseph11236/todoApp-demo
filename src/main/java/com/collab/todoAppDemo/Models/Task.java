package com.collab.todoAppDemo.Models;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name= "tasks")
public class Task {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", updatable = false, nullable = false, unique=true, columnDefinition = "BINARY(16)")
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "todoList_id")
    @JsonIgnore
    private TodoList todoList;
    private String description;
    private Boolean isComplete = false;

    public Task(){}

    public Task(String description){
        this.description = description;
    }
    public Task(String description, TodoList todoList){
        this.description = description;
        this.todoList = todoList;
    }


    public UUID getId() {
        return id;
    }

    public TodoList getTodoList() {
        return todoList;
    }

    public void setTodoList(TodoList todoList) {
        this.todoList = todoList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", todoList=" + todoList +
                ", description='" + description + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
