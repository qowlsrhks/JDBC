package 리다이렉트포워드;

/*
페이지 이동은 왜 필요할까?
-로직과 뷰의 철저한 분업!

1.redirect
-브라우저가 다른 페이지로 request 재실행
-파라미터 전달 X
-주소창에 최종 도착 페이지가 보임
-외부 URL 요청 가능(구글,네이버 등으로 이동 가능)


2.forward
-서버 측에서 이동할 페이지를 불러와 클라이언트에게 보여줌
-처음 페이지, 도착 페이지 2페이지 간에 request와 response를 공유한다(파라미터 전달 O)
-주소창에 최종 도착 페이지가 보이지않음(처음 페이지 주소가 보임)
-동일한 웹 컨테이너 내의 페이지 이동만 가능(구글,네이버 등으로 이동 불가능 )


리다이렉트 사용방법 2가지

1.JSP의 response 내장객체 사용
<%
    response.rendRedirect("이동할 페이지")
%>


2.자바스크립트 사용
<script type = "text/javascript">
    location.href='이동할 페이지';
    </script>


포워드 방법 3가지

1.jsp의 pageContext 내장객체 사용
<%
    pageContext.forward("이동할 페이지");
%>

2.forward 액션 태그 사용
<jsp:forward page = "이동할 페이지"><jsp:forward>

3.request 내장객체의 RequestDispatcher 객체를 사용
<%
    RequestDispatch rd = request.getRequestDispatcher("이동할 페이지");
    rd.forward(request,response);
%>


*/