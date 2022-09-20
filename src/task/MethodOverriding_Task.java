package task;
class Institute{
	void floor(){
		System.out.println("No Floor");
	}
	void classes() {
		System.out.println("No Class");
	}
}
class C_Block extends Institute{
	void floor(){
		System.out.println("C Block have 3 floors");
	}
	void classes() {
		System.out.println("C Block have total 16 Classes");
	}
}
class E_Block extends Institute{
	void floor(){
		System.out.println("E Block have 2 floors");
	}
	void classes() {
		System.out.println("E Block have total 12 Classes");
	}
}
public class MethodOverriding_Task {

	public static void main(String[] args) {
		Institute i=new Institute();
		i.floor();
		i.classes();
		System.out.println("-------");
		i = new C_Block();
		i.floor();
		i.classes();
		System.out.println("-------");
		i = new E_Block();
		i.floor();
		i.classes();
	}
}
