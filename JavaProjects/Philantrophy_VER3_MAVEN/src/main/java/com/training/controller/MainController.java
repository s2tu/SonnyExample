package com.training.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DonorDAO;
import com.training.daos.ProjectDAO;
import com.training.entities.Donation;
import com.training.entities.Donor;
import com.training.entities.Project;

@Controller
public class MainController  {
	
	@Autowired
	private ModelAndView mdlView;
	@Autowired
	private DonorDAO donorDAO;
	
	@Autowired
	ProjectDAO projectDAO;
	//This is the alternate way of doing MVC Spring
	/*
	@Autowired
	private ModelAndView mdlView;

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String message= "Welcome to Spring MVC ";
		mdlView.addObject("msg", message);
		mdlView.setViewName("index");
		return mdlView;
	}
	
*/
	
	@RequestMapping("/")
	public String welcome(){
		return "index";
	}
	
	

	
	@RequestMapping("/getProjects")
	public ModelAndView  getProjects(){
		List<Project> projList = projectDAO.getAll();
		mdlView.addObject("projectsList", projList);
		mdlView.setViewName("AllProjects");
		return mdlView;
	}
	

	@RequestMapping(value="/getProject/{projectID}")
	public ModelAndView getProject(@PathVariable("projectID") long projectID){
		mdlView.addObject("projectID", projectID);
		mdlView.setViewName("Project");
		
		Project obtainedProject  = projectDAO.find(projectID);
		mdlView.addObject("Project", obtainedProject);
		return mdlView;
	}
	@RequestMapping(value="/Donors/{projectID}")
	public ModelAndView  getDonor(@PathVariable("projectID") String projectID){
		mdlView.addObject("projectID", projectID);
		mdlView.setViewName("Donors");
		return mdlView;
	}
	
	
	
}