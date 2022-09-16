package practice;

class Employee{
	int eid ;
	double salary ;
	Employee (int eid ,double salary) {
	    this.eid = eid;
	    this.salary = salary;
	}
	void show() {
	    System.out.println ("this = "+this);
	    System.out.println ("Id = "+eid);
	    System.out.println ("salary = "+salary);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee shiva = new Employee(1023,45000);
		System.out.println("shiva = "+shiva);
		shiva.show();
		Employee xyz = new Employee(1024,65000);
		System.out.println ("xyz = " + xyz);
		xyz.show();
	}
}