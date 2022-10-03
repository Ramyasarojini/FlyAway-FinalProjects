<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Verify</title>
</head>
<body>
  
 
   <div align="center">
         <b><h1>FLYAWAY</h1></b>
         <form action="adminVerify" method="post"><br/>
             <table>
              <tr>
              <td>Email Id</td>
              <td><input type="text" name="emailid" ></td>
              </tr>
              <tr>
              <td>Password</td>
              <td><input type="password" name="upassword"></td>
             </tr>
             </table><br/>
             <input type="submit" value="login">
  
</form>
</div>
</body>
</html>