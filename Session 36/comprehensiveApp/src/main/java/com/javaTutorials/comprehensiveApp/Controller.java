package com.javaTutorials.comprehensiveApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class Controller {

    private StudentService studentService;

    @Autowired
    public Controller(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/{rollNumber}")
    public Student getStudent(@PathVariable Long rollNumber){
        return studentService.getStudent(rollNumber);
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        return studentService.add(student);
    }
}
