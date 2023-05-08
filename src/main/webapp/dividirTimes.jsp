<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorteio de Grupos</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css">
<link rel="stylesheet" type="text/css" href="css/dividirTimesStyle.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h1>Sorteio de Grupos</h1>
	<c:if test="${not empty mensagem}">
		<p>${mensagem}</p>
	</c:if>
	<form action="SorteioServlet" method="post">
		<input type="submit" value="Sortear Grupos">
	</form>
</body>
</html>