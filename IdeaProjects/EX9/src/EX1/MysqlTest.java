package EX1;

import javax.xml.transform.Result;
import java.sql.*;
import java.lang.*;
public class MysqlTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "4672zhao");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
        }
        System.out.println("Hello World!");
    }
}
