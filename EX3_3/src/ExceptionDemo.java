import java.util.Scanner;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入账户初始金额：");
        double number = scanner.nextDouble();
        Bank bank = new Bank(number);
        System.out.println("请输入操作：\n1:存款。\n2:取款\n3:显示余额\n其他输入均为退出");
        int oprate = scanner.nextInt();
        try
        {
            for(;;)
            {
                if (oprate == 1)
                {
                    System.out.println("请输出存款金额：");
                    number = scanner.nextDouble();
                    bank.deposite(number);
                    System.out.println("您当前存款："+number+"。您账户的余额为："+bank.showBalance()+"。");
                    System.out.println("请输入接下来的操作：\n1:存款。\n2:取款\n3:显示余额\n其他输入均为退出");
                    oprate = scanner.nextInt();
                }
                else if (oprate == 2)
                {
                    System.out.println("请输出取款金额：");
                    number = scanner.nextDouble();
                    bank.withdrawal(number);
                    System.out.println("您当前取款："+number+"。您账户的余额为："+bank.showBalance()+"。");
                    System.out.println("请输入接下来的操作：\n1:存款。\n2:取款\n3:显示余额\n其他输入均为退出");
                    oprate = scanner.nextInt();
                }
                else if(oprate == 3)
                {
                    System.out.println("您账户的余额为："+bank.showBalance()+"。");
                    System.out.println("请输入接下来的操作：\n1:存款。\n2:取款\n3:显示余额\n其他输入均为退出");
                    oprate = scanner.nextInt();
                }
                else
                {
                    break;
                }
            }
        }catch (InsufficientFundsException e)
        {
          System.out.println(e.getMessage());
        }
        finally {
            System.out.println("操作退出！");
        }
    }
}
