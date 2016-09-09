package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//replaces all xml to create the beans
@Configuration
public class MyConfiguration {
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
