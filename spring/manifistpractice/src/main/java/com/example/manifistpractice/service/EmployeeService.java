package com.example.manifistpractice.service;

import com.example.manifistpractice.domin.Employees;
import com.example.manifistpractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeInterface {
@Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employees getAllEmployee(int id) {
        return employeeRepository.findByID(id);
    }
}
