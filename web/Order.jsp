<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page import="code.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>
        <sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
                           url="jdbc:sqlite:d:\MyData\StoreDataBase.db"
                           user=""  password=""/>

        <sql:query dataSource="${snapshot}" var="result">
            SELECT * from Orders;
        </sql:query>
  <center>
        <h2>Table Order:</h2>     
    
        <table width="50%" border="2">
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Order Date</th>
                <th>Total Cost</th>
            </tr>
            
           
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><input type="checkbox" name="id" value="${row.Id}"/><c:out value="${row.Id}"/></td>
                    <td><c:out value="${row.Description}"/></td>
                    <td><c:out value="${row.OrderDate}"/></td>
                    <td><c:out value="${row.TotalCost}"/></td>
                </tr>
            </c:forEach>
            
        </table>      
                   <tr>
                       <td><a href="AddOrder.jsp">Add</a></td>
            </tr>
        
  </center>
    </body>
</html>