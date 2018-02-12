<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="code.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Left Frame</title>
    </head>
    <body>
       
        <h3>Table Selection:</h3>
        
        <ul>
            <li> <a href="Product.jsp" name="Product" 
                    target="rightFrame">Product</a></li>
        
       <li> <a href="Order.jsp" name="Order" target="rightFrame">Order</a></li>
        
       <li> <a href="OrderPosition.jsp" 
               name="OrderPosition" target="rightFrame">Order Position</a></li>
        </ul>
        
    </body>
</html>
