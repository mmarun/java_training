package com.javatutorials.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class MessageBean implements MsgBean {
    @Override
    public void message(String msg) {
        System.out.println("Hi  " + msg);
    }
}
