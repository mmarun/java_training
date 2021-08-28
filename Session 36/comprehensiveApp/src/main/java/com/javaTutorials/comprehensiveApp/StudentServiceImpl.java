package com.javaTutorials.comprehensiveApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
    }

    @Override
    public Student add(Student student) {
        Student savedStudent = studentRepo.save(student);
        return savedStudent;
    }

    @Override
    public Student getStudent(Long rollNumber) {
        Student student = studentRepo.findById(rollNumber).get();
        return student;
    }
}
