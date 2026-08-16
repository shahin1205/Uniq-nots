package com.example.TaskManagement.controller;

import com.example.TaskManagement.model.Task;
import com.example.TaskManagement.service.TaskInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class TaskController {
    @Autowired
    TaskInterface taskInterface;

    @PostMapping("/save")
    public Task addTask(@RequestBody Task task){
        return taskInterface.addTask(task);
    }
    @GetMapping("/getById")
    public Task getById(@RequestParam ("id") int id){
        return taskInterface.getTaskById(id);
    }
    @GetMapping("/getAll")
    public List<Task> getAllTask(){
        return taskInterface.getAllTask();
    }
    @PutMapping("/update")
    public Task update(@RequestParam("id") int id,@RequestBody Task task){
        return taskInterface.updateTask(id,task);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") int id){
        return taskInterface.deleteTask(id);
    }

}
