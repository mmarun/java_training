package com.javatutorials.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Starting the Application");
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		MsgBean bean=(MsgBean) context.getBean("messageBean");
		MsgBean bean1=(MsgBean) context.getBean("newMessageBean");

		MsgBean msgBean=(MsgBean) context.getBean("messageBean");
		MsgBean newMessageBean=(MsgBean) context.getBean("newMessageBean");

		Boolean messagesEqual= bean==msgBean;
		System.out.println("Are the message beans equal " + messagesEqual);

		Boolean newMessageequal= bean1==newMessageBean;
		System.out.println("Are the New message bean Equal  " + newMessageequal);

		bean.message("Sanju");
		bean1.message("Sanju");
		System.out.println("Ending Application");
	}

}
