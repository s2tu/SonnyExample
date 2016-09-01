package servlets;

import java.io.IOException;
import java.util.logging.Level;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loggers.GlobalLogger;
import managers.TaxiService;

/**
 * Servlet implementation class BookingServlet
 */
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
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
		//determine which radio button is not null
		boolean booklater = request.getParameter("booking").equals("booklater"); 
		boolean booknow = request.getParameter("booking").equals("booknow"); 
		GlobalLogger.infolog.log(Level.INFO, "BookLater " + booklater  + " BookNow " + booknow);
		String relocation = "";
		TaxiService tservice = new TaxiService();
		if(booknow){
			//forward to the data to the new page
			
			//add the booking here
			
			request.setAttribute("cabData", tservice.getAvailableCabs(request.getParameter("pickup")));
			relocation = "availability.jsp";
			
		}else{
			if(booklater){
			
				//add the booking here
				
				//add the entry values into the database
				request.setAttribute("Status", "Your cab is now booked!");
				relocation = "index.jsp";
			}		
		}
		
		RequestDispatcher requestdispatcher = request.getRequestDispatcher(relocation);
		requestdispatcher.forward(request, response);
		
				
		
	}

}
