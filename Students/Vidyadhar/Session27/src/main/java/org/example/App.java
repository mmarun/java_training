package org.example;

import org.example.Interfaces.IEmailContent;
import org.example.Interfaces.IEmailSender;
import org.example.Interfaces.IEmployee;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Nitesh", 112233);
        Employee emp2 = new Employee("Nitin", 445566);
        System.out.println(emp1);


        IEmailContent emailContent1=new EmailContent("Hi GoodMorning");

        IEmailSender sendMsg1 =new EmailSender();
        sendMsg1.sendEmail(emp1,emailContent1);

        IEmailContent emailContent2=new EmailContent("Hi GoodAfternoon");
        IEmailSender sendMsg2 =new EmailSender();
        sendMsg2.sendEmail(emp2,emailContent2);
    }
}
