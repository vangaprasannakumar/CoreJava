package practice;
import java.util.Scanner;

class Sum {
	   void add (int x, int y) {
	    System.out.println ("Integer sum = "+(x+y)) ;
	   }
	   void add (float x, float y) {
	   System.out.println ("Decimal sum = "+(x+y));
	   }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Sum s = new Sum();
		
		System.out.println("Enter two values");
		s.add(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter two values");
		s.add(sc.nextFloat(), sc.nextFloat());
	}
}