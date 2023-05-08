<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar Rodada</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css">
<link rel="stylesheet" type="text/css" href="css/buscarRodadaStyle.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h1>Buscar Rodada</h1>

	<fieldset>
		<legend>Digite a data:</legend>

		<form action="BuscarRodadaServlet" method="get">
			<input type="date" name="data"> <input type="submit"
				value="Buscar">
		</form>

	</fieldset>

	<br>
	<c:if test="${not empty jogos}">
		<table class="tamanho linhas">
			<tr>
				<th>Mandante</th>
				<th>Visitante</th>
			</tr>
			<c:forEach items="${jogos}" var="jogo">
				<tr>
					<td>${jogo[0]}</td>
					<td>${jogo[1]}</td>
				</tr>
			</c:forEach>

		</table>
	</c:if>
	<br>
	<c:if test="${not empty errorMessage}">
		<p style="color: red">${errorMessage}</p>
	</c:if>
</body>
</html>
