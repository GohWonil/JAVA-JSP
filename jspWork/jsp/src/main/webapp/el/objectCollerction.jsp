<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.momo.dto.Person"%>
<%@page import="java.util.ArrayList"%>
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
<%
	//리스트 생성
	List<Object> aList = new ArrayList<>();
	aList.add("문자열");
	aList.add(new Person("momo", 25));
	
	//페이지 영역에 리스트 저장
	//(중요)el 표현언어를 사용하기 위해서는 내장 객체에 값이 저장되어 있어야 값이 출력이 된다.!!!
	pageContext.setAttribute("aList", aList);
%>

<h3>List 컬렉션</h3>
<!--영역을 지정하지 않아도 작은 영역부터 탐색해서 있으면 출력하여 오류가 발생하지 않는다  -->
<br>${aList }
<!--기본값은 객체의 주소값이 출력되지만 오버라이딩 한 toString()메서드의 호출이 결과로 출력 -->
<br>${aList[0] }
<br>${aList[1] }
<br>${aList[1].name }
<br>${aList[1].age }
<!--값이 없어도 오류가 발생하지 않는다  -->
<br>${aList[2].age }

<h3>Map 컬렉션</h3>
<%
	Map<String, String> map = new HashMap<>();
//key, value
	map.put("한글", "모모");
	map.put("Eng", "momo");
	
	pageContext.setAttribute("map", map);
%>

<ul>
	<li>
		<p>${map['한글'] }</p>
		<p>${map["한글"] }</p>
		<p><%=map.get("한글") %></p>
		<!-- 한글은 .을 찍어서 접글 할 수 없다!!!!
			\${} : el의 주석처리
		 -->
		<p>\${map.한글 }</p>
	</li>
	<li>
		<p>${map['Eng'] }</p>
		<p>${map["Eng"] }</p>
		<p>${map.Eng }</p>
		<p><%= map.get("Eng")%></p>
	</li>
</ul>

</body>
</html>