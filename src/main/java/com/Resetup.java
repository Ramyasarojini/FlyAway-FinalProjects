package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resetup
 */
public class Resetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pss=request.getParameter("uppassword");
		
		PrintWriter out=response.getWriter();
		if(pss!="") {
			
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
			     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flyaway","root","root"); 
				 PreparedStatement smt=con.prepareStatement("update admin set Password=? where Emailid=?");
				 
				 smt.setString(1, pss);
				 smt.setString(2,"ramya@gmail.com");
				 smt.execute();
			 }
			catch(Exception e) {
				System.out.println(e);
			}
			RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
			rd.include(request, response);
			out.println("<center><span style='color:blue'>Password has Resetted Successfully</span></center>");
		}
		if(pss=="")
		{
			RequestDispatcher rd=request.getRequestDispatcher("changepassword.jsp");
			rd.include(request, response);
			out.println("<center><span style='color:pink'> Please Fill the Above Correctly </span></center>");
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
