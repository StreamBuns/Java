package EX13_2;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Server1 {
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
                Scanner scanner = new Scanner(System.in);
                Date data = new Date();
                DateFormat df = DateFormat.getDateTimeInstance();
                System.out.println(df.format(data)+"\n上线");
                while(true) {
                    int len = in.read(buf);
                    String s = new String(buf, 0, len);
                    System.out.println(df.format(data)+"\n收到消息：" + s+"\n");
                    if(s.equals("Exit"))
                    {
//                        s = "Bye";
//                        System.out.println("服务器发出：" + s);
                        out.write(s.getBytes());
                        System.out.println(df.format(data)+"\n下线");
                        break;
                    }
                    else
                    {
                        System.out.println(df.format(data)+"\n现在可以发送消息\n如果发送Exit指令退出聊天");
                        s = scanner.nextLine();
                        out.write(s.getBytes());
//                        s = "指令错误，请重新输入";
//                        System.out.println("服务器发出：" +s);
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
