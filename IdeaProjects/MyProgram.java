
public class MyProgram {


		private int data;
		private String str;
		/**
		 * @return data
		 */
		public int getData() {
			return data;
		}
		/**
		 * @param data 要设置的 data
		 */
		public void setData(int data) {
			this.data = data;
		}
		/**
		 * @return str
		 */
		public String getStr() {
			return str;
		}
		/**
		 * @param str 要设置的 str
		 */
		public void setStr(String str) {
			this.str = str;
		}
		MyProgram(int d)
		{
			data = d;
		}
		void toStr()
		{
			str = data + "";
	/*		char arr[] = new char[20];
			int temp = data%10,i=0,cha,tempData;
			tempData = temp/10;
			
			while(tempData>=0)
			{
				arr[i++] = temp + '0';
				
			}*/
			
		}
		public static void main(String[] args) {
			// TODO 自动生成的方法存根

			MyProgram m1  = new MyProgram(20);
			m1.toStr();
			System.out.println(m1.getData()+m1.getStr());
			m1.setData(10);
			m1.setStr("zhaotong");
			System.out.println(m1.getData()+m1.getStr());
		}
}
