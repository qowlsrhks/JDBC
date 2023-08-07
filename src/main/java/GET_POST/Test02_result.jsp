<%@ page language = "java" contentType = "text/html; charset = UTF-8"
    pageEncoding = "UTF-8"%>

<!DOCTYPE web-app PUBLIC
        "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
        "http://java.sun.com/dtd/web-app_2_3.dtd" >
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset = UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");//post방식으로 파라미터는 인코딩을 다시 해줘야한다%>
<%= request.getParameter("user_name")%>
<%= request.getParameter("user_age")%>

</body>
</html