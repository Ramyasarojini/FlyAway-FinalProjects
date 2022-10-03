package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminVerify
 */
public class adminVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        private String eml;
        private String pswrd;
    public adminVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Emailid=request.getParameter("emailid");
		String Password=request.getParameter("upassword");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flyaway","root","root");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from admin");
			
			while(rs.next())
			{
				if(rs.getString(1).equals(Emailid))
				{
					eml=rs.getString(1);
					pswrd=rs.getString(2);
				}
			}
			
			RequestDispatcher rd=null;
			if(Password.equals(pswrd)&& Emailid.equals(eml))
			{
				rd=request.getRequestDispatcher("Premises");
				rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("AdminLogin.jsp");
				PrintWriter out =response.getWriter();
				rd.include(request, response);
				out.println("<center> <span style='color:red'>Invalid Credentials</span></center>");
			}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
