<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>nueva sucursal</title>
</head>
<body>

<form:form id="form1" method="post" modelAttribute="sucursal" action="${pageContext.request.contextPath}/guardarSucursal"> <!-- Para qué 
es que me sirve ese modelAttribute??  -->
				
				<form:input type="hidden" id="idSuc" path="codigoSucursal"/> <br>
				
				<label><b>Nombre sucursal:</b></label> <br>
				<form:input class="inputs" type="text" id="nombre" path="nombreSucursal" placeholder="Ingrese el nombre de sucursal" /> <br>
				<!-- para qué srive el path ...  -->
c
				<b>Ubicación sucursal:</b> <br>
				<form:input class="inputs" type="text" id="ubicacion" path="ubicacionSucursal" placeholder="Ingrese la dirección de la sucursal" /> <br>

				<b>Horario de apertura:</b> <br>
				<form:input class="inputs" type="text" id="horarioAp" path="horarioApertura" placeholder="Ingrese hora en formato 12H /AM-PM" /> <br>
				
				<b>Horario de cierre: </b> <br>
				<form:input class="inputs" type="text" id="horarioCi" path="horarioCierre" placeholder="Ingrese hora en formato 12H /AM-PM" /> <br>
			
				<b>Número de mesas: </b> <br>
				<form:input class="inputs" type="text" id="mesas" path="numeroMesas" placeholder="Ingrese cantidad de mesas" /> <br>
			
				<b>Nombre del gerente: </b> <br>
				<form:input class="inputs" type="text" id="nombreGere" path="nombreGerente" placeholder="Ingrese el nombre del gerente" /> <br>
				
				<input id="save" class="myButton" type="submit" value="Guardar la sucursal" /> <br>
		
		<!--  esto qué función está realizando?? -->
		<!-- <c:choose>
			<c:when test="${resultado==1}">
				<script type="text/javascript">
					limpiarCampos();
				</script>
				<span><b>El cliente fue guardado con &eacute;xito</b></span>
			</c:when>
			<c:when test="${resultado==0}">
				<span><b>Ocurrio un error al guardar al cliente</b></span>
			</c:when>
		</c:choose> -->
	</form:form>
</body>
</html>