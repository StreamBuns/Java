package EX6_3;

import java.util.HashMap;
import java.util.Scanner;

public class PracticeMap {
    public static void main(String[] args) {
        HashMap hashmap = new HashMap();
        String name;
        int ID;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入十位同学的姓名，ID\n");
        for(int i =0;i<10;i++)
        {
            name = scanner.next();
            ID = scanner.nextInt();
//            Person temp = new Person(name,ID);
            hashmap.put(ID,name);
        }
        System.out.println("请输入操作指令:\n1:输入ID查询姓名\n2:退出\n");
        ID = scanner.nextInt();
        while(ID!=2)
        {
            if(ID==1)
            {
                System.out.println("输入ID:");
                ID = scanner.nextInt();
                System.out.println(hashmap.containsKey(ID)? (String) hashmap.get(ID):"不存在");
            }
            else if(ID==2)
            {
                break;
            }
            System.out.println("请输入操作指令:\n1:输入ID查询姓名\n2:退出\n");
            ID = scanner.nextInt();
        }

    }


}
