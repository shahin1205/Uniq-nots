package com.example.mani_sec_Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceInterface{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
//        return  studentRepository.save(student);
        return studentRepository.saveAndFlush(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(int id, Student student) {
//        Student students=studentRepository.findById(id).get();
        Student students=studentRepository.getReferenceById(id);
        students.setName(student.getName());
        students.setToltal(student.getToltal());
        return studentRepository.save(students);
    }

    @Override
    public String deleteStudent(int id) {

        Student student=null;
        try{
            student=studentRepository.findById(id ).orElseThrow(
                    ()->{throw new RuntimeException("no data found for given id : "+id);});
            studentRepository.delete(student);
            return "remove successfully";
        }catch (RuntimeException e){
            e.getMessage();

        }
        return "Id not found";
    }

    @Override
    public Student getName(String name) {
        return  studentRepository.findByName(name).get();

    }
}
