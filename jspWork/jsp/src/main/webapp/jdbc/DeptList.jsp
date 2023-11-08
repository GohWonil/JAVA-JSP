<%@page import="java.util.List"%>
<%@page import="com.momo.dao.DeptDao"%>
<%@page import="com.momo.dto.DeptDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	DeptDao dao = new DeptDao(application);
	List<DeptDto> list = dao.getList();
	//자원 해제
	dao.close();
	for(DeptDto dto :list){
		out.print( dto.getDept_title() );
		out.print(" ");
		out.print( dto.getLocal_code() );
		out.print(" ");
		out.print( dto.getLocation_id() );
		out.print(" ");
		out.print( dto.getLocal_name() );
		out.print("<br>");
		
	}
%>


</body>
</html>