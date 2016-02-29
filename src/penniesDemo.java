import java.io.IOException;
import java.util.Scanner;

public class penniesDemo {

	public static void main(String[] args) throws IOException {

		double total = 0;
		double dailyWage = .01;
		//creating objects
		Scanner keyboard = new Scanner(System.in);
		pennies payment1 = new pennies();
		
		//setting mph
		System.out.print("How many days did you work?");
		payment1.setDaysWorked(keyboard.nextInt());
		
		//validating
		while(payment1.getDaysWorked() < 1)
		{
			System.out.println("Error, you entered an insufficient amount of days worked.");
			System.out.println("Please enter a valid number of days worked.");
			payment1.setDaysWorked(keyboard.nextInt());
		}
		//printing
		System.out.println("----------------------------");
		for(int count = 1; count <= payment1.getDaysWorked(); ++count)
		{
			total += dailyWage;
			System.out.printf("Day %d           %.2f \n", count, dailyWage);
			dailyWage *=2;
		}
		
		System.out.printf("You've made $%.2f",total);
		keyboard.close();
		
		
		
		
		
		
	}
}
