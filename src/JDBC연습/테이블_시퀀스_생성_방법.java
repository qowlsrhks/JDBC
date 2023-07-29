package JDBC연습;//JABA로 테이블과 시퀀스 생성 방법
//자바 버전이랑 맞는 jar를 다운 받아서 프로젝트에 적용 시켜줘야 에러가 발생하지않음 프로젝트+F 라이브러리에 jar 파일 추가


import java.sql.*;

public class 테이블_시퀀스_생성_방법 {
    public static void main(String[] args) {
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "CREATE TABLE account(  name VARCHAR2(20), " +
                "no NUMBER, " +
                "email VARCHAR2(20)," +
                " point NUMBER," +
                " regdate DATE)";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);
            ps = con.prepareStatement(sql);

            ps.execute();
            System.out.println("테이블 생성 완료");

            ps = con.prepareStatement("CREATE SEQUENCE acc_seq NOCACHE");
            ps.execute();
            System.out.println("시퀀스 생성 완료");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(ps != null){
                ps.close();
                }
                if(con != null){
                con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}