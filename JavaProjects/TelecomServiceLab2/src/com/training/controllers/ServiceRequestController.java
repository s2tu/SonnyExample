package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.dao.RequestDao;
import com.training.domains.Request;



@Controller
@RequestMapping("/serviceRequest")
public class ServiceRequestController {
	
	//private RequestDao requestDao;
	

	/*
	@RequestMapping(value="viewRequest", method=RequestMethod.GET)
	public String findCustomer(@RequestParam("key") int key, Model model){
		
		
		//Customer foundCustomer = custdao.find(key);
		//model.addAttribute("foundCustomer", foundCustomer);
		Request request = requestDao.get(key);
		model.addAttribute("foundRequest", request);
		return "ViewRequest";
	}
	
	//submit the form
	@RequestMapping(value="/addRequest", method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Request request, Model mdl){
		requestDao.add(request);
		return "AddRequest";
	}*/	
}
