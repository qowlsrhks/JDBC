<%@ page language="java" contentType="text.html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String s = request.getParameter("aa");

%>
<!DOCTYPE html "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Insert title here </title>
</head>
<body>
   입력받은 값 : <%= s %>
</body>
</html>