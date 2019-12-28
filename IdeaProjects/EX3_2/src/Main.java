public class Main {

    public static void main(String[] args)
    {
        Grand class2 = new Grand();
        System.out.println("输出数据以回车结束。");
        try
        {
            class2.inGrand();
        }
        catch (GrandException e)
        {
            System.out.println("输入成绩过程出现错误！");
            System.out.println(e.getMessage());
        }

        System.out.println("不及格人数为："+class2.unpass);
        System.out.println("及格人数为："+class2.pass);
        System.out.println("平均成绩："+class2.gerAverage());
    }
}
