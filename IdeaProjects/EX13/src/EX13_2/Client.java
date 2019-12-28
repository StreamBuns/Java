package EX13_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            InetAddress Add1 = InetAddress.getLocalHost();//用于获取本机的地址,本机作为服务器
            try {
                Socket mySocket = new Socket(Add1.getHostAddress(), 9527);
                DataInputStream in = new DataInputStream(mySocket.getInputStream());
                DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());
                String f = "zhaotong";
                Scanner scanner = new Scanner(System.in);
                byte[] buf = new byte[1024];
                while (true) {

                    System.out.println("发送Time指令获得服务器时间\n发送Exit指令退出服务器");
//                    System.out.println(s);
                    f = scanner.nextLine();
                    out.write(f.getBytes());

//                    char i = in.readChar();
                    int len = in.read(buf);
                    String s = new String(buf, 0, len);
                    System.out.println("客户收到：" + s+"\n");
//                    System.out.println("客户收到：" + i);
                    if(s.equals("Bye"))
                        break;
                }
            } catch (IOException e) {
                System.out.println("");
            }
        }catch (UnknownHostException e)
        {
            System.out.println("连接服务器失败！");
        }
    }
}
