package com.EmployeeLeaveReqest.EmployeeLeaveReqest.service;


import com.EmployeeLeaveReqest.EmployeeLeaveReqest.modul.Employees;
import com.EmployeeLeaveReqest.EmployeeLeaveReqest.modul.LeaveRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employees> employees=new ArrayList<>();
    List<LeaveRequest> leaveRequests=new ArrayList<>();

    public Employees addEmployee(Employees employee){
          employees.add(employee);
          return employee;
    }

    public List<Employees> getEmployee(){
        return employees;
    }

    public String requestLeave(int eID, LeaveRequest leaveRequest){
        for (Employees employee:employees){
            if (employee.getEmployeeId()==eID){
                employee.setLeaveRequest(leaveRequest);
                leaveRequests.add(leaveRequest);
                return "Request Successfull";
            }
        }
        return  "User not found";
    }

    public String approvedLeave(int eId , int lId ,LeaveRequest leaveRequest){
        for (Employees employee:employees){
            if (employee.getEmployeeId()==eId){
                LeaveRequest leaveRequestss=employee.getLeaveRequest();
                    if (leaveRequestss.getLeaveId()==lId){

                        if (employee.getLeaveBalance()>=leaveRequestss.getLeaveDays()){
                            leaveRequestss.setStatus(leaveRequest.getStatus());
                            int i=employee.getLeaveBalance()-leaveRequestss.getLeaveDays();
                            employee.setLeaveBalance(i);

                            return "approved leave";
                        }
                        return "leave balance not match";
                    }
                    return "Leave balance not match";
                }
                return "leave id is not match";
            }

        return "employee id not match";
    }


}
