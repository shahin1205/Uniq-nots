package com.example.manifistpractice.repository;

import com.example.manifistpractice.domin.Employees;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employees> employees=new ArrayList<>();

    @PostConstruct
    public void loadDefalt(){
        employees.addAll(Arrays.asList(
                new Employees(12, "shain", 2442),
                new Employees(13, "mahin", 876),
                new Employees(14,"gokul",7659)
        ));
    }
    public Employees findByID(int id){
       Employees employees1= employees.stream()
                .filter(emp->emp.getId()==id)
                .findFirst()
                .get();
       return employees1;
    }
}
