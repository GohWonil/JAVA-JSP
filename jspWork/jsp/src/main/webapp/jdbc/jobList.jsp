<%@page import="com.momo.dto.Job"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dao.JobDao"%>
<<<<<<< HEAD
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
<h2>����(job) ���</h2>

<%
	JobDao dao = new JobDao(application);
	List<Job> list = dao.getList();
	//�ڿ�����
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
</head>
<body>
<h2>직급 목록</h2>
<%
	JobDao dao = new JobDao(application);
	List<Job> list = dao.getList();
	// 자원해제
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
	dao.close();
%>


<<<<<<< HEAD

<% for(Job job:list){%>
        <%= job.getJobCode() %>
        <%= job.getJobName() %>
 <%
}
 %>

=======
<div class="accordion" id="accordionExample">

<% for(Job job:list){%>

  <div class="accordion-item">
    <h2 class="accordion-header">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
        <%=job.getJobCode() %>
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        <%=job.getJobName() %>
      </div>
    </div>
  </div>
  
<%} %> 
  
  
</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
>>>>>>> e3e77c0e6fe35215a42cd29a01257b6e3d7919c2
</body>
</html>