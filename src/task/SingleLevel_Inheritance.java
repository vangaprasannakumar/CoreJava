package task;
import java.util.Scanner;

class Circle {
    double r;
   Scanner sc = new Scanner ( System.in );
    void input() {
        System.out.println("Enter Radius value R");
        r = sc.nextInt();
   }
    void area() {
        System.out.println("Circle Area = "+(3.141*r*r));
    }
}
class Cylinder extends Circle {
	double h;
    void accept() {
        System.out.println("Enter Height value H");
        h = sc.nextInt();
    }
    void volume() {
        System.out.println("Cylinder Volume = "+(3.141*r*r*h));
    }
}
public class SingleLevel_Inheritance {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.input();
		c.area();
		c.accept();
		c.input();
		c.volume();
	}

}
