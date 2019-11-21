package EX6_1;

public class Teacher extends Person {
    String name;
    String ID;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, String ID, int salary) {
        super(name,ID);
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
    public String toString(){
        return "姓名："+name+" 身份证号："+ID+" 工资："+salary;
    }

}
