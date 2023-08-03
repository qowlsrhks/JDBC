package PreparedStatement연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class execuet {
    public static void main(String[] args) {
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);

            String sql = "UPDATE student SET st_kr = 80";
            ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result+"행에 적용되었습니다");

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
