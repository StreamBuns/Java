
public class bank {
	private long ID;
	private int leftmoney;
	bank(long i , int m)
	{
		ID = i;
		leftmoney = m;
	}
	bank()
	{
		ID = 000000;
		leftmoney = 0;
	}
	public int getleftmoney()
	{
	return leftmoney;
	}
		
	public void savemoney(double money)
	{
	leftmoney+=money;
	}
		
	public void getmoney(double money)
	{
	if(money<=leftmoney)
		leftmoney-=money;
	else
		System.out.println("只能取："+leftmoney);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		bank ba=new bank(888123,1000);
		ba.savemoney(21000);
		System.out.println("存入21000元后余额为："+ba.getleftmoney());
		ba.getmoney(11500);
		System.out.println("11500元后余额为："+ba.getleftmoney());

	}

}
