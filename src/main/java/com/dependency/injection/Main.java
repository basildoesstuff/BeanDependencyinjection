package com.dependency.injection;

import MyBean.pet;
import config.projectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(projectConfig.class)){
			var b1 =context.getBean(pet.class);
			System.out.println(b1.getName());
		}
	}

}
