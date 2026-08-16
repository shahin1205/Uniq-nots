package com.studentManagement.studentManagement.model;

public class Course {

    private int courseID;
    private String courseName;
    private String trainerName;

    public Course() {}

    public Course(int courseID, String courseName, String trainerName) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.trainerName = trainerName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
