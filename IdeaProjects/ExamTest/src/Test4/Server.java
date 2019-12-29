package Test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        // write your code here
        try{
            ServerSocket ss = new ServerSocket(9000,5);
            DataInputStream in = null;
            DataOutputStream out = null;
            Socket sc = ss.accept();
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            byte[] buff = new byte[1024];
            while(true){
                int len = in.read(buff);
                String s = new String(buff,0,len);
                System.out.println("服务器收到"+s);
                if(s.equals("1")){
                    out.write(s.getBytes());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
