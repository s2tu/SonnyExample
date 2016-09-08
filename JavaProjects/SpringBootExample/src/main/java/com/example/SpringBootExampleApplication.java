package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootExampleApplication.class, args);
		Book book = ctx.getBean(Book.class);
		System.out.println(book);
	}
}
