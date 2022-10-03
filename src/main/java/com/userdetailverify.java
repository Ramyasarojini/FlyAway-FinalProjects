package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userdetailverify
 */
public class userdetailverify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userdetailverify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nop=Integer.parseInt(flightServlet.person);
		int i=1;
		int verify=0;
		
		PrintWriter out =response.getWriter();
		
		for(i=1;i<=nop;i++) {
			String name=request.getParameter("uname"+String.valueOf(i));
			String email=request.getParameter("uemail"+String.valueOf(i));
			String number=request.getParameter("umobile"+String.valueOf(i));
			if (number=="") {
				number = "0";
			}
			Long mobile=Long.parseLong(number);
			
			if(name!="" && email!=null && mobile!=0) {
				verify+=1;
			
			}
		}
		
		RequestDispatcher rd =null;

		if(verify==nop){
			
			rd =request.getRequestDispatcher("bookin");
			rd.forward(request, response);	
		}
		else {
			
			rd =request.getRequestDispatcher("Userdetails.jsp");
			rd.include(request, response);
			out.println("<br><b><center> <span style = 'color:red'>Hello user! please enter details of person correctly.  </span> </center></b>");
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
