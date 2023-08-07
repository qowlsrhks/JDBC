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




out 내장객체의 주요 메서드

1.boolean isAutoFlush() : 출력 버퍼가 가득찼을 때 자동 flush 여부

2.int getBufferSize() : 출력 버퍼의 크기(byte)

3.int getRemaining() : 출력 버퍼의 남은 버퍼의 크기(byte)

4.void clearBuffer() : 출력 버퍼의 데이터를 씀

5.void println() 혹은 write() : 출력 버퍼의 데이터를 씀

6.void flush() : 출력 버퍼에 있는 모든 내용을 브라우저에 밀어보냄 + 버퍼 비움

7.void close() : flush 후 out 객체를 종료

*/