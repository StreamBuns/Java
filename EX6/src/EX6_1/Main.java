package EX6_1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("张三","12310001");
        Student s1 = new Student("李四","12320002",89,93,94);
        Teacher t1 = new Teacher("王五","12330003",4000);
        LinkedList<Person> list =  new LinkedList<Person>();
        list.add(p1);
        list.add(s1);
        list.add(t1);
        list.addFirst(t1);
        list.addLast(t1);
        list.removeFirst();
        list.removeLast();

        for(int i =0;i<list.size();i++)
        {
            Person temp = list.get(i);
            System.out.println(temp.toString());
        }
//        System.out.println("Hello World!");
    }
}
