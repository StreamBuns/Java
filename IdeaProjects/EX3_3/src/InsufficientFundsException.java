public class InsufficientFundsException extends Exception
{
    String message;
    InsufficientFundsException(double money,double balance)
    {
        message = "您的取款金额为"+money+"，但是账户余额仅为"+balance+"，操作不合法！";
    }
    InsufficientFundsException(double money)
    {
        message = "您存款金额为"+money+"是负数，操作不合法！";
    }
    public String getMessage()
    {
        return message;
    }
}
