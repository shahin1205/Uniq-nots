package com.example.TaskManagement.service;

import com.example.TaskManagement.model.Task;
import com.example.TaskManagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskInterface {

@Autowired
    TaskRepository repository;
    @Override
    public Task addTask(Task task) {
        return repository.save(task);
    }

    @Override
    public Task getTaskById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Task> getAllTask() {
        return repository.findAll();
    }

    @Override
    public Task updateTask(int id, Task task) {
        Task tasks =repository.findById(id).get();
        tasks.setTaskStatus(task.getTaskStatus());
        tasks.setTaskDate(task.getTaskDate());
        return repository.save(tasks);
    }

    @Override
    public String deleteTask(int id) {
        Task task=null;
        try {
           task= repository.findById(id).orElseThrow(
                    ()->{throw new RuntimeException("id not found");}
            );
            repository.delete(task);
            return "success fully  deleted";
        }catch (RuntimeException e){
            e.getMessage();
        }
        return "id not found";
    }
}
