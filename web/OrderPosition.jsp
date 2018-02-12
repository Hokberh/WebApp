<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Position</title>
    </head>
    <body>
        <sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
                           url="jdbc:sqlite:d:\MyData\StoreDataBase.db"
                           user=""  password=""/>

        <sql:query dataSource="${snapshot}" var="result">
            SELECT * from OrdersPositions;
        </sql:query>
  <center>
        <h2>Table Order Position:</h2>     
    
        <table width="50%" border="2">
            <tr>
                <th>ID</th>
                <th>Order ID</th>
                <th>Product ID</th>
                <th>Price</th>
                <th>Item Count</th>
            </tr>
            
           
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.Id}"/></td>
                    <td><c:out value="${row.OrderId}"/></td>
                    <td><c:out value="${row.ProductId}"/></td>
                    <td><c:out value="${row.Price}"/></td>
                     <td><c:out value="${row.ItemCount}"/></td>
                </tr>
            </c:forEach>
        </table> 
        
                        <tr>
                       <td><a href="AddOrderPosition.jsp">Add</a></td>
            </tr>
  </center>
    </body>
</html>