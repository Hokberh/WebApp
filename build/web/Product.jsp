<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <sql:setDataSource var="snapshot" driver="org.sqlite.JDBC"
                           url="jdbc:sqlite:d:\MyData\StoreDataBase.db"
                           user=""  password=""/>

        <sql:query dataSource="${snapshot}" var="result">
            SELECT * from Products;
        </sql:query>
  <center>
        <h2>Table Product:</h2>     
   
        <table width="50%" border="2">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Description</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.Id}"/></td>
                    <td><c:out value="${row.Name}"/></td>
                    <td><c:out value="${row.Price}"/></td>
                    <td><c:out value="${row.Description}"/></td>
                </tr>
            </c:forEach>
        </table>  
  </center>   
    </body>
</html>
