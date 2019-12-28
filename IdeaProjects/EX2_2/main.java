/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Car car01 = new Car("zhaotong",0);
		System.out.print("当前速度为：");
		car01.changeSpeed(20);
		System.out.print("车主为：");
		car01.changeName("好友");
		System.out.print("停车后，车速为：");
		car01.stop();
	}

}
