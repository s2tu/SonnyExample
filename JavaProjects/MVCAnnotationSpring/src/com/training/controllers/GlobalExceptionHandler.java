package com.training.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	@Autowired
	private ModelAndView mdl;
	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView globalHandler(HttpServletRequest req, Exception ex){
		mdl.setViewName("error");
		mdl.addObject("cause", ex.getMessage());
		mdl.addObject("exceptionClass", ex.getClass());
		mdl.addObject("requestUri", req.getRequestURI());		
		mdl.addObject("message", "Primary key already exists.");
		return mdl;
	}
}
