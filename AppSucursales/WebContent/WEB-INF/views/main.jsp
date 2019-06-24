<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursales WebAplication</title>
</head>
<body>

	<h1>Restaurantes r�stico</h1>
	
	<form:form method="post" modelAttribute="usuario" action="${pageContext.request.contextPath}/also">
	<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Restaurante R�stico</div>
		</div>
		<br>
		<div class="login">
		
				<form:input type="text" path="usuario" placeholder="usuario" name="usuario"/>
				<form:errors path="usuario" cssStyle="color:#FF0000;"></form:errors><br>
				
				<form:input type="password" path="contrase�a" placeholder="contrase�a" name="contrase�a"/>
				<form:errors path="contrase�a" cssStyle="color:#FF0000;"></form:errors><br>
				
				<input type="submit" value="Login">
		</div>
	</form:form>
	
	<c:if test = "${resultado eq 0}">
		<h2>El usuario NO existe en la base de datos</h2>
</c:if>


</body>
</html>