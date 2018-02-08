<%@page import="edu.iit.entities.Employee"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
</head>
<body bgcolor="Yellow">
	<table border="1" width="80%" height="30%">
		<tr>
			<th><font color='Red'>EMP ID</font></th>
			<th><font color='Red'>F_NAME</font></th>
			<th><font color='Red'>L_NAME</font></th>

			<th><font color='Red'> DOJ </font></th>
			<th><font color='Red'>SALARY</font></th>
			<th><font color='Red'>MGR_ID</font></th>
			<th><font color='Red'>GRADE</font></th>
		</tr>
		<%
			Employee emp = (Employee) session.getAttribute("employee");
		%>
		<tr>
			<td><%=emp.getEmpId()%></td>
			<td><%=emp.getFirstName()%></td>
			<td><%=emp.getLastName()%></td>
			<td><%=emp.getJoinDate()%></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getMgrID()%></td>
			<td><%=emp.getEmpGrade()%></td>
		</tr>
	</table>
</body>
</html>