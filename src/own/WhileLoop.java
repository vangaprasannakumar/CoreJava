package own;
import java.util.Scanner;
public class WhileLoop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter PIN");
		
		short p = input.nextShort();

		while(p!=1433) {
			if(p>=9999 || p<=999) {
			System.out.println("Enter only 4 Digits PIN"+"\nTry again");
			p = input.nextShort();
			}
			else if (p!=1433) {
				System.out.println("The PIN incorrect. Try again");
				p = input.nextShort();
			}
		}
		System.out.println("Correct PIN");
	}		
}

