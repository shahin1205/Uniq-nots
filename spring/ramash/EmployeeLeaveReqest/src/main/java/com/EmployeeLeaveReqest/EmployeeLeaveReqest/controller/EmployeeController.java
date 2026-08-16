package com.EmployeeLeaveReqest.EmployeeLeaveReqest.controller;


import com.EmployeeLeaveReqest.EmployeeLeaveReqest.modul.Employees;
import com.EmployeeLeaveReqest.EmployeeLeaveReqest.modul.LeaveRequest;
import com.EmployeeLeaveReqest.EmployeeLeaveReqest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employees addEmployee(@RequestBody Employees employees){
        return employeeService.addEmployee(employees);
    }


    @GetMapping("/get")
    public List<Employees> getEmployee(){
        return employeeService.getEmployee();
    }

    @PutMapping("/request/{eId}")
    public String request(@PathVariable("eId")int eId, @RequestBody LeaveRequest leaveRequest){
        return  employeeService.requestLeave(eId,leaveRequest);
    }

    @PatchMapping("/approude/{eId}/{lId}")
    public String approude(@PathVariable("eId") int eId , @PathVariable ("lId") int lId, @RequestBody LeaveRequest leaveRequest){
        return employeeService.approvedLeave(eId,lId,leaveRequest);
    }

}
