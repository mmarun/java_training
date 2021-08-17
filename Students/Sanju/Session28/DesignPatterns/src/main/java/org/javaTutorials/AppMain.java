package org.javaTutorials;


public class AppMain {


    public static void main( String[] args ) {

        StudentInterface student=new StudentInfo();
       student.addStudent("Sanju",100);
       student.printStudent();



       StudentEmailSender sendEmail=new EmailSender();
       sendEmail.emailSend((StudentInfo) student,"This is the content");

    }
}
