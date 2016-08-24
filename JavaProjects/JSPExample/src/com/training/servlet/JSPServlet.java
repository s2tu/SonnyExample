package com.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.PaymentStatus;
import com.training.domains.StatusFinder;

/**
 * Servlet implementation class JSPServlet
 */
public class JSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		long phoneNumber = Long.parseLong(request.getParameter("phonenumber"));  
		StatusFinder myFinder = new StatusFinder();
		
		List<PaymentStatus> myPayStats = myFinder.getPayStatus(phoneNumber);
		
		request.setAttribute("payHistory", myPayStats);
	
		RequestDispatcher view =request.getRequestDispatcher("/FirstExample.jsp");

		view.forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
