package Test1;

public class Rec extends Shape {
    double length;
    double width;
    public Rec(double length,double width){
        this.length = length;
        this.width  = width;
    }
    double getArea() {
        return length*width;
//        return 0;
    }
}
