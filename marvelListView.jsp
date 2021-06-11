<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마블리스트</title>
</head>
<body>
<c:forEach var="marvel" items="${marvelList}">
	마블아이디 : ${marvel.marvelId }<br>
	<a href="/marvel/movie">영화제목</a> : ${marvel.title }<br>
	영화제목(영어) : ${marvel.titleEng }<br>
	개봉날짜 : ${marvel.releaseDate }<br>
	박스오피스 : ${marvel.worldBoxOffice }<br>
	작성날짜 : ${marvel.writeDate }<br>
	수정날짜 : ${marvel.updateDate }<br>
	<!-- ?=파라미터이름=전달할값 -->
	<a href="/marvel/update?marvelId=${marvel.marvelId}">수정</a>
	<a href="/marvel/delete?marvelId=${marvel.marvelId}">삭제</a>
	<hr>
</c:forEach>

	
</body>
</html>