import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.xml.transform.Result;
import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "4672zhao");
            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from Student");
            Scanner scanner = new Scanner(System.in);
            int order=0,v_age;

            String v_name,v_id,sql;
            while (true)
            {
                System.out.println("输入指令完成相应的功能：\n1：根据学号，可以查询到学生的姓名和年龄；\n2：给定学生的学号、姓名、年龄，在表中追加一行信息；\n3： 给定学生的学号，可以从表中删除该学生的信息；\n4：退出");
                order = scanner.nextInt();
               if(order ==4)
               {
                   System.out.println("退出系统!");
                   break;
               }
               else if(order==1)
               {
                   System.out.print("请输入学号：");
                   v_id = scanner.next();
                   ResultSet rs = stmt.executeQuery("select name,age from Student where Student.id = "+v_id);
                   if(rs.next())
                   System.out.println("姓名："+rs.getString(1)+"\t年龄："+rs.getInt(2));
                   else System.out.println("未查到该同学");
               }
               else if(order==2)
               {
                    System.out.println("请输入需要插入的学生的学号，姓名，年龄");
                    v_id = scanner.next();
                    v_name = scanner.next();
                    v_age = scanner.nextInt();
//                    sql="insert into Student(id,name,age) values("+v_id+","+v_name+","+v_age+")";
                    sql="insert into Student (id, name,age) values('" + v_id + "','" + v_name+ "','" +v_age+ "')";
                    stmt.executeUpdate(sql);
               }
               else if(order==3)
               {
                   System.out.print("请输入学号：");
                   v_id = scanner.next();
                   sql = "delete from Student where id = "+v_id;
                   stmt.executeUpdate(sql);
                   System.out.println("已删除学号为"+v_id+"的信息");
               }
               else{
                   System.out.println("指令错误，请重新输入：");
               }

            }
//            while(rs.next())
//            {
//                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
//            }
//            System.out.println("Hello World!");
        }


}
