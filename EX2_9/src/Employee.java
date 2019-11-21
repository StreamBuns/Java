public class Employee extends Person implements Add {
    String ID;
    double wage;
    int WorkYears;
    Employee(String name , String address , String ID , double wage , int WorkYears)
    {
        super(name,address);
        this.ID = ID;
        this.wage = wage;
        this.WorkYears = WorkYears;
    }
    Employee()
    {
        super("","");
        this.ID = "";
        this.wage = 0.0;
        this.WorkYears = 0;
    }
    public void addVage(){
        this.wage = wage*1.1;
    }
    public void print(){
        System.out.println("name: "+name+" address: "+address+" id: "+ID+" vage: "+wage+" workAge: "+WorkYears);
    };
}
