package EX13_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client1{
    public static void main(String[] args) {
        try {
            InetAddress Add1 = InetAddress.getLocalHost();//用于获取本机的地址,本机作为服务器
            try {
                Socket mySocket = new Socket(Add1.getHostAddress(), 9527);
                DataInputStream in = new DataInputStream(mySocket.getInputStream());
                DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());
                String f = "zhaotong",Time = "time";
                Scanner scanner = new Scanner(System.in);
                byte[] buf = new byte[1024];
                Date data = new Date();
                DateFormat df = DateFormat.getDateTimeInstance();
                while (true) {

                    System.out.println(df.format(data)+"\n现在可以发送消息\n如果发送Exit指令退出聊天");

                    f = scanner.nextLine();
                    out.write(f.getBytes());

                    int len = in.read(buf);
                    String s = new String(buf, 0, len);
                    System.out.println(df.format(data)+"\n收到消息：" + s+"\n");

                    if(s.equals("Exit"))
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
