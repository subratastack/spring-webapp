package com.subrata_education.spring_webapp;

import com.subrata_education.spring_webapp.controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringWebappApplication.class, args);

		/* BookController bc = ctx.getBean(BookController.class);
		System.out.println(bc.getBooksForContext());*/
	}

}
