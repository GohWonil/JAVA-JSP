<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>파일목록</h2>

<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>카테고리</th>
		<th>원본파일</th>
		<th>저장파일</th>
		<th>등록일</th>
	</tr>

	<c:forEach items="${list }" var="fileDto">
	 	<tr align="center">
	 		<td>${fileDto.file_no}</td>
	 		<td>${fileDto.title }</td>
	 		<td>${fileDto.name }</td>
	 		<td>${fileDto.cate }</td>
	 		<td>${fileDto.ofile }</td>
	 		<td>${fileDto.sfile }</td>
	 		<td>${fileDto.postdate}</td>
	 	</tr>
	</c:forEach>
	
	<c:if test="${empty list }" var="res">
		<tr>
			<td colspan="7" align="center">파일 없음</td>
		</tr>
	</c:if>	
	
</table>
</body>
</html>