package EX13_3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(6000);
            byte[] buf = new byte[6000];
            DatagramPacket dp = new DatagramPacket(buf,1024);
            ds.receive(dp);
            System.out.println(new String(buf,0, dp.getLength()));
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
