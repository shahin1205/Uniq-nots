package com.springPractice.firstProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProgramApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstProgramApplication.class, args);

		Controller run= context.getBean(Controller.class);
		run.controllerMethod();
//		FreeFire freeFire=new FreeFire();
//		PubG pubG=new PubG();
//
//		Controller controller=new Controller(freeFire);
//		controller.controllerMethod();
	}

}
