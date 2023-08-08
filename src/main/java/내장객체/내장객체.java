package 내장객체;

/*
내장 객체(Implicit Objects):jsp 페이지에 내장되어있는 9개의 객체

1.request 객체 : HTTP request에 해당 하는 객체(HTTP 헤더,HTTP 바디)

2.response 객체 : HTTP response에 해당 하는 객체(HTTP 헤더, HTTP 바디)

3.out 객체 : JSP가 생성한 결과를 브라우저에게 보낼 때 사용하는 출력스트림

4.pageContext 객체 : 현재 JSP 페이지에 대한 컨텍스트 객체

5.session 객체 : 브라우저 1개와 연결된 세션에 대한 객체

6.application 객체 : 서버의 설정 정보 및 자원에 대한 객체

7.config 객체 : JSP -> 서블릿으로 변환될 때 참조해야 할 정보를 담는 객체

8.page 객체 : 현재 JSP 페이지 자체를 의미하는 객체(page = this;)

9.exception 객체 : 예외가 발생하였을 경우 발생된 예외객체를 담는 객체. 예외페이지로 전달됨



Request 내장 객체의 주요 메서드

1.StringBuffer getRequestURI() : 요청한 페이지의 파일 경로

2.String getRequestURL() : 요청한 페이지의 주소

3.String getRemoteHost() : 클라이언트 호스트 이름

3.String getRemoteAddr() : 클라이언트 호스트 주소

4.String getRemoteUser() : 클라이언트 호스트 ID(인증 사용을 안 한 경우 null)

5.String getProtocol() : 사용 중인 프로토콜

6.String getServerName() : 서버의 도메인 이름

7.int getServerPort() : 서버의 포트 번호

8.String getHeader(String name) : name에 해당되는 요청 header의 값

9.Enumeration<String> headerNames() : 요청 header의 모든 이름


Response 내장 객체의 주요 메서드

1.void sendRedirect(String url) : 지정 URL로 페이지 이동

2.void setHeader(String name, String value) : HTTP response 헤더 설정

3.String getContentType() : Response 메세지 바디의 컨텐트 타입

4.int getBufferSize() : Response 메세지의 버퍼 크기

5.String getCharacterEncoding() : response의 인코딩 형식

6.String gerHeader(String name) : name에 해당하는 header 정보 구하기

7.int get Status() : 상태 코드 예) (200)

8.Collection<String> getHeaderNames() : 헤더의 모든 이름 가져오기(컬렉션 객체)

9.void addCookie(Cookie cookie) 브라우저에 cookie를 저장






out 내장객체의 주요 메서드

1.boolean isAutoFlush() : 출력 버퍼가 가득찼을 때 자동 flush 여부

2.int getBufferSize() : 출력 버퍼의 크기(byte)

3.int getRemaining() : 출력 버퍼의 남은 버퍼의 크기(byte)

4.void clearBuffer() : 출력 버퍼의 데이터를 씀

5.void println() 혹은 write() : 출력 버퍼의 데이터를 씀

6.void flush() : 출력 버퍼에 있는 모든 내용을 브라우저에 밀어보냄 + 버퍼 비움

7.void close() : flush 후 out 객체를 종료



application 내장객체의 주요 메서드

application 객체는 하나만 존재 가능하지만 모든 페이지가 application 객체에 접근 가능

1.void setAttribute(String name, Object value) : name-value 속성 추가

2.Object getAttribute(String name) : name에 해당하는 속성 값

3.void removeAttribute(String name) : name 속성을 삭제

4.String getServerInfo() : 웹 컨테이너의 이름과 버전을 리턴

5.String getRealPath(String path) : 지정한 경로를 웹 어플리케이션 시스템상의 경로로 변경하여 리던

6.void log(String message) : 로그 파일에 message를 기록


파라미터 VS 애트리뷰트

파라미터(인자)
->브라우저에게 전송 받은 데이터(<form>,주소창의'?'이후부분)
->이름-문자열(String)
    값-문자열만 가능(String)

애트리뷰트(속성)
->서버내부에서 페이지끼리 주고 받을 수 있는 데이터
->이름-문자열(String)
    값-모든 자료형 가능(Object)


*/