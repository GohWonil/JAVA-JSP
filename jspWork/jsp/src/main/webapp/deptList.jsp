<%@page import="com.momo.dto.DeptDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<<<<<<< HEAD:jspWork/jsp/src/main/webapp/session/ex/loginMain.jsp
<%=session.getAttribute("userId") %> 님 환영합니다.
========

<h2>부서목록</h2>
<%
	List<DeptDto> list = (List<DeptDto>)request.getAttribute("list");
	out.print(list);

%>

>>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2:jspWork/jsp/src/main/webapp/deptList.jsp
</body>
</html>