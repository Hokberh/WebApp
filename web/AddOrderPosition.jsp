<%@page import="code.OrderPosition"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddPositionForm</title>
    </head>
    <body>
          <jsp:useBean id="orderPosition" scope="request" class="code.OrderPosition"></jsp:useBean>
           <form action="AddOrderPositionServlet" method="post">
        <table>
            <center>
            <tr>
                <th>Add Order Position Form</th>
            </tr>
            
            <tr>
                <td>Order ID:</td>
                <td><input type="text" name="orderId" value="<jsp:getProperty name="orderPosition" property="orderId"/>"></td>
            </tr>
            
            <tr>
                <td>Product ID:</td>
                <td><input type="text" name="productId" value="<jsp:getProperty name="orderPosition" property="productId"/>"></td>
            </tr>
            
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value="<jsp:getProperty name="orderPosition" property="price"/>"></td>
            </tr>
            
               <tr>
                <td>Item Count:</td>
                <td><input type="text" name="itemCount" value="<jsp:getProperty name="orderPosition" property="itemCount"/>"></td>
            </tr>
            
                <tr>
                    <td><center><a href="OrderPosition.jsp">Back</a></center></td>
                            <td><center><input type="reset" value="Reset"/></center></td>
                            <td><center><input type="submit" value="Add"/></center></td>
                        </tr>

        </table>
          </center>
                       </form>
    </body>
</html>