public class Manager extends Employee implements Add {
    String level;
    Manager(String name , String address , String ID , double wage , int WorkYears,String level)
    {
    super(name, address, ID, wage, WorkYears);
    this.level = level;
    }
    public void addVage(){
        this.wage = wage*1.2;
    }
    public void print(){
        System.out.println("name: "+name+" address: "+address+" id: "+ID+" vage: "+wage+" workAge: "+WorkYears+" level: "+level);
    };
}
