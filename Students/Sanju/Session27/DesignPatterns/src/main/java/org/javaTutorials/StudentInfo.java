package org.javaTutorials;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class StudentInfo implements StudentInterface{


    private EmailSender emailSender;
    private String name;

    public StudentInfo() {

    }

    @Override
    public Student getstudentId(int id) {
        return null;
    }

    @Override
    public void addStudent(Student student) {
    this.getstudentId(student.id);
    this.name=student.name;
    }
}
