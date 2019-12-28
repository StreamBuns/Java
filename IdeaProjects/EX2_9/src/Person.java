public class Person  {
    String name;
    String address;
    Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    Person()
    {
        name = "";
        address = "";
    }
     public void print(){
        System.out.println("name: "+name+" address: "+address);
     };
}
