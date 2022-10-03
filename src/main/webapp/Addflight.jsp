<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Flights Details</title>
</head>
<body>
<font color="green">  
<div align="center">
<b><h1>FLYAWAY</h1></b>
<b><h3>Please FillUp the Below Details to Add</h3></b>
<form action="Addflights "method=" post"><br/>
<table>
              <tr>
              <td>Flightno</td>
              <td><input type="text" name="flightno" ></td>
              </tr>
              <tr>
              <td>Airlines</td>
              <td><input type="text" name="airlines" ></td>
              </tr>
              <tr>
              <td>Arrivaltime</td>
              <td><input type="time" name="arrivaltime" ></td>
              </tr>
              <tr>
              <td>Departuretime</td>
              <td><input type="time" name="depaturetime"></td>
              </tr>
              <tr>
              <td>Destination</td>
              <td><input type="text" name="destination"></td>
              </tr>
              <tr>
              <td>Source</td>
              <td><input type="text" name="source"></td>
              </tr>
              <tr>
              <td>Flightfare</td>
              <td><input type="text" name="flightfare"></td>
              </tr>
             
        
</table>
<br/><br/>
<input type="submit"  value="Save">
<br/><br/>
<br/><br/>
<b><a href='Premises'> Go Back</a></b>
</form>
</font>
</div>
</body>
</html>