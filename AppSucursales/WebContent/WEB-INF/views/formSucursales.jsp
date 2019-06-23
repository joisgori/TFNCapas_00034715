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
		
				<label><b>Nombre sucursal:</b></label>
				<form:input class="inputs" type="text" id="nombre" path="nombreSucursal" placeholder="Ingrese el nombre de sucursal" />
				<!-- para qué srive el path ...  -->
c
				<b>Ubicación sucursal:</b>
				<form:input class="inputs" type="text" id="ubicacion" path="ubicacionSucursal" placeholder="Ingrese la dirección de la sucursal" />

				<b>Horario de apertura:</b>
				<form:input class="inputs" type="text" id="horarioAp" path="horarioApertura" placeholder="Ingrese hora en formato 12H /AM-PM" />
				
				<b>Horario de cierre: </b>
				<form:input class="inputs" type="text" id="horarioCi" path="horarioCierre" placeholder="Ingrese hora en formato 12H /AM-PM" />
			
				<b>Número de mesas: </b>
				<form:input class="inputs" type="text" id="mesas" path="numeroMesas" placeholder="Ingrese cantidad de mesas" />
			
				<b>Nombre del gerente: </b>
				<form:input class="inputs" type="text" id="nombreGere" path="nombreGerente" placeholder="Ingrese el nombre del gerente" />
				
				<input id="save" class="myButton" type="submit" value="Guardar la sucursal" />
		
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