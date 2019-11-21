package EX5_2;

public class EX5_2 {
    public static void main(String args[]) {
        RailwayStation r = new RailwayStation(1000);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        Thread t5 = new Thread(r);
        Thread t6 = new Thread(r);
        Thread t7 = new Thread(r);
        Thread t8 = new Thread(r);
        Thread t9 = new Thread(r);
        Thread t10 = new Thread(r);

        t1.setName("1号窗口");
        t2.setName("2号窗口");
        t3.setName("3号窗口");
        t4.setName("4号窗口");
        t5.setName("5号窗口");
        t6.setName("6号窗口");
        t7.setName("7号窗口");
        t8.setName("8号窗口");
        t9.setName("9号窗口");
        t10.setName("10号窗口");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }

}
