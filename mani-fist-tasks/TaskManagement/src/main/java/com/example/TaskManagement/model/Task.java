package com.example.TaskManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

enum TaskStatus{
    TODO,
    COMPLETE,
    BENDING
}
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer taskID;
            private String taskName;
            private String studentName;
            private LocalDate taskDate;
            private TaskStatus taskStatus;


    public Task() {
    }

    public Task(Integer taskID, String taskName, String studentName, LocalDate taskDate, TaskStatus taskStatus) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.studentName = studentName;
        this.taskDate = taskDate;
        this.taskStatus = taskStatus;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
