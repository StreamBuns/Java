public class Point {

    double x;
    double y;

     Point()
     {
         x = 0;
         y = 0;
     }
     Point(double x, double y ) {
        this.x = x;
        this.y = y;
    }
    Point(Point p)
    {
        x = p.getX();
        y = p.getY();
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    //     Point(const Point & p)
//     {
//         x = p.x;
//         y = p.y;
//     }

}
