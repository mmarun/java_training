package org.javaTutorials;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentInfo implements StudentInterface{

   // private EmailSender emailSender;
    private static StudentInfo student1;
    static String name;
    static int id;

      @Override
    public void addStudent(String name,int i) {
        student1.name=name;
        student1.id=i;

    }

    @Override
    public void printStudent() {

        System.out.println(this.name + "--------"+ this.id);
    }
}
