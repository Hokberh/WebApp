<%@page import="code.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddForm</title>
    </head>
    <body>
          <jsp:useBean id="order" scope="request" class="code.Order"></jsp:useBean>
           <form action="AddOrderServlet" method="post">
        <table>
            <center>
            <tr>
                <th>Add Order Form</th>
            </tr>
            
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" value="<jsp:getProperty name="order" property="description"/>"></td>
            </tr>
            
            <tr>
                <td>Order Date:</td>
                <td><input type="text" name="orderDate" value="<jsp:getProperty name="order" property="orderDate"/>"></td>
            </tr>
            
            <tr>
                <td>Total Cost:</td>
                <td><input type="text" name="totalCost" value="<jsp:getProperty name="order" property="totalCost"/>"></td>
            </tr>
            
                <tr>
                    <td><center><a href="Order.jsp">Back</a></center></td>
                            <td><center><input type="reset" value="Reset" /></center></td>
                            <td><center><input type="submit" value="Add"></center></td>
                        </tr>
            
        </table>
          </center>
           </form>
    </body>
</html>