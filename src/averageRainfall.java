import java.util.Scanner;

public class averageRainfall {

	public static void main(String[] args) {
		
		int yearNum = 0;
		int rainInches = 0;
		int totalInches = 0;
		int moCount = 0;
		int monthTotal = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many years of rainfall are you tracking? (must be one or more) ");
		yearNum = keyboard.nextInt();
		while(yearNum < 1)
		{
			System.out.print("Error, you entered a number of years less than 1. \n");
			System.out.print("How many years of rainfall are you tracking? (must be one or more) ");
			yearNum = keyboard.nextInt();
		}
		for (int count = 1; count <= yearNum;)
		{
			for(moCount = 1; moCount <= 12; moCount++)
			{
				System.out.printf("How much rain has fallen for month %d ? (Cannot Be Negative) ", moCount);
				rainInches = keyboard.nextInt();
				while(rainInches < 0)
				{
					System.out.print("Error, you entered a negative number of inches of rainfall. \n");
					System.out.printf("How much rain has fallen for month %d ? (Cannot Be Negative) ", moCount);
					rainInches = keyboard.nextInt();
				}
				monthTotal += 1;
				totalInches += rainInches;
			}
			count++;
		}
		System.out.print("-----------------------------------------\n");
		System.out.printf("Number of months: %d \n", monthTotal);
		System.out.printf("Total inches of rainfall: %d \n", totalInches);
		System.out.printf("Average rainfall per month: %d \n", (totalInches / monthTotal));
		System.out.print("-----------------------------------------\n");
		keyboard.close();
	}

}
