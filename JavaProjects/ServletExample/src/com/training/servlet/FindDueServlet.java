package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.servlet.training.domain.DueCalculator;

/**
 * Servlet implementation class FindDueServlet
 */
public class FindDueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger("myLogger");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindDueServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");
		
		
		log.info("" + number);
		log.info(email);
		
		
		DueCalculator calc = new DueCalculator();
		Double result = calc.findDue(number);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println( result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
		log.info("Servlet destroyed..");

		super.destroy();
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		log.info("Servlet initialized..");

		super.init();
	}

}
