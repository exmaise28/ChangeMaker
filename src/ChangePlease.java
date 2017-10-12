import java.util.Scanner;
public class ChangePlease {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		final int PENNIES = 1;
		final int NICKELS = 5;
		final int DIMES = 10;
		final int QUARTERS = 25;
		
		
		System.out.print("Enter amount of change from 1 to 99: ");
		int cents = scan.nextInt();
		
		System.out.println(cents + " cents in coins can be given as: ");
		
		int totalQuarters = cents / QUARTERS;
		cents %= QUARTERS;
		int totalDimes = cents / DIMES;
		cents %= DIMES;
		int totalNickels = cents / NICKELS;
		cents %= NICKELS;
		int totalPennies = cents / PENNIES;
		cents %= PENNIES;
		
		
		System.out.println(totalQuarters + " quarters");
		
		
		System.out.println(totalDimes + " dimes");
		
		
		System.out.println(totalNickels + " nickels and");
			

		System.out.println(totalPennies + " pennies");
		
		
		scan.close();
		
		}

	

}
