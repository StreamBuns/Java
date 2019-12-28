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
    int[] intarr = new int[4];
    int posi=0;

    public WorkShop(int part){
        this.part = part;

    }

    public synchronized void sell(){
        if(part>0){

            String CurrenName = Thread.currentThread().getName();
            posi= Integer.valueOf(CurrenName)-1;
            intarr[posi]++;
            part--;

        }


    }
    public void run() {
        while(part>0){
            sell();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
