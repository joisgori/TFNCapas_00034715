<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Empleado</title>
</head>
<body>

<form:form id="form1" method="post" modelAttribute="empleado" action="${pageContext.request.contextPath}/guardarEmpleado"> <!-- Para qué 
es que me sirve ese modelAttribute??  -->
				
				<form:input type="hidden" id="idSuc" path="idEmpleado"/>
				
				<label><b>Nombre Empleado:</b></label>
				<form:input class="inputs" type="text" id="nombre" path="nombreEmpleado" placeholder="Ingrese el nombre de sucursal" />
				<!-- para qué srive el path ...  -->
c
				<b>Edad Empleado:</b>
				<form:input class="inputs" type="text" id="ubicacion" path="edadEmpleado" placeholder="Ingrese la dirección de la sucursal" />

				<b>Género Empleado:</b>
				<form:input class="inputs" type="text" id="horarioAp" path="generoEmpleado" placeholder="Ingrese hora en formato 12H /AM-PM" />
				
				<b>Estado Empleado: </b>
				<form:input class="inputs" type="text" id="horarioCi" path="estadoEmpleado" placeholder="Ingrese hora en formato 12H /AM-PM" />
				
				<input id="save" class="myButton" type="submit" value="Guardar el empleado" />
	</form:form>

</body>
</html>