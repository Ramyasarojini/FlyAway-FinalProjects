<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<%@page import="java.text.SimpleDateFormat " %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlyAway.welcome</title>
</head>
<body>

 <%
 
  Date dNow=new Date();
  SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
  String dt1=ft.format(dNow);
  Calendar cal=Calendar.getInstance();
  cal.add(Calendar.DAY_OF_MONTH,180);
  String dt2=ft.format(cal.getTime());
  Calendar cal2=Calendar.getInstance();
  cal2.add(Calendar.DAY_OF_MONTH,1);
  String tmdt=ft.format(cal2.getTime());
  
  %>
  
  
  <div align="center">
     <b><h1>FLYAWAY</h1></b><br/><br/>
     <b><h2>WELCOME TO FLYAWAY BOOKING PORTAL</h2></b>
     <h4 align="right"> -developed by M Ramya Sarojini </h4>
     
     <br/><br/>
     
     
     <b><h1>Book Flight Tickets</h1></b>
     <form action="validate" method="post"><br/>
     <table>
     <tr>
               <td><b>Date of Departure</b></td>
               <td><input type="date" name="udate" min=<%=dt1%> max=<%=dt2%> value=<%=tmdt%>></td>
     </tr>
     <tr>
               <td><b>From</b></td>
               <td><select name="ufrom">
               <option value="Chennai">Chennai</option>
               <option value="Banglore">Banglore</option>
               <option value="Mumbai">Mumbai</option>
               </select></td>
      </tr>
      
    
      <tr>
                 <td><b>To</b></td>
               <td><select name="uto">
               <option value="Chennai">Chennai</option>
               <option value="Banglore">Banglore</option>
               <option value="Mumbai">Mumbai</option>
               </select></td>       
       </tr>
       
       <tr>
               <td><b> No of Persons</b></td>
               <td> <select name="uperson">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
               </select></td>
               
       </tr>
    </table>
    <br/>
    <input type="submit" value="Search">
    <br/>
    <br/>
    <b><a href='AdminLogin.jsp'> Admin Login</a></b>
  </form>
  </div>
  </body>
  </html>