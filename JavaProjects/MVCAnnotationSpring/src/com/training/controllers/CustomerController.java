package com.training.controllers;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.CustomerDao;

import com.training.entity.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/addCustomer")
@Import(Customer.class)
public class CustomerController{
	@Autowired
	private ModelAndView mdlView;
	@Autowired
	private Customer cust;
	@Autowired
	private CustomerDao custdao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView initForm(){
		
		mdlView.setViewName("addCustomer");
		mdlView.addObject("command", cust);
        return mdlView;

	}
	

	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("customerAdded") Customer customer, Model mdl){
		int rowAdded = custdao.add(customer);
		mdl.addAttribute("rowAdded", rowAdded);
		return "customerAddedSuccess";
	}	
	
	@RequestMapping(value="findCustomer", method=RequestMethod.GET)
	public String findCustomer(@RequestParam("key") Long key, Model model){
		Customer foundCustomer = custdao.find(key);
		model.addAttribute("foundCustomer", foundCustomer);
		return "ShowCustomer";
	}
	
	@RequestMapping(value="showAll", method=RequestMethod.GET)
	public String findAllCustomers(Model model){
		List<Customer> customerList = custdao.findAll();
		model.addAttribute("CustomerList", customerList);
		return "showAllCustomers";
	}
	
}
