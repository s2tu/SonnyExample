package com.training.filters;

import java.io.IOException;
import org.apache.log4j.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoggingFilter
 */
public class LoggingFilter implements Filter {

  
    private static final Logger log = Logger.getRootLogger();
    
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	  // pass the request along the filter chain
	  
	  //request preprocessing 
	  //this part acts only as a request 
	  HttpServletRequest req = (HttpServletRequest) request;
	  
	  String url = req.getRequestURL().toString();
	  
	  log.debug("Request From " + url);
	  chain.doFilter(request, response);  //the get method is called here
	  
	  //response post processing 
	  //this part acts only has a response
	  if(req.getRequestURI().equals("/FiltersAndListeners/MyServlet")){
		  response.getWriter().println("Claim Your Free Gift");
	  }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
