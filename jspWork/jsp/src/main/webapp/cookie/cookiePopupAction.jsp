<%@page import="com.momo.utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <h2>�˾��� ��Ű�� �����ϴ� ������</h2>

<% 
//inactiveToday ���� ���
//value �Ӽ��� ��: request.getParameter("name�Ӽ��ǰ�")
out.print("inactiveToday : " + request.getParameter("inactiveToday"));
if("Y".equals(request.getParameter("inactiveToday"))){	
	
	//�˾��ݱ��(popupClose, Y) ��Ű ����
	CookieManager.makeCookie(response, "popupClose", "Y", 3600);
	
	//cookiePopupMain �������� ������ ��ȯ
	response.sendRedirect("cookiePopupMain.jsp");
}
%>

</body>
</html>