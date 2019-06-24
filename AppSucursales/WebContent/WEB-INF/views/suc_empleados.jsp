<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <!-- *************** ACÁ, ESTO SE IMPORTA *************** -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursal con sus empleados</title>
</head>
<body>

	<h1>Tabla de sucursal correspondiente</h1>

<table>
		<tr>
			<th> ID sucursal </th>
			<th> Nombre de sucursal </th>
			<th> Ubicación </th>
			<th> horario de apertura </th>
			<th> horario de cierre </th>
			<th> número de mesas </th>
			<th> nombre del gerente </th>
		</tr>
			<tr> 
			<!-- mando a llamar los nombres que le puse en domain, para llenar esos campos... -->
				<td> ${DatosSucursal.codigoSucursal} </td>
				<td> ${DatosSucursal.nombreSucursal} </td>
				<td> ${DatosSucursal.ubicacionSucursal} </td>
				<td> ${DatosSucursal.horarioApertura} </td>
				<td> ${DatosSucursal.horarioCierre} </td>
				<td> ${DatosSucursal.numeroMesas} </td>
				<td> ${DatosSucursal.nombreGerente} </td>
			</tr>
</table>
		<br>
		<h2>Acá colocaré la info de sus empleados correspondientes: </h2>
		
		<label>Agregar nuevo empleado</label>
	<button onclick="location.href='${pageContext.request.contextPath}/insertEmp'">Nuevo empleado</button> <br> 
		
		<table>
				<tr>
			<th> ID empleado </th>
			<th> Nombre de empleado </th>
			<th> Edad de empleado </th>
			<th> Género de empleado </th>
			<th> Estado de empleado </th>
			<!-- el campo de id sucursal correspondiente no será necesario, a menos que desee mostrar la 
			relación directa entre el empleado y la sucursal en una misma tabla, me tocará realizar una clase DTO -->
		</tr>
		<c:forEach items="${DatosEmpleado}" var="DatosEmpleado">
			<tr> 
			<!-- mando a llamar los nombres que le puse en domain, para llenar esos campos... -->
				<td> ${DatosEmpleado.idEmpleado} </td>
				<td> ${DatosEmpleado.nombreEmpleado} </td>
				<td> ${DatosEmpleado.edadEmpleado} </td>
				<td> ${DatosEmpleado.generoEmpleado} </td>
				<td> ${DatosEmpleado.estadoEmpleado} </td>
				<td> <button onClick = "location.href='${pageContext.request.contextPath}/ElimEmp?codigo_empleado=${DatosEmpleado.idEmpleado}'"
				> Eliminar Empleado</button> </td>
				<td> <button onclick = "location.href='${pageContext.request.contextPath}/EditarEmp?codigo_empleado=${DatosEmpleado.idEmpleado}'" 
				>Editar Empleado</button> </td>
			</tr>
		</c:forEach>
</table>
</body>
</html>