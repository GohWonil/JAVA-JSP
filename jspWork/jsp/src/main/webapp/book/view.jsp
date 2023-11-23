<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>도서정보</h2>
요청도서번호: ${param.no } <br>
도서정보: ${bookDto } <br>
도서정보: ${bookDto.no } <br>
도서명: ${bookDto.title } <br>
작가: ${bookDto.author } <br>
대여여부: ${bookDto.rentYn } <br>
<!--  http://localhost:8080/book/view?no=1 쿼리스트링 사용하면 정보 조회-->
</body>
</html>