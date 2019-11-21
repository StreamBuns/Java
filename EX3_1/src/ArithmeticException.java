public class ArithmeticException extends Exception {
    String message;
    public ArithmeticException(double zero)
    {
        message = "除数为："+zero+"错误！";
    }
    public String getMessage()
    {
        return message;
    }
}
