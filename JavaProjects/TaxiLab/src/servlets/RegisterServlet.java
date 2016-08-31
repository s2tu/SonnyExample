package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domains.TaxiUser;
import managers.TaxiService;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//do nothing
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
	     String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 long phonenumber = Long.parseLong(request.getParameter("phonenumber"));
		 String city = request.getParameter("city");
		 TaxiService tservice = new TaxiService();
		 int  output = tservice.addTaxiUser(new TaxiUser(name, email, password, phonenumber, city));
		 if(output == 0){
			 request.setAttribute("RegisterError", "Your email already exists."); 
		 }else{
			 request.setAttribute("Registered", "Thank you for registering " + email); 
		 }
	
		 
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		 requestDispatcher.forward(request, response);
	}

}
