package com.javatutorials.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MsgHandler {

    @Autowired
    @Qualifier("messageBean")
    private MsgBean msgBean;

    public void handleMessage(){
        msgBean.message("Mathew");
    }


}
