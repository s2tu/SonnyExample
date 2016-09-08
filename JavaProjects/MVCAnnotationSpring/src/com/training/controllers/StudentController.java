package com.training.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.exceptions.RangeCheckException;

@Controller
public class StudentController {
	String nextStep = "StudentDetails";
	
	@RequestMapping(value="/getStudentDetails", method=RequestMethod.GET)
	public String findStudent(int rollNumber) throws Exception{
		if (rollNumber > 1000 || rollNumber <=0){
			throw new RangeCheckException(rollNumber);
		}
		return nextStep;
	}
	
	@Autowired
	private ModelAndView mdl;
	
	@ExceptionHandler(value=RangeCheckException.class)
	public ModelAndView errorHandler(HttpServletRequest req, Exception ex){
		mdl.addObject("cause", ex.getMessage());
		mdl.addObject("exceptionClass", ex.getClass());
		mdl.addObject("requestUri", req.getRequestURI());
		mdl.setViewName("Bugs");
		return mdl;
	}
}
