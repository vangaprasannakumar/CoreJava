package A2_task;
class Electronics{
	void company(){
		System.out.println("There are no.of electronic Company's");
	}
}
class Mobile extends Electronics{
	void featuers() {
		System.out.println("Mobiles are mainly used for communication");
	}
}
class iPhone extends Mobile{
	void Camera(){
		System.out.println("iPhone Mobiles are very popular for Camera");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		iPhone p = new iPhone();
		p.company();
		p.featuers();
		p.Camera();
		
	}
}
