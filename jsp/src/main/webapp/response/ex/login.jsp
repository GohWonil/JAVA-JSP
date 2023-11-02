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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if("kkk".equals(id) && "1234".equals(pw)){
			response.sendRedirect("loginOk.jsp?id" + id);
		} else {
			request.getRequestDispatcher("main.jsp?loginErr=2").forward(request, response);
		}
	%>
</body>
</html>