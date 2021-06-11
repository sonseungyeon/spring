<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>무비 화면</title>
</head>
<body>
	<c:forEach var="movie" items="${movieList}">
	무비 아이디 : ${movie.id }<br>
	장르 : ${movie.genre }<br>
	연출자 : ${movie.director }<br>
	시나리오 : ${movie.scenario }<br>
	제목 : ${movie.title }<br>
	감독: ${movie.producer }<br>
	배우 : ${movie.actor }<br>
	음악 : ${movie.music }<br>
	촬영시작날짜 :${movie.beginFilming }<br>
	촬영종료날짜 :${movie.endFilming }<br>
	출시날짜 :${movie.releaseDate }<br>
	영화시간 : ${movie.runningTime }<br>
	제작비용 : ${movie.productionCost }<br>
	한국박스오피스 : ${movie.northAmericaBoxOffice }<br>
	월드박스오피스 : ${movie.worldBoxOffice }<br>
	한국관객 수 : ${movie.koreanNumberOfAudience }<br>
	연령 : ${movie.enum }<br>
	작성날짜:${movie.wDate }<br>
	수정날짜 : ${movie.uDate }<br>

		<hr>
	</c:forEach>
	<a href="/marvel/list">돌아가기</a>
</body>
</html>