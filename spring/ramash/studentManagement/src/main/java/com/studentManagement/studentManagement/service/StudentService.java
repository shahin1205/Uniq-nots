package com.studentManagement.studentManagement.service;


import com.studentManagement.studentManagement.model.Course;
import com.studentManagement.studentManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {

    List<Course> courseList=new ArrayList<>();
    List<Student> students=new ArrayList<>();

    public List<Course> addCourse(List<Course> course){
        courseList.addAll(course);
        return courseList;
    }

    public List<Student> addStudent(List<Student> student){
        students.addAll(student);
        return students;
    }

    public List<Student> getStudent(){
        return students;
    }

    public String addCourseToStudent(int studentID, int courseID){

        for (Student student: students ){
            if (student.getStudentId()==studentID){
                for (Course course:courseList){
                    if (course.getCourseID()==courseID){
                        student.getCourse().add(course);
                        return "add successfully";
                    }
                }
            }
        }
        return "not found";
    }

    public String removeCourse(int studentID, int courseID){
        for (Student student: students ){
            if (student.getStudentId()==studentID){
                for (Course course:courseList){
                    if (course.getCourseID()==courseID){
                        student.getCourse().remove(course);
                        return "remove course";
                    }
                }
            }
        }
        return "not found";
    }

    public String updateCourse(int studentID, int courseID , Course update){
        for (Student student: students ){
            if (student.getStudentId()==studentID){
                for (Course course:student.getCourse()){
                    if (course.getCourseID()==courseID){
                        course.setCourseName(update.getCourseName());
                        course.setCourseID(update.getCourseID());
                        return "update course";
                    }
                }
            }
        }
        return "not found";
    }



    ///------------------------------------------------------
//
//    public String updateCourse(int studentID, int oldCourseID, int newCourseID){
//
//        for(Student student : students){
//
//            if(student.getStudentId() == studentID){
//
//                List<Course> studentCourses = student.getCourse();
//
//                for(int i = 0; i < studentCourses.size(); i++){
//
//                    if(studentCourses.get(i).getCourseID() == oldCourseID){
//
//                        for(Course course : courseList){
//
//                            if(course.getCourseID() == newCourseID){
//
//                                studentCourses.set(i, course);
//
//                                return "Course Updated Successfully";
//                            }
//                        }
//
//                        return "New Course Not Found";
//                    }
//                }
//
//                return "Old Course Not Assigned To Student";
//            }
//        }
//
//        return "Student Not Found";
//    }
}
