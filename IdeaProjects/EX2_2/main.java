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
		// TODO �Զ����ɵķ������
		Car car01 = new Car("zhaotong",0);
		System.out.print("��ǰ�ٶ�Ϊ��");
		car01.changeSpeed(20);
		System.out.print("����Ϊ��");
		car01.changeName("����");
		System.out.print("ͣ���󣬳���Ϊ��");
		car01.stop();
	}

}
