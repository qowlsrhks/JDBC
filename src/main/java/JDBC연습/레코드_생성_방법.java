package JDBC연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class 레코드_생성_방법 {
    public static void main(String[] args) {
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);

            ps = con.prepareStatement("INSERT INTO account VALUES('홍길동',acc_seq.NEXTVAL,'skswlsrhks@naver.com',2000,SYSDATE)");
            ps.execute(); // COMMIT이 자동으로 실행 된다

            ps = con.prepareStatement("INSERT INTO account VALUES('고길동',acc_seq.NEXTVAL,'skswlsrhks@nate.com',1500,SYSDATE)");
            ps.execute();

            ps = con.prepareStatement("INSERT INTO account VALUES('김피카츄',acc_seq.NEXTVAL,'ohigogo5@naver.com',20000,SYSDATE)");
            ps.execute();

            System.out.println("레코드 생성 완료");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
