<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Times</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css">
<link rel="stylesheet" type="text/css" href="css/mostrarTimesStyle.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h1>Mostrar Times</h1>
	<c:if test="${not empty mensagem}">
		<p>${mensagem}</p>
	</c:if>
	<form action="MostrarTimesServlet" method="post">
		<button type="submit">Mostrar Times</button>
	</form>
	<hr>
	<c:if test="${not empty times}">
		<table class="tamanho linhas">
        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Cidade</th>
            <th>Estádio</th>
            <th>Material Esportivo</th>
        </tr>
        <c:forEach var="time" items="${times}">
            <tr>
                <td><c:out value="${time.codigoTime}" /></td>
                <td><c:out value="${time.nomeTime}" /></td>
                <td><c:out value="${time.cidade}" /></td>
                <td><c:out value="${time.estadio}" /></td>
                <td><c:out value="${time.materialEsportivo}" /></td>
            </tr>
        </c:forEach>
    </table>
    </c:if>
</body>
</html>