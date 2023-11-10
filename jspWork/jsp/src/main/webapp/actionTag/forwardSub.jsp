<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>포워드 결과 확인</h2>
	<ul>
		<li>
		<!-- page영역은 공유가 되지 않기때문에 null값이 뜰거임 -->
			page영역: 
			<%=pageContext.getAttribute("pageAttr") %>
		</li>
		
		<li>
		<!-- request영역은 공유가 되서 요청 영역이 뜰거임 -->
			request영역:
			<%=request.getAttribute("requestAttr") %>
		</li>
		
		<!-- getParameter 한글 깨짐 방지로 문구 하나 넣기 -->
		<%
			request.setCharacterEncoding("UTF-8");
		%>
		<li>
			액션태그 param:
			<%=request.getParameter("param") %>
		</li>
	</ul>

</body>
</html>