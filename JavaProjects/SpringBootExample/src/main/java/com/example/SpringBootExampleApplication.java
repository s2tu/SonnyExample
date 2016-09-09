package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SpringBootExampleApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootExampleApplication.class, args);
	
		Book book = ctx.getBean(Book.class);
		System.out.println(book);
		
		//after creating the configuration we can get the RestTemplate bean
		/*
		RestTemplate template = ctx.getBean(RestTemplate.class);
		String response = template.getForObject("http://localhost:4040/findAll", String.class);
		System.out.println(response);
		*/
		
		MyDataSource  datasource = ctx.getBean(MyDataSource.class);
		System.out.println(datasource);
	}
}
