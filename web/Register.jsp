<%@page import="code.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Form</title>
    </head>
    <body>
          <jsp:useBean id="user" scope="request" class="code.User"></jsp:useBean>
           <form action="RegisterServlet" method="post">
        <table>
            <center>
            <tr>
                <th>Register Form</th>
            </tr>
            
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="<jsp:getProperty name="user" property="firstName"/>"></td>
            </tr>
            
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" value="<jsp:getProperty name="user" property="lastName"/>"></td>
            </tr>
            
            <tr>
                <td>Username:</td>
                <td><input type="text" name="userName" value="<jsp:getProperty name="user" property="userName"/>"></td>
            </tr>
            
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" value="<jsp:getProperty name="user" property="password"/>"></td>
            </tr>
             
            <tr>
                            <td><center><input type="reset" value="Reset" /></center></td>
                            <td><center><input type="submit" value="Register"></center></td>
                        </tr>
         
        </table>
          </center>
           </form>
    </body>
</html>
