package PreparedStatement연습;
/*
java.sql.PreparedStatement
-자바에서 SQL 쿼리를 실행 할떄 사용하는 클래스

PreparedStatement의 setString(),setInt(),setDouble()
                ->쿼리문이 유동적인 경우 '?'로 대체가능
'?'에 대체할 데이터가 문자열이라면setString()을,정수라면 setInt(),실수라면 setDouble()등을 사용

예)
ps = con.preparedStatement("SELECT * FROM student WHERER st_name = ? AND st_NO = ?");
ps.setString(1,"홍길동"); 1번 물음표 자리에 "홍길동"을 String 형태로 삽입하라(외따옴표 추가됨)
ps.setInt(2,3); 2번 물음표 자리에 3을 int형태로 삽입하라


PreparedStatement의excute(),executeUpdate(),executeQuery()
1.boolean execute()
        -쿼리를 실행한 뒤, 리턴되는 결과가 ResultSet 객체면 true,int형 정수거나 결과값이 없으면 false

2.int executeUpdate()
        -쿼리를 실행한 뒤, 적용된 행의 개수를 return

3.ResultSet executeQuery()
        -쿼리를 실행한 뒤, 조회된 결과를 ResultSet에 담아 테이블 형태로 return
*/