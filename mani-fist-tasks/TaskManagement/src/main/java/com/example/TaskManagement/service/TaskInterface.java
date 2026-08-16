package com.example.TaskManagement.service;

import com.example.TaskManagement.model.Task;

import java.util.List;

public interface TaskInterface {
    Task addTask(Task task);
    Task getTaskById(int id);
    List<Task> getAllTask();
    Task updateTask(int id,Task task);
    String deleteTask(int id);
}
