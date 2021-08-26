package com.javaTutorials.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Start application");
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		MsgBean newMessageBean = (MsgBean)context.getBean("newMessageBean");
		MsgBean messageBean = (MsgBean) context.getBean("messageBean");

		MsgBean newMessageBean1 = (MsgBean)context.getBean("newMessageBean");
		MsgBean messageBean1 = (MsgBean) context.getBean("messageBean");

		Boolean sameNewMessageBean = newMessageBean == newMessageBean1;
		System.out.println("Are new message beans same - " + sameNewMessageBean);

		Boolean sameMessageBean = messageBean == messageBean1;
		System.out.println("Are message Beans same " + sameMessageBean);

		MessageHandler msgHandler = (MessageHandler) context.getBean("messageHandler");
		msgHandler.handleMessage();


		System.out.println("End application");

	}

}
