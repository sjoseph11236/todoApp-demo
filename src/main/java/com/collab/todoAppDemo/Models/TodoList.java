package com.collab.todoAppDemo.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="todoLists")
public class TodoList {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID id;
    private String title;
    @OneToMany(mappedBy = "todoList", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Set<Task> tasks;

    public TodoList(){}

    public TodoList(String title){
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
