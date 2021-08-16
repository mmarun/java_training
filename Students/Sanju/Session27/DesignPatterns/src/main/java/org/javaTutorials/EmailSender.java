package org.javaTutorials;

public class EmailSender implements StudentEmailSender{
    @Override
    public void emailSend(Student student, String content) {
        System.out.println(content);
    }
}
