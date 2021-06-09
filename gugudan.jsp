<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 숫자 구구단(?단)</title>
</head>
<body>	
<h1>구구단</h1>
	<c:forEach var="i" begin="1" end="9">
		<c:out value="${randomNumber} * ${i} =${randomNumber * i}"/><br>
	</c:forEach>
</body>
</html>