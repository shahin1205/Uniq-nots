package com.studentManagement.studentManagement.model;

import java.util.List;

public class Student {

    private int studentId;
    private String studentName;
    private List<Course> course;

    public Student(int studentId, String studentName, List<Course> course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
