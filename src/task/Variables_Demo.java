package task;

class Student{
	String name;
	short id;
	long number;
	double marks;
	char grade;
	static String college;
	static int clgcode;
}
public class Variables_Demo {
	
	public static void main(String[] args) {
		Student lucky=new Student();
		lucky.name="V. Prasanna Kumar";
		lucky.id=124;
		lucky.marks=968.4;
		lucky.grade='A';
		lucky.number=919963961371l;
		Student.college="MIST";
		Student.clgcode=9790;
		
		System.out.println("Name 		=  "+lucky.name);
		System.out.println("ID 		=  "+lucky.id);
		System.out.println("Number 		=  +"+lucky.number);
		System.out.println("Marks 		=  "+lucky.marks);
		System.out.println("Grade 		=  "+lucky.grade+"+");
		System.out.println("College Name 	=  "+Student.college);
		System.out.println("College code 	=  "+Student.clgcode);
	}
}
