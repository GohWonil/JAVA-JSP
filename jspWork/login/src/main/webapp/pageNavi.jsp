<%@page import="com.login.dto.PageDto"%>
<%@page import="com.login.dto.Criteria"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

</head>
<body>

<!-- 부트스트랩 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

<!-- 페이지네이션 시작 -->
<!--class를 추가 하여 화면을 구성
	active: 현재 페이지를 활성화
	disabled: 버튼의 비활성화
 -->
 <%
 	PageDto pageDto = null;
 	//페이지네비게이션을 생성하기 위해 필요한 데이터
	 if(request.getAttribute("pageDto") != null 
			 && !"".equals(request.getAttribute("pageDto"))){
		 pageDto = (PageDto)request.getAttribute("pageDto");
	 
	 } else {
		 pageDto = new PageDto(0, new Criteria());
	 }
 
 /*
	int startNo = 1;
	int endNo = 10;
	int pageNo = 5;
	
 	boolean prev = true;
 	boolean next = true;
 	*/
 %>
<nav aria-label="...">
  <ul class="pagination">
  <!-- 이전 페이지 블럭으로 이동 시작 -->
    <li class="page-item <%= pageDto.isPrev() ? "" : "disabled"%>">
      <a class="page-link">이전</a>
    </li>
  <!-- 이전 페이지 블럭으로 이동 끝 -->
  
  <!-- 페이지 버튼 시작 -->
  <%
  for(int i = pageDto.getStartNo(); i <= pageDto.getEndNo(); i++){
  %>
    <li class="page-item">
    <a class="page-link <%=pageDto.getCri().getPageNo() == i ? "active" : "" %>" href="#"><%=i %></a>
    </li>
  <% } %>
    
  <!-- 페이지 버튼 끝 -->
    
  <!-- 다음 페이지 브럭으로 이동 시작 -->
    <li class="page-item">
      <a class="page-link" href="#">다음</a>
    </li>
  <!-- 다음 페이지 브럭으로 이동 끝 -->
  </ul>
</nav>
<!-- 페이지네이션 끝 -->

</body>
</html>