<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  
  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Expression Language<br/> 
Addition ${10+20}<br/>
<c:out value="Welcome to JSTL Tags"></c:out>
<br/>
<c:set var="n1" value="Ravi Kumar"></c:set>
Name is <c:out value="${n1}"></c:out>
</body>
</html>