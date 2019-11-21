public class Main {

    public static void main(String[] args)
    {
        CCircle cir1=new CCircle();
        //声明一个CCircle类型的变量并给他申请空间
        cir1.setCircle(2.0,3.1416);
        //用来设置这个对象的pi和半径
        System.out.println("radius="+cir1.getRadius());
        //用来返回这个对象的半径的值
//        System.out.println("Hello World!");
    }
}
