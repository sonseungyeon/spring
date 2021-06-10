<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
	<h1>결과 페이지</h1>

		<section>
			극장 번호 : ${result.marvelId}<br>
			마블 영화 제목 : ${result.title}<br>
			마블 영화 영어 제목 : ${result.titleEng}<br>
			<fmt:parseDate value="${result.releaseDate }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="releaseDateTime"/>
			<fmt:formatDate value="${releaseDateTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="releaseFormat"/>
			릴리즈 날짜 : ${releaseFormat}<br>
			월드 박스 오피스 : ${result.worldBoxOffice}<br>
			<fmt:parseDate value="${result.writeDate }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="writeDateTime"/>
			<fmt:formatDate value="${writeDateTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="writeFormat"/>
			작성 날짜 : ${writeFormat}<br>
			<fmt:parseDate value="${result.updateDate }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="updateDateTime"/>
			<fmt:formatDate value="${updateDateTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="updateFormat"/>
			업데이트 날짜 : ${updateFormat}<br>
		</section>

	<a href="/marvel/list">돌아가기</a>
</body>
</html>