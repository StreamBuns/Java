
public class Car {
  String name;
  double speed;
  Car(String nm , double s)
  {
	  name = nm;
	  speed = s;
  }
  Car()
  {
	  speed = 0.0;
  }
  void changeName(String cnm)
  {
	  name = cnm;
	  System.out.println(name);
  }
  void changeSpeed(double cs)
  {
	  speed = cs;
	  System.out.println(speed);
  }
  void stop()
  {
	  speed = 0;
	  System.out.println(speed);	  
  }
 
}
