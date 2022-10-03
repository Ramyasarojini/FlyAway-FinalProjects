<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.bookin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Gateway</title>
</head>
<body>
   <%
   
   String amount=bookin.price;
   
   
   %>
   <div align="center">
		<i><h1>FLYAWAY</h1></i><br>
		<h2>PAY</h2>
		<form action=" paymentcheck" method ="post"><br> 
			<table>
				
				<tr>
				<td><b>Order Number</b>&nbsp;&nbsp;&nbsp;<%=bookin.ran %></td>
				</tr>
				<tr>
					<td><b>Total Ticket Fare </b>Rupees</td><td>&nbsp;&nbsp;&nbsp;<%=amount %> /-</td>
				</tr>
			</table><br>
			<h3>Card Payment</h3>
			<table>
				
				<tr>
					<td><b>Card Number</b></td><td><input type ="number" name="cardno"></td>
				</tr>
				<tr>
					<td><b>Expiry Date</b></td><td><input type="month" name="month"  min="2022" max="2200"></td>
				</tr>
				<tr>
					<td><b>Password </b></td><td><input type ="password" name="psd"></td>
				</tr>
			</table><br>
			<input type="submit" value="Proceed to pay"><br><br>
			
			
			<input type="hidden" id="order" name="order" value=<%=bookin.ran %>>
			<input type="hidden" id ="amt" name="amt" value=<%=amount %>>
			
		
		</form>
	</div>

</body>
</html>