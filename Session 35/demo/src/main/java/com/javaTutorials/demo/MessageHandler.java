package com.javaTutorials.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler {

    //private fields
    //Constructor
    //setter
    @Autowired
    @Qualifier("messageBean")
    private MsgBean myBean;

    public void handleMessage(){
        myBean.message("Yogesh");
    }
}
