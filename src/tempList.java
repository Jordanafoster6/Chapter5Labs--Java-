import java.util.Scanner;

public class tempList {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter to see the temperature table.");
		String temp = keyboard.nextLine();
		
		for(int c = 0; c <= 20; c++)
		{
			int fahr = ((9/5 * c) + 32);
			System.out.printf("Celcius Temperature: %d = %d degrees Fahrenheit \n", c, fahr);
		}

		keyboard.close();
	}

}
