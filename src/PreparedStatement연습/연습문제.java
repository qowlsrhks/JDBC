package PreparedStatement연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class 연습문제 {
    public static void main(String[] args) {
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);

            sql = "SELECT st_NAME,st_KR,st_NO,st_AVG FROM student WHERE st_AVG >= 80";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            String name;
            int KR;
            int NO;
            double AVG;

            System.out.println("==========1번 문제=========");

            while (rs.next()) {
                name = rs.getString("st_NAME");
                KR = rs.getInt("st_KR");
                NO = rs.getInt("st_NO");
                AVG = rs.getDouble("st_AVG");

                System.out.println("이름 :" + name);
                System.out.println("국어 점수 :" + KR);
                System.out.println("학번 :" + NO);
                System.out.println("평균 점수 :" + AVG + "점");
            }
            rs.close();
            ps.close();

            System.out.println("=========2번 문제==========");

            sql = "SELECT st_NAME,st_NO,st_TEL FROM student WHERE st_name LIKE '김%' ORDER BY st_NAME ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("이름: " + rs.getString("st_name"));
                System.out.println("학번:"+ rs.getString("st_NO"));
                System.out.println("연락처:"+rs.getString("st_TEL"));
                System.out.println(     );
            }
            rs.close();
            ps.close();

            //가장 나중에 등록한 학생
            System.out.println("=========3번 문제=========");

            sql = "DELETE FROM student WHERE st_REGDATE = (SELECT MAX (st_REGDATE) FROM student)";
            ps = con.prepareStatement(sql);
//            System.out.println(ps.executeUpdate() +"개 레코드가 삭제되었습니다");

            ps.close();

            System.out.println("===========4번 문제==========");

            sql = "SELECT st_name,st_avg from student WHERE st_avg = (SELECT MAX(st_avg)FROM student)";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            rs.next();

            System.out.println("1등의 이름: " + rs.getString("st_name"));
            System.out.println("1등의 평균점수: " + rs.getString("st_avg"));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
