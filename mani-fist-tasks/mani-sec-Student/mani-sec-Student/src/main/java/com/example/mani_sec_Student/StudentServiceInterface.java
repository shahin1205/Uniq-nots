package com.example.mani_sec_Student;

import java.util.List;

public interface StudentServiceInterface {
    Student saveStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudent();
    Student updateStudent(int id, Student student);
    String deleteStudent(int id);
    Student getName(String name);

}
