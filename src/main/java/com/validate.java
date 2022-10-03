package com;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.to.Info;

/**
 * Servlet implementation class validate
 */
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			PrintWriter out=response.getWriter();
			String sDate1=request.getParameter("udate");
			String from=request.getParameter("ufrom");
			String to=request.getParameter("uto");
			String person=request.getParameter("uperson");
			
			
			if(!from.equals(to) && sDate1!=" ")
			{
				RequestDispatcher rd=request.getRequestDispatcher("flightServlet");
				rd.forward(request,response);
			}
			if(from.equals(to)|| sDate1==" ")
			{
				RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
				rd.include(request,response);
				out.println("<center><span style='color:red'>Please Check the Inputs Once</span></center>");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
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
