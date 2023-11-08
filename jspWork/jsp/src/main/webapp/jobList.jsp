<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<<<<<<< HEAD:jspWork/jsp/src/main/webapp/session/logoutProcess.jsp
<%
	//세션무효화
	session.invalidate();
	response.sendRedirect("loginForm.jsp");
%>
========
<h2>jobList 서블릿 호출결과</h2>
직급목록<br>
<%=request.getAttribute("list") %>
>>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2:jspWork/jsp/src/main/webapp/jobList.jsp
</body>
</html>