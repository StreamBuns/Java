package EX6_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class PracticeSet {
    public static void main(String[] args) {
        Person p1 = new Person("张三",12310001);
        Person p2 = new Person("李四",12320002);
        Person p3 = new Person("王五",12330003);
        Person p4 = new Person("王五",12330003);
        HashSet<Person> hashset = new HashSet<Person>();
        hashset.add(p1);
        hashset.add(p2);
        hashset.add(p3);
        hashset.add(p4);
        System.out.println(hashset.size());
        System.out.println(hashset.add(p4));

        Iterator it1 =hashset.iterator();
        while(it1.hasNext())
        {
            Person temp = (Person)it1.next();
            System.out.println(temp.toString());
        }
        TreeSet<Person> treeset = new TreeSet<Person>();
        treeset.add(p1);
        treeset.add(p2);
        treeset.add(p3);
        treeset.add(p4);
        System.out.println(treeset.add(p4));
        Iterator it2 =treeset.iterator();
        while(it2.hasNext())
        {
            Person temp = (Person)it2.next();
            System.out.println(temp.toString());
        }
//        hashset.add(p5);


    }

}
