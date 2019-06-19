<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- ********************* POR FAVOR, NO OLVIDAR ESTO SI QUIERO UTILZAR LOS MÉTODOS DE JSTL ********************************* -->
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <!-- *************** ACÁ, ESTO SE IMPORTA *************** -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tablas sucursales</title>
</head>
<body>

	<label>Ingrese el ID o Nombre de sucursal a la que desea ver el perfil: </label>
	<input type="text" value = "Ingrese ID o Nombre de sucursal"><input type = "submit" value = "Ver perfil"
	onclick=""location.href='${pageContext.request.contextPath}/also'""> <br>
	
	<h1>Ahora sí, muestro la tabla </h1>
	
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
				<td> ${tablaJSPSucursales.nombre_sucursal} </td>
			<!-- 	<td> ${tablaJSPSucursales.ubicacion_sucursal} </td>
				<td> ${tablaJSPSucursales.horario_apertura} </td>
				<td> ${tablaJSPSucursales.horario_cierre} </td>
				<td> ${tablaJSPSucursales.numero_mesas} </td>
				<td> ${tablaJSPSucursales.nombre_gerente} </td>  voy a comentar estos campos de momento, que no los necesito -->
				<td> <button onclick = "location.href='${pageContext.request.contextPath}/SucEmpleados?codigo_sucursal=${tablaJSPSucursales.codigoSucursal}'" 
				>Ver perfil</button> </td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>