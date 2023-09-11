<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h1 style='color:green'><c:out value="${message}"></c:out></h1>
      <form:form action="saveProduct" method="post" modelAttribute="products">
			<form:label path="productId"></form:label>
			<form:input path="productId" placeholder="enter productID"/><br><br>
			<form:label path="productName"></form:label>
			<form:input path="productName" placeholder="enter productName"/><br><br>
			<form:label path="productPrice"></form:label>
			<form:input path="productPrice" placeholder="enter productPrice"/><br><br>
			
			<form:button><input type="submit" value="submit"></form:button> 
		</form:form>
</body>
</html>