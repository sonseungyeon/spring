<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>marvelInputForm.jsp</title>
</head>
<body>
	<h1>마블 영화 입력 페이지</h1>
	<form action="/marvel/input" method="post">
		극장 번호 : <input type="text" name="marvelId" value=0 readonly="readonly"><br>
		마블 영화 제목 : <input type="text" name="title"><br>
		마블 영화 영어 제목 : <input type="text" name="titleEng"><br>
		<!-- 릴리즈 날짜 : <input type="datetime-local" name="releaseDate" ><br> -->
		릴리즈 날짜 : <input type="hidden" name="releaseDate" value="2021-06-10T13:11:11"><br>
		월드 박스 오피스 : <input type="number" name="worldBoxOffice"><br>
		<input type="submit" value="영화 추가"><br>		
	</form>
</body>
</html>