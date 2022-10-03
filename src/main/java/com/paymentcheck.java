package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class paymentcheck
 */
public class paymentcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static String amount;
    public static String id;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		 String cardnum=request.getParameter("cardno");
		 String month=request.getParameter("month");
		 String pswrd=request.getParameter("psd");
		 if (cardnum=="") {
				cardnum = "0";
			}
		 Long cardno=Long.parseLong(cardnum);
		 
		 RequestDispatcher rd =null;
		if(cardno!=0 && month!="" && pswrd!="") {
			 amount=request.getParameter("amt");
			 id=request.getParameter("order");
			 
			 
			 rd =request.getRequestDispatcher("payments.jsp");
			 rd.forward(request, response);
		}
		else {
			rd =request.getRequestDispatcher("pay.jsp");
			rd.include(request, response);
			out.println("<br><b><center> <span style = 'color:red'>Hello user! Card details entered is wrong . </span> </center></b>");
			
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
