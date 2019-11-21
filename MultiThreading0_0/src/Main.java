public class Main {

    public static void main(String[] args) {
//        Runtime rt = Runtime.getRuntime();
//        System.out.println(rt.availableProcessors());
//        System.out.println("Hello World!");
        MultiThreading mt = new MultiThreading();
        mt.start();;
        for(int i=0;i<10;i++)
        System.out.println("Main：你好！");
    }
}
