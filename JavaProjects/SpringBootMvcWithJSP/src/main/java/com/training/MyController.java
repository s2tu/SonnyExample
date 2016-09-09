package com.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String welcome(){
		return "index";
	}
	
	@Autowired
	private RestTemplate template;
	
	@Autowired 
	private ModelAndView modelView;
	
	//MUST BE RUNNED WITH RESTWITHBOOT
	@RequestMapping(value="/getReports", method=RequestMethod.GET)
	public ModelAndView viewReports(){
		String reports = template.getForObject("http://localhost:4040/findAll", String.class);
		System.out.println(reports);
		modelView.setViewName("ShowReports");
		modelView.addObject("reports", reports);
		return modelView;
	}
}
