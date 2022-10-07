package C_com.java8;

import java.util.ArrayList;
import java.util.List;

public class Stream_Parallel {

	public static void main(String[] args) {
		List<Character> obj = new ArrayList<Character>();
		obj.add('P');
		obj.add('S');
		obj.add('K');
		obj.add('U');
		obj.add('H');
		obj.add('R');
		System.out.println("==== not in order====");
		obj.parallelStream().forEach(System.out::println);
		System.out.println("===== in order =====");
		obj.parallelStream().forEachOrdered(x->System.out.println(x));
	}

}
