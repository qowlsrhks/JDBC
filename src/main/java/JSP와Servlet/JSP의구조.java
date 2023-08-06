package JSP와Servlet;
/*
JSP:
썬마이크로시스템즈사에서 만든 java Servlet 기반의 서버측(Back-end)스크립트 기술

JSP의 특징
-java Beans 라고 하는 자바 컴포넌트를 사용 할 수있다
-JSP나 다른 서블릿 간의 쉬운 데이터 공유
**page,request,session,application scope으로 구현
-자바의 모든 기능을 사용할 수있다(무한한 확장성)q   n
-IBM,오라클,썬,BEN등에서 강력히 지원중
-JSTL(JSP Standard Tag Library)과 같은 다양한 기능의 태그 라이브러리 사용 가능
-다양한 운영체제와 여러 회사의 JSP 개발 / 실행 환경을 이용할 수 있음


JSP의 동작과정:
서버 가동 -> 파일명_jsp.class의init() 호출(메모리 로드,1회만 실행)
->클라이언트들이 해당 웹페이지 요청 시 multi-thread방식으로 service()호출
->서버 종료 시 destroy() 실행
**해당 서블릿 클래스는 최초 1회만 객체화 되며, 이후 서비스는 멀티스레드 방식으로 메소드로 실행: 수 십명의 클라이언트가
페이지를 요청 할떄 수 십 개의 객체가 생성되지는 않음
=>서버의 메모리를 절약 할 수 있음


JSP의 구성 요소

1.    내용   : 아무 표시가 없으면 HTML로 인식

2.<%@ 내용 %> : 지시어(directive)

3.<%! 내용 %> : 선언부(declaration)

4.<%  내용 %> : 스트립트릿(scriptlet)

5.<%= 내용 %> : 표현식(expression)

6.<%--내용--%>: 주석(comment)



1.지시어:<%@ 내용 %>: 해당 페이지의 속성을 기술
1)page:이 jsp홈페이지에 대한 설정정보
        <%@page 설정할 내용 %>

language: 스크립트 언어 유형(jsp는 java만) 예)<%@ page language="java"%> 기본값 java

import: import할 외부 클래스 지정 예)<%@ page import ="java.util.Date" %>

session: 세션의 사용 유무 지정 예) <%@ page session="true" %> 기본값 true

buffer: 버퍼의 크기를 지정 예) <%@ page buffer="8kb"%> 기본값 8kb

autoFlush: 버퍼의 자동 flush 여부 예) <%@ page autoFlush="false"%> 기본값 true

isThreadSafe: 멀티 스레드 방지 여부 예) <%@ page isThreadSafe="false"%> 기본값 true

info: 이 jsp 페이지에 대한 설명 <%@ page info="Test file" %>

errorPage: 현재 페이지에서 오류가 났을 경우 호출할 페이지 예) <%@ page errorPage="index.jsp"%>

isErrorPage: 오류를 처리하는 페이지인지 여부 예) <%@ page isErrorPage="true"%> 기본값 false

contentType: 이 페이지에 대한 MINE TYPE  예) <%@ page contentType="text/html"%>

pageEncoding: 이 페이지에 대한 인코딩 타입 예) <%@ page pageEncoding="UTF-8"%>

extends: 이 페이지 클래스에 대한 슈퍼클래스


2)include : 다른 jsp홈페이지를 이 페이지에 포함
    <%@include file = "포함할 페이지"%>

3)taglib : 이 jsp홈페이지가 사용할 사용자 정의 태그를 선언
            <%@taglib 사용자정의태그 선언 %>




2.선언부: <%!  내용 %> : 해당 jsp가 변환될 클래스의 필드,메소드를 선언할 때 사용

<%!

public void test(){
    System.out.println("test log");
}

%>


3.스크립트릿:<% 내용 %> : jsp페이지 내부에 자바 코드 삽입

<%
    int a = 10;
    out.write(a + 100);
%>



4.표현식:<%= 내용 %>:html문서에 결과값(변수,리턴값이 있는 메소드)을 출력할 때
<%= a %>
<%= a + 20 %>
<%= sum(10,20) %>

5.주석 : <%--내용--%>:jsp 페이지 상에서의 주석 (단 <% %>안에서는 // 혹은 /* */


