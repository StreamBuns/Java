
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
		System.out.println("ֻ��ȡ��"+leftmoney);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		bank ba=new bank(888123,1000);
		ba.savemoney(21000);
		System.out.println("����21000Ԫ�����Ϊ��"+ba.getleftmoney());
		ba.getmoney(11500);
		System.out.println("11500Ԫ�����Ϊ��"+ba.getleftmoney());

	}

}
