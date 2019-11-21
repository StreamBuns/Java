package EX13_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket mySocket = new Socket("127.0.0.1", 9527);
            DataInputStream in = new DataInputStream(mySocket.getInputStream());
            DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());

            while(true) {
                String s = "zhaotong";
                System.out.println(s);
                out.write(s.getBytes());
                char i = in.readChar();
                System.out.println("客户收到：" + i);

            }
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
