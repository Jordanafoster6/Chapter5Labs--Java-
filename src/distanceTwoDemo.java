import java.util.Scanner;
import java.io.*;

public class distanceTwoDemo {

	public static void main(String[] args) throws IOException {

		//creating objects
		Scanner keyboard = new Scanner(System.in);
		distance mph1 = new distance();
		
		//setting mph
		System.out.print("How fast were you going? (MPH).");
		mph1.setMPH(keyboard.nextInt());
		
		//validating mph
		while(mph1.getMPH() < 0)
		{
			System.out.println("Error, you entered a number below 0.");
			System.out.println("Please enter a valid number of hours.");
			mph1.setHours(keyboard.nextInt());
		}
		//setting hours
		System.out.print("How long did it take to go the distance traveled? (hours).");
		mph1.setHours(keyboard.nextInt());
		
		//validating hours
		while(mph1.getHours() < 0)
		{
			System.out.println("Error, you entered a number below 0.");
			System.out.println("Please enter a valid number of hours.");
			mph1.setHours(keyboard.nextInt());
		}
		
		keyboard.nextLine();
		
		//get filename
		System.out.print("Enter the filename:");
		String filename = keyboard.nextLine();
		
		//open file
		PrintWriter outputFile = new PrintWriter(filename);
		
		//get data and write it to the file
		outputFile.println("----------------------------");
		for(int count = 1; count <= mph1.getHours(); ++count)
		{
			outputFile.printf("%d           %d miles \n", count, (mph1.getMPH() * count));
		}
		
		//close leaks
		outputFile.close();
		keyboard.close();

	}

}
