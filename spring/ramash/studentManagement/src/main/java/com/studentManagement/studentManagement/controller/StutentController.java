package com.studentManagement.studentManagement.controller;


import com.studentManagement.studentManagement.model.Course;
import com.studentManagement.studentManagement.model.Student;
import com.studentManagement.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class StutentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addCourse")
    public List<Course> addCourse(@RequestBody List<Course> course){
        return  studentService.addCourse(course);
    }

    @PostMapping("/addStudent")
    public  List<Student> addStudent(@RequestBody List<Student> student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return  studentService.getStudent();
    }

    @PutMapping("/addCourseToStudent/{studentId}/{courseID}")
    public String addCourseToStudent(@PathVariable("studentId") int sID,@PathVariable("courseID") int cID){
        return studentService.addCourseToStudent(sID,cID);
    }


    @DeleteMapping("/delate/{studentId}/{courseID}")
    public String removeCourse(@PathVariable("studentId") int sID,@PathVariable("courseID") int cID){
        return studentService.removeCourse(sID,cID);
    }

    @PatchMapping("/update/{sID}/{cID}")
    public String updateCourse(@PathVariable("sID") int sID,
                               @PathVariable("cID") int cID,
                               @RequestBody Course course){
        return  studentService.updateCourse(sID,cID,course);
    }

    ////----------------------------------------------

//    @PutMapping("/updateCourse/{studentId}/{oldCourseId}/{newCourseId}")
//    public String updateCourse(@PathVariable int studentId,
//                               @PathVariable int oldCourseId,
//                               @PathVariable int newCourseId){
//
//        return studentService.updateCourse(
//                studentId,
//                oldCourseId,
//                newCourseId
//        );
//    }
}
