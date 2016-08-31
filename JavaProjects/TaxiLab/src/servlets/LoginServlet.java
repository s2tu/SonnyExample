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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Does Nothing?
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//the post should be the login 
		//might have to check the form name 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		TaxiService tservice = new TaxiService();
		//The phonenumber/name is not required for validation
		TaxiUser validateUser = new TaxiUser("",email, password, 0, city);
		boolean isValid  = tservice.validate(validateUser);
		request.setAttribute("isValid",isValid);
		
		String relocation = "";
		if(isValid){
			relocation = "booking.jsp";
			request.setAttribute("userData", tservice.getUser(email));
		}else{
			request.setAttribute("Error","Error Msg. Login Failed.");
			relocation = "index.jsp";
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(relocation);
		requestDispatcher.forward(request, response);
		

		
		
	}

}
