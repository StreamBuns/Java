import java.awt.*;
import java.util.Scanner;
//import MyLine;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

    Point p1 = new Point(1.0,2.0);
//    //用来测试两个参数的构造
//    Point p2 = new Point(p1);
//    //用来测试拷贝构造
//    Point p3 = new Point();
//    //用来测试没有参数构造
//    System.out.println(p1.x+" "+p2.x+" "+p3.x);



        MyLine l1,l2,l3;
        l1 = new MyLine(1.0,1.0,2.0,1.0);
//        l2 = new MyLine(l1);
//        l3 = new MyLine(2.1,1.0,3.1,1.0);
//        l1.print();
//        l2.print();
//        l3.print();
        //用来测试有参数构造，拷贝构造，无参数构造；


//        if(l1.check() == false)
//            System.out.println("This line is not in the first quadrant");
//        else System.out.println("This line is in the first quadrant");
        //test this line is or not in the first quadrant


//       if(l1.intersect(l3) == false)
//           System.out.println("The two lines do not intersect");
//       else  System.out.println("The two lines  intersect");
    //test two lines do or not intersect


        System.out.println(l1.distance(p1));
        //distance bewteen point and line



   }
}
