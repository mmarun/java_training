package org.example.Interfaces;

import org.example.Employee;

public interface IEmailSender {
    void sendEmail(Employee employee,IEmailContent content);
}
