package com.training.controllers;

import java.util.List;

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


//serviceRequestController
@Controller	
@RequestMapping("/serviceRequest")
public class ServiceRequestController {
	
	
	@Autowired
	private RequestDao requestDao;
	
	@RequestMapping(value="viewAllRequest", method=RequestMethod.GET)
	public String findCustomer(Model model){
		List<Request> listRequests = requestDao.getAll();
		model.addAttribute("listRequests", listRequests);
		return "ShowAllRequest";
	}	
	
	@RequestMapping(value="viewRequest", method=RequestMethod.GET)
	public String findCustomer(@RequestParam("key") int key, Model model){
		Request request = requestDao.get(key);
		model.addAttribute("singleRequest", request);
		return "ShowSingleRequest";
	}
	
	
	
	//submit the form
	@RequestMapping(value="/addRequest", method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Request request, Model mdl){
		requestDao.add(request);
		mdl.addAttribute("statusMsg", "Your request is added.");
		return "AddRequest";
	}
}
