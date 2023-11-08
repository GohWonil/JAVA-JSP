<%@page import="com.momo.dto.Job"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dao.JobDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h2>직급(job) 목록</h2>

<%
	JobDao dao = new JobDao(application);
	List<Job> list = dao.getList();
	//자원해제
	dao.close();
%>



<% for(Job job:list){%>
        <%= job.getJobCode() %>
        <%= job.getJobName() %>
 <%
}
 %>

</body>
</html>