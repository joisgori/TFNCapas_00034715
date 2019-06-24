<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %> <!-- *************** AC�, ESTO SE IMPORTA *************** -->
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
			<th> Ubicaci�n </th>
			<th> horario de apertura </th>
			<th> horario de cierre </th>
			<th> n�mero de mesas </th>
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
		<h2>Ac� colocar� la info de sus empleados correspondientes: </h2>
		
		<table>
				<tr>
			<th> ID empleado </th>
			<th> Nombre de empleado </th>
			<th> Edad de empleado </th>
			<th> G�nero de empleado </th>
			<th> Estado de empleado </th>
			<th> Id sucursal correspondiente </th> <!-- este campo no ser� necesario, 
			a menos que desee mostrar la relaci�n directa entre el empleado y la sucursal en una misma tabla,
			me tocar� realizar una clase DTO -->
		</tr>
		<c:forEach items="${DatosEmpleado}" var="DatosEmpleado">
			<tr> 
			<!-- mando a llamar los nombres que le puse en domain, para llenar esos campos... -->
				<td> ${DatosEmpleado.id_empleado} </td>
				<td> ${DatosEmpleado.nombre_empleado} </td>
				<td> ${DatosEmpleado.edad_empleado} </td>
				<td> ${DatosEmpleado.genero_empleado} </td>
				<td> ${DatosEmpleado.estado_empleado} </td>
				<!-- Como te digo, la tabla que muestra el id de la sucursal, nos ser�a necesario pues ser� repetitivo... -->
			</tr>
		</c:forEach>
</table>
</body>
</html>