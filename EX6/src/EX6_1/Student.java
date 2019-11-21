package EX6_1;

public class Student extends Person {
    String name;
    String ID;
    int chineseGrade,mathGrade,englishGrade;

    public Student(String name, String ID, int chineseGrade, int mathGrade, int englishGrade) {
        super(name, ID);
        this.name = name;
        this.ID = ID;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }
    public String toString(){
        return "姓名："+name+" 身份证号："+ID+" 语文："+chineseGrade+" 数学："+mathGrade+" 英语："+englishGrade;
    }
}
