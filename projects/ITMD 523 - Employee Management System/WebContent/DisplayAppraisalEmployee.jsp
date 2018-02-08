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
	<table border="1" width="40%" height="30%">
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
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaswanth", "root", "jaswanth");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select emp_id,e_fname,e_lname,doj,sal,mgr_id,grade from employee");
			while (rs.next()) {
				int empId = rs.getInt("emp_id");
				String fName = rs.getString("e_fname");
				String lName = rs.getString("e_lname");
				Date date = rs.getDate("doj");
				int sal = rs.getInt("sal");
				int mgrId = rs.getInt("mgr_id");
				int grade = rs.getInt("grade");
		%>
		<tr>
			<td><b><font color='#663300'><%=empId%></font></b></td>
			<td><b><font color='#663300'><%=fName%></font></b></td>
			<td><b><font color='#663300'><%=lName%></font></b></td>
			<td><b><font color='#663300'><%=date%></font></b></td>
			<td><b><font color='#663300'><%=sal%></font></b></td>
			<td><b><font color='#663300'><%=mgrId%></font></b></td>
			<td><b><font color='#663300'><%=grade%></font></b></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>