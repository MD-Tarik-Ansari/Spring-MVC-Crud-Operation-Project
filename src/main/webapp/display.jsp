<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <table border="2px">
      <tr>
            <th>ProductId</th>
            <th>ProductName</th>
            <th>ProductPrice</th>
            <th colspan="2">Action</th>
       </tr>
       <c:forEach var="product" items="${allProduct}">
       <tr>
            <td>${product.getProductId()}</td>
            <td>${product.getProductName()}</td> 
            <td>${product.getProductPrice()}</td> 
            <td><a href=""><button style="color:green">Edit</button></a></td> 
            <td><a href="deleteByProductId?id=${product.getProductId()}"><button style="color:red">Delete</button></a></td>  
       </tr>
       </c:forEach>
      </table>
</body>
</html>