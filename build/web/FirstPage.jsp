<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="code.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
   
   
        
    <frameset rows="80,*" cols="*">
        <frame src="Greeting.jsp" name="topFrame" scrolling="no" noresize> </frame> 
   <frameset cols="150,*">

       <frame src="LeftFrame.jsp" name="leftFrame" scrolling="no" noresize>  </frame>
           
       <frame src="RightFrame.jsp" name="rightFrame"> </frame>
    
   </frameset>
 </frameset>
        
 
</html>
