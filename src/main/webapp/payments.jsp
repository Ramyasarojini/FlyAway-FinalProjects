<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random" %>
<%@page import="com.paymentcheck" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>End Phase</title>
</head>
<body>
<%

  String amount=paymentcheck.amount;

%>

<div align="center">
        <b><h1> &#9989; Payment Successful ! </h1></b>
        <h3>Thank you! Your Booking has been confirmed.</h3><br><br>
        Total Amount Paid :&nbsp;<%=amount %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<br>
		
		<b><h4>Your booking details have been sent to your mail.</h4></b><br><br>
		<form action="Welcome.jsp"><input type="submit" value="Done"></form><br>
</div>

</body>
</html>