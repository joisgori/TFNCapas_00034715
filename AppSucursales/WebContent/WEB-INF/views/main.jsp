<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursales WebAplication</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
	
	<form:form method="post" modelAttribute="usuario" action="${pageContext.request.contextPath}/verus">
	<div class="body"> <h1>Restaurantes pollos rústico </h1> </div>
		<br>
		<div class="login">
		
				<form:input type="text" path="usuario" placeholder="usuario" name="usuario"/>
				<form:errors path="usuario" cssStyle="color:#FF0000;"></form:errors><br>
				
				<form:input type="password" path="contraseña" placeholder="contraseña" name="contraseña"/>
				<form:errors path="contraseña" cssStyle="color:#FF0000;"></form:errors><br>
				
				<input type="submit" value="Login">
		</div>
	</form:form>
	
	<c:if test = "${resultado eq 0}">
		<h2>El usuario NO existe en la base de datos</h2>
</c:if>

<a href="https://codepen.io/davinci/" target="_blank"></a>

</body>
</html>