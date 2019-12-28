public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("zhangsan","Beijing","0001",1000,2);
        Manager m1 = new Manager("lisi","Shanghai","0002",1000,2,"P2");
        e1.print();
        e1.addVage();
        e1.print();
        m1.print();
        m1.addVage();
        m1.print();
//        System.out.println("Hello World!");
    }
}
