package Test3;

public class TestThread {
    public static void main(String[] args) {
    WorkShop ws = new WorkShop(800);
//    String name;
//   try{

//       WorkShop warr1 = new WorkShop(1);
//       WorkShop warr2 = new WorkShop(2);
//       WorkShop warr3 = new WorkShop(3);
//       WorkShop warr4 = new WorkShop(4);


//       warr1.start();
//       warr2.start();
////       warr3.start();
////       warr4.start();
//
//        warr1.count();
//        warr2.count();
//        warr3.count();
//        warr4.count()
    Thread t1 =new Thread(ws);
    Thread t2 =new Thread(ws);
    Thread t3 =new Thread(ws);
    Thread t4 =new Thread(ws);

    t1.setName("1");
    t2.setName("2");
    t3.setName("3");
    t4.setName("4");

    t1.start();
    t2.start();
    t3.start();
    t4.start();

//    while(true){
//    if(!t1.isAlive()&&t2.isAlive()&&t3.isAlive()&&t4.isAlive()){
////System.out.println("一号车间"+ws.number.get(ws.name.indexOf("一号车间")));
////System.out.println("二号车间"+ws.number.get(ws.name.indexOf("二号车间")));
////System.out.println("三号车间"+ws.number.get(ws.name.indexOf("三号车间")));
////System.out.println("四号车间"+ws.number.get(ws.name.indexOf("四号车间")));
// System.out.println("一号车间"+ws.intarr[0]);
//System.out.println("二号车间"+ws.intarr[1]);
//System.out.println("三号车间"+ws.intarr[2]);
//System.out.println("四号车间"+ws.intarr[3]);
//     break;}}
//
//
//    System.out.println("一号车间"+"一号车间"+"一号车间"+"一号车间");
//    }catch (InterruptedException e){
//       e.printStackTrace();;
//   }
    }
}
