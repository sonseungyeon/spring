<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 화면</title>
</head>
<body>
	<form action="/marvel/update" method="post">
		아이디 :<input type="text" value=${marvel.marvelId } name="marvelId" readonly="readonly"><br>
		제목 :<input type="text" value="${marvel.title }" name="title"><br>
		영어제목 :<input type="text" value="${marvel.titleEng }" name="titleEng"><br>
		개봉일 :<input type="date" value="${marvel.releaseDate }"  name="releaseDate"><br>
		월드박스오피스 :<input type="number" min="0" value="${marvel.worldBoxOffice }"  name="worldBoxOffice"><br>
		작성일 :<input type="text" value="${marvel.writeDate }" name="writeDate" readonly="readonly"><br>
		<input type="submit" value="수정"><br>
	</form>
</body>
</html>