package com.example.mani_sec_Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("controller")
public class StudentController {
    @Autowired
    StudentServiceInterface serviceInterface;

    @PostMapping("/Save")
    public Student saveStudent(@RequestBody Student student){
        return serviceInterface.saveStudent(student);
    }

    @GetMapping("/getById")
    public Student getStudentByID(@RequestParam("id") int id){
        return serviceInterface.getStudentById(id);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return serviceInterface.getAllStudent();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestParam("id")int id,@RequestBody Student student){
        return serviceInterface.updateStudent(id,student);
    }

    @DeleteMapping("/delete")
    public String DeleteStudent(@RequestParam("id")int id){
        return serviceInterface.deleteStudent(id);
    }

    @GetMapping("/getname")
    public Student getNames(@RequestParam String name){
        return serviceInterface.getName(name);
    }
}
