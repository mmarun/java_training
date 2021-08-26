package com.javaTutorials.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class NewMessageBean implements MsgBean {
    @Override
    public void message(String msg) {
        System.out.println("Greetings Mr - " + msg);
    }
}
