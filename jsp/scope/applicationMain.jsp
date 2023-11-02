<%@page import="java.util.HashMap"%>
<%@page import="com.momo.dto.Person"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application영역</title>
</head>
<body>
	<!-- 
	웹서버가 실행시 생성되는 영역
	클라이언트가 요청하는 모든 페이지가 application영역을 공유
	웹서버를 종료할때 소멸
	 -->
	 
<%
	Map<String, Person> map = new HashMap<>();

	map.put("actor1", new Person("user1", 20));
	map.put("actor2", new Person("user2", 30));
	map.put("actor3", new Person("user3", 40));
	map.put("actor4", new Person("user4", 50));
	map.put("actor5", new Person("user5", 60));
	
	application.setAttribute("map", map);
%>	

- application 영역에 속성이 저장 되었습니다.

 
</body>
</html>