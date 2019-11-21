package EX6_1;

public class Person {
    String name;
    String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

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
    public String toString(){
        return "姓名："+name+" 身份证号："+ID;
    }
}
