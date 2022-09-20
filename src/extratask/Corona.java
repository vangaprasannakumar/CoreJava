package extratask;

import java.util.Arrays;
import java.util.List;

public class Corona {

	public static void main(String[] args) {
		
		Patient p1= new Patient("p1", 20, "corona", 17000);
		Patient p2= new Patient("p2", 30, "fever", 7000);
		Patient p4= new Patient("p3", 40, "corona", 8000);
		Patient p3= new Patient("p4", 50, "corona", 12000);
		
		List<Patient> patients = Arrays.asList(p1,p2,p3,p4);
		
		patients.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println);
	}

}
