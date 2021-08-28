package com.javaTutorials.comprehensiveApp;

import org.springframework.stereotype.Service;

public interface StudentService {
    Student add(Student student);
    Student getStudent(Long rollNumber);
}
