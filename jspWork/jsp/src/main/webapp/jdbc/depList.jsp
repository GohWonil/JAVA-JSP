<%@page import="com.momo.dto.DepDto"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dao.depDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>로케이션, 로컬 목록</h2>

<%
	depDao dao = new depDao(application);
	List<DepDto> list = dao.getList();
	
	dao.close();
	for(DepDto dto :list){
		out.print( dto.getDept_Id() );
		out.print(" ");
		out.print( dto.getDept_title() );
		out.print(" ");
		out.print( dto.getLocation_id() );
		out.print("<br>");
	}
%>

</body>
</html>