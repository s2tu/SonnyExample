package servlets;

import java.io.IOException;
import java.util.logging.Level;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domains.TaxiOnDutyData;
import loggers.GlobalLogger;
import managers.TaxiService;

/**
 * Servlet implementation class OccupyTaxiServlet
 */
public class OccupyTaxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OccupyTaxiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TaxiService tservice = new TaxiService();
		String cabID = request.getParameter("cabID");
	
		tservice.changeCabAvailablity(cabID);
		
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("booking.jsp");
		request.setAttribute("Status", "You have booked the Taxi!");
		requestdispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
