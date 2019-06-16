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

<table>
	
		<tr>
			<th> codigo_sucursal </th>
			<th> nombre_sucursal </th>
			<th> ubicacion_sucursal </th>
			<th> horario_apertura </th>
			<th> horario_cierre </th>
			<th> numero_mesas </th>
			<th> nombre_gerente </th>
		</tr>
		<c:forEach items="${tablaJSPSucursales}" var="tablaJSPSucursales">
			<tr> 
			<!-- mando a llamar los nombres que le puse en domain, para llenar esos campos... -->
				<td> ${tablaJSPSucursales.codigo_sucursal} </td>
				<td> ${tablaJSPSucursales.nombre_sucursal} </td>
				<td> ${tablaJSPSucursales.ubicacion_sucursal} </td>
				<td> ${tablaJSPSucursales.horario_apertura} </td>
				<td> ${tablaJSPSucursales.horario_cierre} </td>
				<td> ${tablaJSPSucursales.numero_mesas} </td>
				<td> ${tablaJSPSucursales.nombre_gerente} </td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>