
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="code.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting</title>
    </head>
    <body>
    <center >
    <%  
            HttpSession sessionUser=request.getSession(false);  
            String us=(String)sessionUser.getAttribute("userName");
            
            User user= new User();
            user.setUserName(us);
            user.GetUser();
            
            out.print("Welcome ");
            out.print(user.getFirstName());
            out.print(" ");
            out.print(user.getLastName());
            out.print(".");
        %>
    </center>
    </body>
</html>
