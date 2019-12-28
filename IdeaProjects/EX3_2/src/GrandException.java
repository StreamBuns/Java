public class GrandException extends  Exception
{
    String message;
    public GrandException(double grand)
    {
        message = "输入成绩为："+(int)grand+"。小于0或者大于100。错误！";

    }
    public String getMessage()
    {
        return message;
    }


}
