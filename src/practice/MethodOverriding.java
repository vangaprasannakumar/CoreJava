package practice;

class Car {
    void cost ( ) {
        System.out.println("No cost");
   }
    void milage ( ) {
        System.out.println("No milage");
   }
}
class Audi extends Car {
    void cost ( ) {
        System.out.println("Audi cost is 50lakhs");
   }
    void milage ( ) {
        System.out.println ("Audi milage is 15km" ) ;
    }
}
class Bmw extends Car {
    void cost ( ) {
        System.out.println("Bmw cost is 40lakhs");
   }
    void milage ( ) {
        System.out.println("Bmw milage is 10km");
    }
}
public class MethodOverriding {

	public static void main(String[] args) {
		Car x=new Car();
		x.cost();
		x.milage();
		System.out.println("-------");
		x = new Audi();
		x.cost();
		x.milage();
		System.out.println("-------");
		x = new Bmw();
		x.cost();
		x.milage();
	}
}