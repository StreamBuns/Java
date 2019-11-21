public class MyLine {

    Point p1;
    Point p2;
 MyLine(double x1 , double y1 , double x2 ,double y2)
 {
     p1 = new Point(x1,y1);
     p2 = new Point(x2,y2);
//     p1.x = x1;
//     p1.y = y1;
//     p2.x = x2;
//     p2.y = y2;
 }
 MyLine(Point p1,Point p2)
 {
    this.p1 = new Point(p1);
    this.p2 = new Point(p2);
//         this.p1.x = p1.x;
//         this.p1.y = p1.y;
//         this.p2.x = p2.x;
//         this.p2.y = p2.y;
 }
 MyLine()
 {
     p1 = new Point();
     p2 = new Point();
//     p1.x = 0;
//     p1.y = 0;
//     p2.x = 0;
//     p2.y = 0;
 }
 MyLine( MyLine l)
{
    this.p1 = new Point(l.p1);
    this.p2 = new Point(l.p2);
//    p1.setX(l.p1.getX());
//    p1.setY(l.p1.getY());
//    p2.setX(l.p2.getX());
//    p1.setY(l.p2.getY());
}

void print()
{
    System.out.println(p1.x+" "+p1.y+" "+p2.x+" "+p2.y);
}
public boolean check()
{
    if(p1.getX()>0&&p1.getY()>0&&p2.getX()>0&&p2.getY()>0)
    {
        return true;
    }
    else return false;
}

public double longth()
{
//    return  Math.sqrt(p1.getX());
    return Math.sqrt( (p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + (p1.getY()-p2.getY())*(p1.getY()-p2.getY()) );
}

public boolean intersect(MyLine l)
{
    if(p1.x>l.p1.x&&p2.x>l.p2.x&&p1.x>l.p2.x&&p2.x>l.p1.x||p1.y>l.p1.y&&p1.y>l.p2.y&&p2.y>l.p1.y&&p2.y>l.p2.y||p1.x<l.p1.x&&p2.x<l.p2.x&&p1.x<l.p2.x&&p2.x<l.p1.x||p1.y<l.p1.y&&p1.y<l.p2.y&&p2.y<l.p1.y&&p2.y<l.p2.y)
        return false;
    if ((((p1.x - l.p1.x)*(l.p2.y - l.p1.y) - (p1.y - l.p1.y)*(l.p2.x - l.p1.x))*
            ((p2.x - l.p1.x)*(l.p2.y - l.p1.y) - (p2.y - l.p1.y)*(l.p2.x - l.p1.x))) >= 0 ||
            (((l.p1.x - p1.x)*(p2.y - p1.y) - (l.p1.y - p1.y)*(p2.x - p1.x))*
                    ((l.p2.x - p1.x)*(p2.y - p1.y) - (l.p2.y - p1.y)*(p2.x - p1.x))) >= 0)
    {
        return false;
    }
    return true;
}
public double distance(Point p)
{
    double A ,B ,C , distance;
    A = (p1.y-p2.y)/(p1.x-p2.x);
    B = -1 ;
    C = p1.y - A*p1.x ;
    distance  = (A * p.x + B * p.y +C)/Math.sqrt(A*A+B*B);
    if(distance < 0 )
    {
        return -distance;
    }
    else return distance;
}

}
