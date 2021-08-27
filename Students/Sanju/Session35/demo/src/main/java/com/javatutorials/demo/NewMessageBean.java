package com.javatutorials.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
@Primary
public class NewMessageBean implements MsgBean{

    @Override
    public void message(String msg) {
        System.out.println("We are in new Message Bean  "+ msg);
    }
}

