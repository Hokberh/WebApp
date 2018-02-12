<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="code.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <jsp:useBean id="user" scope="request" class="code.User"></jsp:useBean>
        <form action="LoginServlet" method="post">
            <center>
        <table>
            <tr>
                <th>Login Form</th>
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
                <td><a href="Register.jsp">Register</a></td>
                <td><input type="submit" value="Login"></td>
            </tr>
        
        </table>
        </center>
        </form>
        
    </body>
</html>
