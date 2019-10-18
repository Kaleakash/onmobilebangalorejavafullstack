<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" 
    prefix="ss" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ss:form action="checkUser.spring" commandName="ll">
<label>UserName</label>
<ss:input path="user"/>
<br/>
<label>Password</label>
<ss:password path="pass"/>
<br/>
<input type="submit"/>
</ss:form>
</body>
</html>