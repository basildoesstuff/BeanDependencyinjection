package com.dependency.injection;

import MyBean.Pet;
import config.projectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(projectConfig.class)){
			var b1 =context.getBean("Tommy",Pet.class);
			System.out.println(b1.getName());

			var b2 =context.getBean("Brian",Pet.class);
			System.out.println(b2.getName());

		}
	}

}
