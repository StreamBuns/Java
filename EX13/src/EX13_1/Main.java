package EX13_1;

import java.net.*;
public class Main {

    public static void main(String[] args) {
        try {
            InetAddress Add1 = InetAddress.getLocalHost();

            InetAddress Add2 = InetAddress.getByName("www.nwsuaf.edu.cn");
            System.out.println("学校的IP地址："+Add2.getHostAddress());
            System.out.println("本机的IP地址："+Add1.getHostAddress());
            System.out.println("本机的名字："+Add1.getHostName());
        }catch (UnknownHostException u)
        {
            u.printStackTrace();
        }
//        System.out.println("Hello World!");
    }
}
