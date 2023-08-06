package PreparedStatement연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedStatement연습 {
    public static void main(String[] args){
        String id = "C##QOWLSRHKS";
        String password = "wlsrhks0";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        Connection con = null;
        PreparedStatement ps = null;

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, id, password);

            //Student 테이블에, 입력받은 학생 이름, 연락처를 레코드에 추가하자
            Scanner sc = new Scanner(System.in);
            String name;
            String tel;

            System.out.print("학생 이름: ");
            name = sc.next();
            System.out.print("학생의 연락처: ");
            tel = sc.next();

            int KR,EN,MA;
            double AVG;

            System.out.print("국: ");
            KR = sc.nextInt();
            System.out.print("영: ");
            EN = sc.nextInt();
            System.out.print("수: ");
            MA = sc.nextInt();

            AVG = (KR+EN+MA)/ 3.0;


            String sql = "INSERT INTO student VALUES(SE_SEQ.NEXTVAL,?,?,?,?,?,?,SYSDATE)";

            ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, tel);
            ps.setInt(3, KR);
            ps.setInt(4, EN);
            ps.setInt(5, MA);
            ps.setDouble(6,AVG);

            ps.execute();
            System.out.println("학생 추가 완료");

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    con.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
