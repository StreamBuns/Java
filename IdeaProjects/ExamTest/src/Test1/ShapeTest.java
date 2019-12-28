package Test1;

public class ShapeTest {

    public static void main(String[] args) {
        // write your code here
        Circle cir1 = new Circle(3.33);
        Rec rec1 = new Rec(3,4);
        Shape ShapeArray[] = new Shape[2];
        ShapeArray[0] = cir1;
        ShapeArray[1] = rec1;
        System.out.println(ShapeArray[0].getArea()+" "+ShapeArray[1].getArea());
    }

}
