package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Premises
 */
public class Premises extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Premises() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<div align=\"center\"><b><h1>FLYAWAY</h1></b></div><br/><br/>");
		out.println("<div align =\"center\"><b><h3>Welcome to your Dashboard </h3><b></div><br/>");
		
		
		out.println("<div align=\"center\"><b><a href='changepassword.jsp'> Change Password</a></b></div><br/>");
		out.println("<div align=\"center\"><b><a href='Addflight.jsp'> Add FlightDetails</a></b></div><br/>");
		out.println("<div align=\"center\"><b><a href='listairlines'> List of Airlines</a></b></div><br/>");
		out.println("<div align=\"center\"><b><a href='listflights'> List of Flights</a></b></div><br/>");
		out.println("<div align=\"center\"><b><a href='listsourcedestination'> List of Source and Destination</a></b></div><br/>");
		out.println("<div align=\"center\"><b><a href='flightno'> FlightNo Details</a></b><div><br/>");
		out.println("<div align=\"center\"><b><a href='Welcome.jsp'> Logout</a></b></div><br/>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
