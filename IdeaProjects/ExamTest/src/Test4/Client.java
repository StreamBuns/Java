package Test4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        // write your code here
        try {
            InetAddress serverAdress = InetAddress.getLocalHost();
            Socket sc = new Socket("10.238.113.225",9000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());
            byte[] buff = new byte[1024];
            while(true){
                out.write("zhaotong".getBytes());
                int len = in.read(buff);
                String s = new String(buff,0,len);
            }
        }catch (UnknownHostException ue){
            ue.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
