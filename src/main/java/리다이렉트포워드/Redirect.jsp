<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>나의 첫</title>
</head>
<body>
Test01 페이지는 보일까?
    <%
        request.setAttribute("user_age",25);
        response.sendRedirect("Test01_result.jsp");
    %>
</body>
</html>