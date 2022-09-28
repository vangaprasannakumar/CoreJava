package own;
import java.util.Scanner;
import java.util.InputMismatchException;

public class WhileLoop {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter PIN");
		
		short p = input.nextShort();
		try {
			if(p>=9999 || p<=999) {
				System.out.println("Enter only 4 Digits PIN"+"\nTry again");
				p = input.nextShort();
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Enter only 4 Digits PIN\"+\"\\nTry again");
			
		}
		while(p!=1433)
		{
			
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

