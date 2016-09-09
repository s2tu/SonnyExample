package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domains.TestReport;

//Moment you add the restController it knows to return a JSON object
//jackson-databine does this
@RestController
public class GreetingController {
	private HashMap<String,TestReport> reports;
	@PostConstruct
	public void init(){
		reports = new HashMap<String,TestReport>();
		reports.put("Report1",new  TestReport(1, "Sonny", "SomeType", "Awesome"));
		reports.put("Report2",new  TestReport(2, "Sonny2", "SomeType2", "Awesome2"));
		reports.put("Report3",new  TestReport(3, "Sonny3", "SomeType3", "Awesome3"));
	}
	@RequestMapping("/")
	public  String welcome(){
		return "Welcome to Rest Using Spring Boot";
	}
	
	@RequestMapping("/findAll")
	public Map<String,TestReport> getReports(){
		return reports;
	}
	
	

}
