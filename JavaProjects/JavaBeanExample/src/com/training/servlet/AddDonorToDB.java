package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domains.Donor;
import com.training.utils.DonorDAO;
import com.training.utils.MySQLConnection;

/**
 * Servlet implementation class AddDonorToDB
 */
public class AddDonorToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDonorToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonorDAO donorManager = new DonorDAO();	
		PrintWriter out= response.getWriter();
		
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		Donor d = (Donor) session.getAttribute("donor");
		System.out.println(d);
		try{int rows = donorManager.add(d);
	
			//you can forward to a jsp using the RequestDispatcher 
			//and set the attribute in the request so that you have the value
		
		
			out.println("<html>");
			out.print("<head>");
			out.println("<title>");
			out.print("</title>");
			out.print("</head>");		
			out.println("<body>");
			out.println("<h1 style='text-align:center'>You have added a donor. The number of rows added are " + rows + " </h1>");
			out.print("</body>");	
			out.print("</html>");
		
		}catch(Exception e){
			out.println("<html>");
			out.print("<head>");
			out.println("<title>");
			out.print("</title>");
			out.print("</head>");		
			out.println("<body>");
			out.println("<h1 style='text-align:center'>There was a error adding donor.</h1>");
			out.print("</body>");	
			out.print("</html>");			
			
		}
		
	

	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
