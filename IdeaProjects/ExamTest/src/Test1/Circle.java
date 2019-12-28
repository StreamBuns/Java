package Test1;

public class Circle extends Shape {
    double radius;
    double PI = 3.1415926;
    public Circle(double radius){
        this.radius = radius;
    }
    double getArea(){
        return radius*radius*PI;
    }
}
