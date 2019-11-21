package EX13_2;

import java.io.*;
import java.net.*;
import java.lang.*;

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
//               while(true)
//               {
                byte[] buf = new byte[1024];
                int len = in.read(buf);
                   String s = new String(buf,0,len);
                   System.out.println("服务器收到："+s);

           }catch (Exception e)
           {
               System.out.println("服务器下线！");
           }
        } catch (IOException e) {
            System.out.println("申请端口失败！");
        }
    }
}
