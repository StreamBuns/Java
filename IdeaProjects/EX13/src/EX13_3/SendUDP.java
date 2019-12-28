package EX13_3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendUDP {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            Student stu1 = new Student("2018012995","赵桐",100);
            DatagramPacket dp = new DatagramPacket(stu1.toString().getBytes(),stu1.toString().length(), InetAddress.getLocalHost(),6000);
            ds.send(dp);
            ds.close();
        }catch (SocketException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
