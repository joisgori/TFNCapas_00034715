<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- ********************* POR FAVOR, NO OLVIDAR ESTO SI QUIERO UTILZAR LOS MÉTODOS DE JSTL ********************************* -->
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <!-- *************** ACÁ, ESTO SE IMPORTA *************** -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tablas sucursales</title>
<link rel="stylesheet" href="resources/css/tablas.css">
</head>
<body>

 	<label>Nueva sucursal</label>
	<button onclick="location.href='${pageContext.request.contextPath}/insertSucusal'"> Nueva sucursal </button> <br> 
	
	<h1>Sucursales disponibles</h1>
	
<table>
		<tr>
			<th> ID sucursal </th>
			<th> Nombre de sucursal </th>
		<!--	<th> Ubicación </th>
			<th> horario de apertura </th>
			<th> horario de cierre </th>
			<th> número de mesas </th>
			<th> nombre del gerente </th>  --> 
			<th> acciones </th>   
		</tr>
		<c:forEach items="${tablaJSPSucursales}" var="tablaJSPSucursales">
			<tr> 
			<!-- mando a llamar los nombres que le puse en domain, para llenar esos campos... -->
				<td> ${tablaJSPSucursales.codigoSucursal} </td>
				<td> ${tablaJSPSucursales.nombreSucursal} </td>
				<!-- Ni comentados puedo dejar los campos en JPS, porque siempre los lee, hibernate, ojo a eso -->
				<td> <button onclick = "location.href='${pageContext.request.contextPath}/SucEmpleados?codigo_sucursal=${tablaJSPSucursales.codigoSucursal}'" 
				>Ver perfil</button> </td>
				<td> <button onClick = "location.href='${pageContext.request.contextPath}/ElimSucyEmp?codigo_sucursal=${tablaJSPSucursales.codigoSucursal}'"
				> Eliminar Sucursal</button> </td>
				<td> <button onclick = "location.href='${pageContext.request.contextPath}/EditarSuc?codigo_sucursal=${tablaJSPSucursales.codigoSucursal}'" 
				>Editar Sucursal</button> </td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>