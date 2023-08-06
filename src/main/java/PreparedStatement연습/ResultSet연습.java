package PreparedStatement연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSet연습 {
    public static void main(String[] args) {
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; //ResultSet은 커서라고 생각하는게 편하다

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);

            String sql = "SELECT st_name,st_AVG FROM student";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            boolean result = rs.next(); //레코드가 1개라도 있으면 true / 없으면 false
                                        //next가 들어가면 아래줄으로 커서가 이동한다고 생각
            String name;
            double avg;

            name = rs.getString("st_name");// 현재위치 레코드의 st_name 항목의 값을 String형태로 갖다줘
            avg = rs.getDouble("st_AVG"); //현재위치 레코드의 st_AVG 항목의 값을 Double형태로 갖다줘
            System.out.println(name + " / " + avg + "점");
                               //(String) : 항목이름
                               //(int) : 몇번째 항목 (항목 이름을 모를 때 )
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