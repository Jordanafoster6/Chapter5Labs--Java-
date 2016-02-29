import java.util.Scanner;

public class populationDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		population pop1 = new population();
		
		System.out.print("What's the starting size of the population?");
		pop1.setStartNum(keyboard.nextInt());
		while(pop1.getStartNum() < 2)
		{
			System.out.print("Error, you entered a population less than 2 \n");
			System.out.print("Please enter the starting size of the population. (must be more than 2) \n");
			pop1.setStartNum(keyboard.nextInt());
		}
		keyboard.nextLine();
		
		System.out.print("What's the average daily increase percentage?");
		pop1.setDailyIncrease(keyboard.nextDouble());
		while(pop1.getStartNum() <= 0)
		{
			System.out.print("Error, you entered a increase percentage less than 0. \n");
			System.out.print("Please enter a daily population increase number. (cannot be less than zero) \n");
			pop1.setDailyIncrease(keyboard.nextDouble());
		}
		keyboard.nextLine();
		
		System.out.print("What's the number of days they will multiply?");
		pop1.setdaysToMultiply(keyboard.nextInt());
		while(pop1.getStartNum() < 1)
		{
			System.out.print("Error, you entered an invalid number of days to multiply. \n");
			System.out.print("Please enter the number of days they will multiply. (cannot be less than 1) \n");
			pop1.setdaysToMultiply(keyboard.nextInt());
		}
		keyboard.nextLine();
		
		pop1.populationIncrease();

		keyboard.close();
	}

}
