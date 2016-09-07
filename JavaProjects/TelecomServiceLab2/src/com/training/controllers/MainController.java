package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.Request;

@Controller
public class MainController {
	@RequestMapping("/")
	public String welcomePage(){
		return "Index";
	}
	
	
	@Autowired
	private ModelAndView mdlView;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView initForm(){
		mdlView.setViewName("AddRequest");
		mdlView.addObject("command", new Request());
        return mdlView;

	}	

	@RequestMapping("/viewRequest")
	public String viewRequest(){
		return "ViewRequest";
	}	
}
