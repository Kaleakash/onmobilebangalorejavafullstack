<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/JavaScript">
	var obj;
	function loadObject() {
	var name = document.getElementById("abc").value;
	obj = new XMLHttpRequest();
	obj.open("Get","display.jsp?msg="+name,true);
	obj.send();
	obj.onreadystatechange=callback;	
	}
	function callback() {	
		
		if(obj.readyState==4 && obj.status ==200){
			//alert(obj.responseText)
			document.getElementById("ee").innerHTML=obj.responseText;
			}
	}
</script>
</head>
<body>
<input type="text" id="abc" onkeyup="loadObject()"/>
<h2>Welcome to Ajax Application</h2>
<div id="ee"></div>
</body>
</html>