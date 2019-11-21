public class Division {

    public void getQuotient(double n ,double m) throws ArithmeticException
    {
        double quotient;
        if(m ==0)
        {
            throw new ArithmeticException(m);

        }
        quotient = n/m;
        System.out.println(n+"除以"+m+"的结果为："+quotient);
    }


}
