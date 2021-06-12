<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>marvelListView</title>
<link type="stylesheet" type="text/css"
	href="/resources/css/marvelListView.css">
</head>
<body>
	<h1>영화리스트</h1>
	<div class="container">
		<c:forEach var="marvelList" items="${marvelList }">
		영화제목: ${marvelList.title }<br>
		영화영어제목:${marvelList.titleEng }<br>
		영화개봉날짜:${marvelList.releaseDate }<br>
		월드박스오피스:${marvelList.worldBoxOffice }<br>
		작성날짜:${marvelList.writeDate }<br>
		업데이트날짜:${marvelList.updateDate }<br>
		<hr>
		</c:forEach>
	</div>
</body>
</html>