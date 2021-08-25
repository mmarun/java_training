package org.example;

import org.example.Interfaces.IEmailContent;
import org.example.Interfaces.IEmailSender;

public class EmailSender implements IEmailSender {

    @Override
    public void sendEmail(Employee employee,IEmailContent content) {
        System.out.println("The mailSent");
        System.out.println(employee);
        System.out.println("The Content :"+content);
    }


}
