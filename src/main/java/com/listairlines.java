package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listairlines
 */
public class listairlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listairlines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("<div align=\"center\"><b><h1>FLYAWAY</h1></b></div><br/><br/>");
		out.println("<br><br><b><a href='Premises'>Main Menu</a></b></br></br>");
		out.println("<b><h3>List of Airlines</h3></b>");
		out.println("<table><font color='green'><tr><th><b><u>Airlines Name</u></b></th></tr><br/><br/>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select distinct airlines from userin");
			
			while(rs.next())
			{
				out.println("<tr><th>"+"<font color='red'>"+rs.getString(1)+ "</font>"+"</th></tr>");
				
			}
			
			out.println("</table>");
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
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
