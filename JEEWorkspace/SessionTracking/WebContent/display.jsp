<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<%
out.println("JSP Application!<br>");
Object obj = request.getAttribute("obj");
out.println("<br>Value of a in JSP "+obj);
Object obj1 = session.getAttribute("obj1");
out.println("<br>Value of a in JSP from session scope "+obj1);
%>
</body>
</html>