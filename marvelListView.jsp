<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>marvelListView.jsp</title>
<style>
.container{
border: 1px solid black;
border-collapse : collapse;
width: 400px;
padding:5px;
}
</style>
</head>
<body>
	<h1>마블영화 리스트 뷰 페이지</h1>
	<c:forEach var="marvel" items="${marvelList}">
		<section>
			<div class="container">
				id : ${marvel.marvelId}<br>
				title : ${marvel.title}<br>
				titleEng : ${marvel.titleEng}<br>
				releaseDate : ${marvel.releaseDate}<br>
				worldBoxOffice : ${marvel.worldBoxOffice}<br>
				writeDate : ${marvel.writeDate}<br>
				updateDate : ${marvel.updateDate}<br>
				<a href="/marvel/update">수정</a>
				<a href="/marvel/delete?marvelId=${marvel.marvelId }">삭제</a>
			</div>
		</section>
	</c:forEach>
</body>
</html>