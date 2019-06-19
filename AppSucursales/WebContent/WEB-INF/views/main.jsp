<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursales WebAplication</title>
</head>
<body>

	<h1>Acá irá un login bien chidori</h1>
	
	<form action="${pageContext.request.contextPath}/also" method="post">
		<label>Ingrese su usuario: </label> <input type="text" required>
		<label>Ingrese contraseña: </label> <input type="text" required>
		<input type="submit" value = "continuar">
	</form>

</body>
</html>