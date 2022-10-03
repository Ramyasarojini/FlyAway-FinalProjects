package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.be.Userin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Addflights
 */
public class Addflights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addflights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flno=request.getParameter("flightno");
		String airlinename=request.getParameter("airlines");
		String farrtime=request.getParameter("arrivaltime");
		String fdeparttime=request.getParameter("depaturetime");
		String fdestination=request.getParameter("destination");
		String fsource=request.getParameter("source");
		String ffare=request.getParameter("flightfare");
		
		PrintWriter out=response.getWriter();
		if(flno=="")
		{
			flno= "0";
			
		}
		if(ffare=="")
		{
			ffare="0";
		}
        int flightno=Integer.parseInt(flno);
        float flightfare=Float.parseFloat(ffare);
		
        if(flightno !=0 && airlinename !=" " && fsource !=""&& fdestination !="" && fdeparttime !=" " && farrtime !=" " && flightfare !=0)
        {
		try {
			Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction trx=session.beginTransaction();
			 
			Userin obj=new Userin(flightno,airlinename,farrtime,fdeparttime,fdestination,fsource,flightfare);
			session.save(obj);
			trx.commit();
			session.close();
			
		   }catch(Exception e)
		{
			   System.out.println(e);
		}
		
            RequestDispatcher rd=request.getRequestDispatcher("Addflight.jsp");
        	rd.include(request,response);
                     
        	out.println("<center><span style='color:green'> Flight No "+flightno+" is added</span></center>");
        }
        if(flightno==0 || airlinename==" "|| fsource==""||fdestination==" "||fdeparttime==""||farrtime==""||flightfare==0 )
        {
        	RequestDispatcher rd=request.getRequestDispatcher("Addflight.jsp");
        	rd.include(request, response);
        	out.println("<center><span style='color:yellow'> Missing Inputs</span></center>");
        }
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
