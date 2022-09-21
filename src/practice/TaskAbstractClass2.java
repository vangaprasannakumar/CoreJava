package practice;
//Topic :- Parameterized constructor  Constructor in Abstract Class
import java.util.Scanner;

abstract class Numbers{
	int num1; int num2;
	Scanner input = new Scanner(System.in);
	Numbers(int num1,int num2){
		System.out.println("Enter 2 numbers");
	}
	abstract void a();
	void print() {
		System.out.println("-------");
	}
}
class Add extends Numbers{
	Add() {
		super(0,0);
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("Addition = "+(num1+num2));
	}
	void a() {
		System.out.println("11111");
	}
}
class Multiplication extends Numbers{
	Multiplication(){
		super(20,1);
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("Multiplication = "+(num1*num2));
	}
	
	void a() {
		System.out.println("22222");
	}
}
public class TaskAbstractClass2 {

	public static void main(String[] args) {
		Numbers n;
		n = new Add ();
		n.a();
		n.print();
		n = new Multiplication ();
		n.a();
		n.print();
	}
}
