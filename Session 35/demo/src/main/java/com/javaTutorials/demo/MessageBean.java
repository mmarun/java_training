package com.javaTutorials.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class MessageBean implements MsgBean {

    @Override
    public void message(String msg) {
        System.out.println("Hello " + msg);
    }
}
