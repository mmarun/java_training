package com.javatutorials.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class NewMessageBean implements MsgBean{

    @Override
    public void message(String msg) {
        System.out.println("We are in new Message Bean  "+ msg);
    }
}

