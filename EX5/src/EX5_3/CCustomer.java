package EX5_3;

class CCustomer extends Thread // CCustomer类，继承自Thread类
{
    public void run() {    // run() method
        for (int i = 1; i <= 3; i++)
            Bank.add(100);  // 将100元分三次汇入
    }
}
