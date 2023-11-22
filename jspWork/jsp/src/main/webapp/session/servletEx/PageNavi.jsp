<%@page import="com.momo.dto.PageDto"%>
<%@page import="com.momo.dto.Criteria"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 부트스트랩 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" 
crossorigin="anonymous">

<%
	PageDto pageDto = null;
	//COntroller에서 request 영역에 저장한 pageDto를 화면에서 사용할수 있도록 변수에 저장
	if(request.getAttribute("pageDto") != null 
		&& !"".equals(request.getAttribute("pageDto"))){
		pageDto = (PageDto)request.getAttribute("pageDto");
	} else {
		pageDto = new PageDto(0, new Criteria());
	}

	/* pageDto를 사용하여 만듦
	int totalCnt = 1000;
	Criteria cri = new Criteria(); //pageNo=1, amount = 10
	cri.setPageNo(23);
	PageDto pageDto = new PageDto(totalCnt, cri);
	*/
	
	/* 게터세터로 만듦.
	int startNo = 1;
	int endNo = 10;
	int pageNo = 20;
	
	boolean prev = (startNo==1)? false : true;
	boolean next = true;
	*/
%>

 
</head>
<body>
<br>
<!-- 페이지 네이션 -->
<nav aria-label="...">
  <ul class="pagination">
  <!-- 앞으로 가기 버튼 시작 disabled : 비활성화  -->
    <li class="page-item <%= pageDto.isPrev() ? "" : "disabled"%>">
      <a class="page-link" onclick = "goPage(<%=pageDto.getStartNo()-1%>)">
      이전</a>
    </li>
  <!-- 앞으로 가기 버튼 끝 -->
   
   <%for(int i = pageDto.getStartNo(); i <= pageDto.getEndNo(); i++){ %>
    <li class="page-item">
    <!-- href링크로 이동하면 검색어 유지가 안된다 그래서 searchForm을 전송하는 goPage함수를 생성하였다
    링크를 함수호출로 변경 onClick이벤트가 발생하면 goPage()함수를 호출하여 함수의 파라메터로 페이지 번호를 넣어준다 -->
    	<a class="page-link <%= pageDto.getCri().getPageNo() == i ? "active" : "" %>"
			onclick="goPage(<%=i %>)">    	
    	<%=i %>
    	</a>
    </li>
   <% } %>
   
    
  <!-- active: 현재 페이지 번호 활성화 
    <li class="page-item active" aria-current="page">
      <a class="page-link" href="#">2</a>
    </li>
    
    <li class="page-item">
    	<a class="page-link" href="#">3</a>
    </li>
  -->
    	
    <li class="page-item <%= pageDto.isNext() ? "" : "disabled"%>">
      <a class="page-link" onclick = "goPage(<%=pageDto.getEndNo()+1 %>)"> 
      다음</a>
    </li>
   
   
  </ul>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>

<!-- 부트스트랩 JS
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" 
crossorigin="anonymous"></script>
 -->


<!-- 차트 chart.js
  <canvas id="myChart"></canvas>
</div>

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<script>
  const ctx = document.getElementById('myChart');

  new Chart(ctx, {
    type: 'bar',
    data: {
      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
      datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1
      }]
    },
    options: {
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  });
</script> -->