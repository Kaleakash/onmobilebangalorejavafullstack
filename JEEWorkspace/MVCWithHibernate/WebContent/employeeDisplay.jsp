<%@page import="java.util.Iterator"%>
<%@page import="java.util.ListResourceBundle"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="core"%>
<%@page import="entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Display Employee Details Using Scripting tags</h2>
<table border="1">
	<tr>
		<th>EmpId</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
<%
Object obj = session.getAttribute("empDetails");
if(obj!=null){
	List<Employee> listOfRec = (List<Employee>)obj;
	Iterator<Employee> li = listOfRec.iterator();
	while(li.hasNext()){
		Employee emp = li.next();
		%>
		<tr>
			<td><%=emp.getId() %> </td>
			<td><%=emp.getName() %></td>
			<td><%=emp.getSalary() %></td>
		</tr>
		<%
	}
}
%>
</table>
<h2>Display Employee Details JSTL</h2>
<table border="1">
	<tr>
		<th>EmpId</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<core:forEach items="${sessionScope.empDetails}"
	var="rec"
	>
		<tr>
		<td><core:out value="${rec.id}"></core:out> </td>
		<td><core:out value="${rec.name}"></core:out> </td>
		<td><core:out value="${rec.salary}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
</body>
</html>