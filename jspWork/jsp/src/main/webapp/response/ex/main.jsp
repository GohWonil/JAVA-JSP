<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  id: momo pw: 1234 이면 loginOk로 페이지 전환
	아니면 오류 메세지 출력 할 수 있도록 main페이지로 파라메터 전달 -->
	<% 
	String loginErr = request.getParameter("loginErr");
	%>
	<%= "2".equals(loginErr) ? " 아이디 비밀번호확인" : "" %>
	<% 
	String id = "kkk";
	if(request.getParameter("id") != null){
		id = request.getParameter("id");
	}
	%>
	<form action = "login.jsp" method = "post">
		<h1>로그인/비밀번호 접속</h1>
		아이디: <input type = "text" name = "id" value="kkk">
		비밀번호: <input type = "password" name = "pw" value="1234">
		
		<button>로그인</button>
	</form>
	
	
</body>
</html>