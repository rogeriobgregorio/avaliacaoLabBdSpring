<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Grupos</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css">
<link rel="stylesheet" type="text/css" href="css/exibirGruposStyle.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h1>Mostrar Grupos</h1>
	<c:if test="${not empty mensagem}">
		<p>${mensagem}</p>
	</c:if>
	<form action="MostrarGruposServlet" method="post">
		<button type="submit">Mostrar Grupos</button>
	</form>
	<hr>
	<c:if test="${not empty grupoA}">
		<h2>Grupo A</h2>
		<table border="1" class="grupoA tamanho">
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
			<c:forEach var="time" items="${grupoA}">
				<tr>
					<td>${time.codigoTime}</td>
					<td>${time.nomeTime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${not empty grupoB}">
		<h2>Grupo B</h2>
		<table border="1" class="grupoB tamanho">
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
			<c:forEach var="time" items="${grupoB}">
				<tr>
					<td>${time.codigoTime}</td>
					<td>${time.nomeTime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${not empty grupoC}">
		<h2>Grupo C</h2>
		<table border="1" class="grupoC tamanho">
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
			<c:forEach var="time" items="${grupoC}">
				<tr>
					<td>${time.codigoTime}</td>
					<td>${time.nomeTime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${not empty grupoD}">
		<h2>Grupo D</h2>
		<table border="1" class="grupoD tamanho">
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
			<c:forEach var="time" items="${grupoD}">
				<tr>
					<td>${time.codigoTime}</td>
					<td>${time.nomeTime}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>