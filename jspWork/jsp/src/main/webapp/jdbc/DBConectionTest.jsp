<%@page import="com.momo.dto.EmpDto"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dao.EmpDao"%>
<%@page import="com.momo.common.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> JDBC �׽�Ʈ 1</h2>
<%
	//connection ��ü ����
	DBConnection dbcon = new DBConnection();
	dbcon.stmt =dbcon.con.createStatement();
	dbcon.rs = dbcon.stmt.executeQuery("select sysdate from dual");
	
	dbcon.rs.next();
	dbcon.rs.getString(1);
	
	//�ڿ� �ݳ�
	dbcon.close();
	
	out.print("<br>init param: " + (application.getInitParameter("INIT_PARAM")));
	out.print("<br>init param: " + (application.getInitParameter("driver")));
	out.print("<br>init param: " + (application.getInitParameter("url")));
	out.print("<br>init param: " + (application.getInitParameter("id")));
	out.print("<br>init param: " + (application.getInitParameter("pw")));
%>

<h2>JDBC �׽�Ʈ 2</h2>
<%
	DBConnection dbcon2 = new DBConnection(
			application.getInitParameter("driver")
			,application.getInitParameter("url")
			,application.getInitParameter("id")
			,application.getInitParameter("pw")
			);
	dbcon2.close();
%>

<h2>JDBC �׽�Ʈ 3</h2>
<% 
	DBConnection dbcon3 = new DBConnection(application);
	dbcon3.close();
%>

<h2>empDao.getList()</h2>
<%
	EmpDao empDao = new EmpDao();
	List<EmpDto> list = empDao.getList();
	
%>

<table>
	<tr>
		<td>���ID</td>
		<td>�����</td>
		<td>�ֹι�ȣ</td>
	</tr>
	<%
	for(EmpDto dto : list){
	%>
		<tr>
		<td><%= dto.getEmp_id()
		%></td>
		<td><%= dto.getEmp_name()
		%></td>
		<td><%= dto.getEmp_no()
		%></td>
	</tr>
	<%} %>
</table>

</body>
</html>