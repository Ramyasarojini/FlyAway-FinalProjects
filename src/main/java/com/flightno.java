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
 * Servlet implementation class flightno
 */
public class flightno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<div align=\"center\"><b><h1>FLYAWAY</h1></b></div></br></br>");
		out.println("<br><br><b><a href='Premises'>Main Menu</a></b></br></br>");
		out.println("<h3><b><font color='red'>List of FlightNo Available</font> </b></h3>");
		out.println("<table><tr><th><b><u>FlightNo</u></b></th></tr>");
		try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");                                                         
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
					Statement smt=con.createStatement();
					ResultSet rs=smt.executeQuery("select flightno from userin");
					
					while(rs.next()) {
						out.println("<tr><th>"+rs.getInt(1) +"</th></tr>");
						
					}
					out.println("</table>");
					smt.close();
					con.close();
					
				}
				catch (Exception e){
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
