package com.example.manifistpractice.controller;


import com.example.manifistpractice.domin.Employees;
import com.example.manifistpractice.service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/con")
public class EmployeeController {
    @Autowired
    EmployeeInterface employeeInterface;

    @GetMapping("/get")
    public Employees getEmployee(@RequestParam ("id") int id){
        return employeeInterface.getAllEmployee(id);
    }
}
