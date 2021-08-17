package org.javaTutorials;

public class EmailSender implements StudentEmailSender{
    @Override
    public void emailSend(StudentInfo studentInfo, String content) {

        System.out.println("Hi  "+ studentInfo.name+"========"+content);
    }
}
