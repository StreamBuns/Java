package EX5_3;

public class Bank {
    private static int sum = 0;

    public static void add(int n) {
        int tmp = sum;
        tmp = tmp + n;   // 累加汇款总额
        try {
            Thread.sleep((int) (10000 * Math.random()));  // 小睡几秒钟
        } catch (InterruptedException e) {
        }
        sum = tmp;
        System.out.println("sum= " + sum);
    }

}
