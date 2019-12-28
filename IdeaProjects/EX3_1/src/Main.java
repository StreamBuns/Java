import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
//        double n=3.0,m=0;
        Division division = new Division();
        try {
            division.getQuotient(3.0, 1.0);
            division.getQuotient(5.0, 6.0);
            division.getQuotient(4.5, 1.4);
            division.getQuotient(3.0, 0.0);
            division.getQuotient(5.0, 2.0);
        }catch (ArithmeticException e)
        {
            System.out.println("计算除法过程中发生下列问题：");
            System.out.println(e.getMessage());
        }
//        System.out.println("Hello World!");

    }
}
