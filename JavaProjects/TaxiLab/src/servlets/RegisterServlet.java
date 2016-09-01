package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		 HttpSession session = request.getSession();
	//	 String name = request.getParameter("name");
	 //    String email = request.getParameter("email");
	//	 String password = request.getParameter("password");
	//	 long phonenumber = Long.parseLong(request.getParameter("phonenumber"));
	//	 String city = request.getParameter("city");
		 TaxiUser obtaineduser = (TaxiUser)session.getAttribute("taxiuser");
		 System.out.println(obtaineduser.toString());
		 TaxiService tservice = new TaxiService();
		 int  output = tservice.addTaxiUser(obtaineduser);
		 if(output == 0){
			 request.setAttribute("Error", "Your email already exists."); 
		 }else{
			 request.setAttribute("Status", "Thank you for registering " + obtaineduser.getEmail()); 
		 }
	
		 
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		 requestDispatcher.forward(request, response);
	}

}
