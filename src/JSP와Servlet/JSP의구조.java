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

 */