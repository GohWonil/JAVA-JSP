<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>액션태그를 활용한 포워딩</h2>
<!-- 
	페이지 전환(이동)
	page영역은 공유되지 않고 request영역은 공유된다.
 -->
 
 <!-- 한글 깨짐 방지로 문구 하나 넣기 -->
 <%
	request.setCharacterEncoding("UTF-8");
%>
		
 <%
  pageContext.setAttribute("pageAttr", "페이지 영역");
  request.setAttribute("requestAttr", "요청 영역");
 
  
  //request.getRequestDispatcher("경로").forward(request, response);
  //이렇게도 할 수 있지만 아래 처럼 이동
 %>
<jsp:forward page="forwardSub.jsp">
	<jsp:param value="액션태그 파라메터" name="param"/>
</jsp:forward> 
 
 
</body>
</html>