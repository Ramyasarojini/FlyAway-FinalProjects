<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.flightServlet2"%>
<%@page import="com.flightServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserDetails</title>
</head>
<body>


   <%
   String flightno=flightServlet2.flightId;
   int nop=Integer.parseInt(flightServlet.person);
   String person=String.valueOf(nop);
   int i=1;
   
   
   %>
   
       <div align="center">
       <b><h1>FLYAWAY</h1></b>
       <h3><b>ENTER DETAILS HERE</b></h3>
       <form action="userdetailverify" method="post"><br><br>
       
       <% for(i=1;i<=nop;i++) { %>
         <label><b>Person <%=i %></b></label>
       <table>
       <tr>
       <td><b>Name</b></td>
       <td><input type="text" name="uname<%=i%>" ></td>
       </tr>
       <tr>
       <td><b>Gender</b></td>
       <td><select name="ugender<%=i%>">
           <option value="Male">Male</option>
           <option value="Female">Female</option>
           <option value="other">Other</option>
       
       </select> 
       </td>
       </tr>
       <tr>
       <td><b>Age</b></td>
       <td><input type="number" name="uage<%=i%>" min=1 max=100 value=1></td>
       </tr>
       <tr>
       <td><b>Email Id</b></td>td>
       <td><input type="email" name="uemail<%=i%>" ></td>
       </tr>
       <tr>
       <td>Mobile No</td>
       <td><input type="tel" name="umobile<%=i%>" ></td>
       </tr>
       </table>
        
        <%} %>           
       
       
         
         <br><input type="submit" name="add" value="continue">
       
       </form>
       
       
  </div>   
    
</body>
</html>