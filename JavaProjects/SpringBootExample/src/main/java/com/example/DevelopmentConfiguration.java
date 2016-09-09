package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfiguration {
	@Bean
	public MyDataSource developmentDB(){
		return new MyDataSource("Derby", "DerbyURL");
	}
}
