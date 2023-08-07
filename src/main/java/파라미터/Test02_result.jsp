<%@ page language = "java" contentType = "text/html; charset = UTF-8"
    pageEncoding = "UTF-8"%>

<%
String str = request.getParameter("food");
String[] arr = request.getParameterValues("food");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset = UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 좋아하는 음식은</br>
<%= for(int i =0; i<arr.length;i++){ %>
        <%= arr[i] %> </br>
    <%= } %>
입니다.

</body>
</html>