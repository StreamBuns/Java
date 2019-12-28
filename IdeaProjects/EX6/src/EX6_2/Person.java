package EX6_2;

public class Person implements Comparable {
    String name;
    int ID;

    public Person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getID() {
//        return ID;
//    }

//    public void setID(String ID) {
//        this.ID = ID;
//    }
    public String toString(){
        return "姓名："+name+" 身份证号："+ID;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ID != other.ID)
        return false;
        return true;
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ID;
        return result;
    }

    public int compareTo(Object obj) {
        Person temp = (Person)obj;
        return (this.ID-temp.ID>0)? 1:0;
    }
}
