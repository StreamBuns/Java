package Test3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class WorkShop implements Runnable{
   static public int part=800;
//    Map<String,Integer> map = new HashMap<String, Integer>();
//    LinkedList<String> name = new LinkedList<String>();
//    LinkedList<Integer> number =new LinkedList<Integer>();
//    int[] intarr = new int[4];
    int posi=0;

    public WorkShop(int part){
        this.part = part;

    }

    public synchronized boolean sell(){
        if(part>0){

//            String CurrenName = Thread.currentThread().getName();

//            posi= Integer.valueOf(CurrenName)-1;
//            intarr[posi]++;
            System.out.println(Thread.currentThread().getName()+" "+part);
            part--;
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    return false;
    }
    public void run() {
        int n=0;
        while(part>0){
            if(sell())n++;

        }
    System.out.println(Thread.currentThread().getName()+" "+n);
    }
}
