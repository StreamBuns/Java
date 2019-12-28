package EX13_2;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket myServerSocket = new ServerSocket(9527,5);

           try {
               DataOutputStream out = null;
               DataInputStream in = null;
               Socket sc = myServerSocket.accept();
               out = new DataOutputStream(sc.getOutputStream());
               in = new DataInputStream(sc.getInputStream());
               byte[] buf = new byte[1024];
                System.out.println("服务器上线");
               while(true) {
                   int len = in.read(buf);
                   String s = new String(buf, 0, len);
                   System.out.println("服务器收到：" + s);
                   if(s.equals("Exit"))
                   {
                       s = "Bye";
                       System.out.println("服务器发出：" + s);
                       out.write(s.getBytes());
                       System.out.println("服务器下线");
                       break;
                   }
//                   if(s=="Time")
                   else if(s.equals("Time"))
                   {

                       Date data = new Date();
                       DateFormat df = DateFormat.getDateTimeInstance();
                       s = df.format(data);
                       System.out.println("服务器发出：" +s);
                       out.write(s.getBytes());
                   }
                   else
                   {
                       s = "指令错误，请重新输入";
                       System.out.println("服务器发出：" +s);
                       out.write(s.getBytes());
                   }


               }
           }catch (Exception e)
           {
               System.out.println("服务器下线！");
           }
        } catch (IOException e) {
            System.out.println("申请端口失败！");
        }

    }
}
